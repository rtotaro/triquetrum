/*******************************************************************************
 * Copyright (c)  2017 Totaro Rodolfo
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Rodolfo Totaro - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.triquetrum.commands.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.triquetrum.commands.ide.contentassist.antlr.internal.InternalTqclParser;
import org.eclipse.triquetrum.commands.services.TqclGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TqclParser extends AbstractContentAssistParser {

	@Inject
	private TqclGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTqclParser createParser() {
		InternalTqclParser result = new InternalTqclParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCompositeCommandAccess().getEndAlternatives_2_0(), "rule__CompositeCommand__EndAlternatives_2_0");
					put(grammarAccess.getSimpleCommandAccess().getAlternatives_0(), "rule__SimpleCommand__Alternatives_0");
					put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
					put(grammarAccess.getParameter_idAccess().getAlternatives(), "rule__Parameter_id__Alternatives");
					put(grammarAccess.getNamedObjAccess().getAlternatives(), "rule__NamedObj__Alternatives");
					put(grammarAccess.getCategoryAccess().getAlternatives(), "rule__Category__Alternatives");
					put(grammarAccess.getTriquetrumScriptAccess().getGroup(), "rule__TriquetrumScript__Group__0");
					put(grammarAccess.getCompositeCommandAccess().getGroup(), "rule__CompositeCommand__Group__0");
					put(grammarAccess.getSimpleCommandAccess().getGroup(), "rule__SimpleCommand__Group__0");
					put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
					put(grammarAccess.getLibraryAccess().getGroup(), "rule__Library__Group__0");
					put(grammarAccess.getInsertAccess().getGroup(), "rule__Insert__Group__0");
					put(grammarAccess.getInsertAccess().getGroup_5(), "rule__Insert__Group_5__0");
					put(grammarAccess.getInsertAccess().getGroup_5_2(), "rule__Insert__Group_5_2__0");
					put(grammarAccess.getSetAccess().getGroup(), "rule__Set__Group__0");
					put(grammarAccess.getConnectAccess().getGroup(), "rule__Connect__Group__0");
					put(grammarAccess.getConnectAccess().getGroup_2(), "rule__Connect__Group_2__0");
					put(grammarAccess.getConnectAccess().getGroup_5(), "rule__Connect__Group_5__0");
					put(grammarAccess.getConnectionPortAccess().getGroup(), "rule__ConnectionPort__Group__0");
					put(grammarAccess.getGoIntoAccess().getGroup(), "rule__GoInto__Group__0");
					put(grammarAccess.getGoOutAccess().getGroup(), "rule__GoOut__Group__0");
					put(grammarAccess.getGoTopAccess().getGroup(), "rule__GoTop__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getTriquetrumScriptAccess().getLibrariesAssignment_0(), "rule__TriquetrumScript__LibrariesAssignment_0");
					put(grammarAccess.getTriquetrumScriptAccess().getCommandsAssignment_1(), "rule__TriquetrumScript__CommandsAssignment_1");
					put(grammarAccess.getCompositeCommandAccess().getStartAssignment_0(), "rule__CompositeCommand__StartAssignment_0");
					put(grammarAccess.getCompositeCommandAccess().getCommandsAssignment_1(), "rule__CompositeCommand__CommandsAssignment_1");
					put(grammarAccess.getCompositeCommandAccess().getEndAssignment_2(), "rule__CompositeCommand__EndAssignment_2");
					put(grammarAccess.getIncludeAccess().getFilenameAssignment_1(), "rule__Include__FilenameAssignment_1");
					put(grammarAccess.getLibraryAccess().getNameAssignment_1(), "rule__Library__NameAssignment_1");
					put(grammarAccess.getInsertAccess().getCategoryAssignment_1(), "rule__Insert__CategoryAssignment_1");
					put(grammarAccess.getInsertAccess().getEntityClassAssignment_2(), "rule__Insert__EntityClassAssignment_2");
					put(grammarAccess.getInsertAccess().getNameAssignment_4(), "rule__Insert__NameAssignment_4");
					put(grammarAccess.getInsertAccess().getParametersAssignment_5_1(), "rule__Insert__ParametersAssignment_5_1");
					put(grammarAccess.getInsertAccess().getParametersAssignment_5_2_1(), "rule__Insert__ParametersAssignment_5_2_1");
					put(grammarAccess.getSetAccess().getParamAssignment_1(), "rule__Set__ParamAssignment_1");
					put(grammarAccess.getConnectAccess().getFromAssignment_1(), "rule__Connect__FromAssignment_1");
					put(grammarAccess.getConnectAccess().getFromAssignment_2_1(), "rule__Connect__FromAssignment_2_1");
					put(grammarAccess.getConnectAccess().getToAssignment_4(), "rule__Connect__ToAssignment_4");
					put(grammarAccess.getConnectAccess().getToAssignment_5_1(), "rule__Connect__ToAssignment_5_1");
					put(grammarAccess.getConnectionPortAccess().getActorAssignment_0(), "rule__ConnectionPort__ActorAssignment_0");
					put(grammarAccess.getConnectionPortAccess().getPortAssignment_2(), "rule__ConnectionPort__PortAssignment_2");
					put(grammarAccess.getGoIntoAccess().getDirectionAssignment_1(), "rule__GoInto__DirectionAssignment_1");
					put(grammarAccess.getGoIntoAccess().getActorAssignment_2(), "rule__GoInto__ActorAssignment_2");
					put(grammarAccess.getGoOutAccess().getDirectionAssignment_1(), "rule__GoOut__DirectionAssignment_1");
					put(grammarAccess.getGoTopAccess().getDirectionAssignment_1(), "rule__GoTop__DirectionAssignment_1");
					put(grammarAccess.getParameterAccess().getIdAssignment_0(), "rule__Parameter__IdAssignment_0");
					put(grammarAccess.getParameterAccess().getValueAssignment_2(), "rule__Parameter__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTqclParser typedParser = (InternalTqclParser) parser;
			typedParser.entryRuleTriquetrumScript();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TqclGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TqclGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}