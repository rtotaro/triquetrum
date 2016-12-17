/*******************************************************************************
 * Copyright (c)  2016 Totaro Rodolfo
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Rodolfo Totaro - initial API and implementation and/or initial documentation
 *******************************************************************************/
/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.triquetrum.commands.ui.contentassist;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.triquetrum.commands.tqcl.Insert;
import org.eclipse.triquetrum.workflow.editor.TriqDiagramTypeProvider;
import org.eclipse.triquetrum.workflow.editor.TriqFeatureProvider;
import org.eclipse.triquetrum.workflow.editor.features.ModelElementCreateFeature;
import org.eclipse.triquetrum.workflow.model.util.PtolemyUtil;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import ptolemy.actor.CompositeActor;
import ptolemy.data.expr.Parameter;
import ptolemy.kernel.Entity;
import ptolemy.kernel.util.Attribute;
import ptolemy.kernel.util.NamedObj;
import ptolemy.kernel.util.Settable.Visibility;

/**
 * See
 * https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
public class TqclProposalProvider extends AbstractTqclProposalProvider {

	private Map<String, ModelElementCreateFeature> featuresMap = new HashMap<>();

	private void initFeatureMap() {
		if (featuresMap.isEmpty()) {
			TriqFeatureProvider featureProvider = new TriqFeatureProvider(new TriqDiagramTypeProvider());
			ICreateFeature[] createFeatures = featureProvider.getCreateFeatures();
			for (ICreateFeature feature : createFeatures) {
				if (feature instanceof ModelElementCreateFeature) {
					ModelElementCreateFeature modelfeature = (ModelElementCreateFeature) feature;
					String key = modelfeature.getGroup() + "." + modelfeature.getName();
					featuresMap.put(key, modelfeature);
				}
			}
		}
	}

	@Override
	public void completeInsert_Obj(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		initFeatureMap();

		for (String key : featuresMap.keySet()) {
			if (key.contains(" ")) {
				key = "\"" + key + "\"";
			}
			ICompletionProposal completionProposal = createCompletionProposal(key, context);
			acceptor.accept(completionProposal);
		}
	}

	@Override
	public void completeInsert_Name(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		if (model instanceof Insert) {
			Insert insert = (Insert) model;
			String name = StringUtils.substringAfterLast(insert.getObj().getName(), ".");
			if (name.contains(" ")) {
				name = "\"" + name + "\"";
			}
			ICompletionProposal completionProposal = createCompletionProposal(name, context);
			acceptor.accept(completionProposal);
		}
	}

	@Override
	public void completeInsert_Parameters(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		if (model instanceof Insert) {
			Insert insert = (Insert) model;
			String name = insert.getObj().getName();
			ModelElementCreateFeature modelElementCreateFeature = featuresMap.get(name.replaceAll("\"", ""));

			String wrappedClass = modelElementCreateFeature.getWrappedClass();
			try {

				CompositeActor ca = new CompositeActor();

				//TODO:Find a better way to do that
				List<Parameter> parameters = new ArrayList<>();
				if ("Directors".equals(modelElementCreateFeature.getGroup())) {
					Attribute director = PtolemyUtil._createAttribute(ca, wrappedClass, "autocomplention");
					parameters = director.attributeList(Parameter.class);
					
				} else {
					Entity<?> entity = PtolemyUtil._createEntity(ca, wrappedClass, null, "autocomplention");
					parameters = entity.attributeList(Parameter.class);
				}
				
				for (Parameter parameter : parameters) {
					Visibility visibility = parameter.getVisibility();

					if (!Parameter.NOT_EDITABLE.equals(visibility)) {
						ICompletionProposal completionProposal = createCompletionProposal(parameter.getName(),
								context);
						acceptor.accept(completionProposal);
					}
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	@Override
	public void complete_Parameter(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		if (model instanceof org.eclipse.triquetrum.commands.tqcl.Parameter) {
			initFeatureMap();
			org.eclipse.triquetrum.commands.tqcl.Parameter param = (org.eclipse.triquetrum.commands.tqcl.Parameter) model;
			EObject eContainer = param.eContainer();
		}

	}
}
