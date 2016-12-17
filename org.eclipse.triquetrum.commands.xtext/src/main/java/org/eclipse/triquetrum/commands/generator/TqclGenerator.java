/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.triquetrum.commands.generator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.CreateContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.swt.widgets.Display;
import org.eclipse.triquetrum.commands.services.TqclGrammarAccess.TriquetrumScriptElements;
import org.eclipse.triquetrum.commands.tqcl.Command;
import org.eclipse.triquetrum.commands.tqcl.Insert;
import org.eclipse.triquetrum.commands.tqcl.NamedObj;
import org.eclipse.triquetrum.commands.tqcl.TriquetrumScript;
import org.eclipse.triquetrum.workflow.editor.TriqDiagramEditor;
import org.eclipse.triquetrum.workflow.editor.TriqDiagramTypeProvider;
import org.eclipse.triquetrum.workflow.editor.TriqEditorPlugin;
import org.eclipse.triquetrum.workflow.editor.TriqFeatureProvider;
import org.eclipse.triquetrum.workflow.editor.features.ModelElementCreateFeature;
import org.eclipse.triquetrum.workflow.model.Actor;
import org.eclipse.triquetrum.workflow.model.TriqFactory;
import org.eclipse.triquetrum.workflow.model.impl.ActorImpl;
import org.eclipse.triquetrum.workflow.model.impl.TriqFactoryImpl;
import org.eclipse.triquetrum.workflow.model.util.PtolemyUtil;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
public class TqclGenerator extends AbstractGenerator {

	private Map<String, ModelElementCreateFeature> featuresMap = new HashMap<>();

	@Override
	public void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		initFeatureMap();
		EList<EObject> contents = resource.getContents();
		for (EObject eObject : contents) {
			if (eObject instanceof TriquetrumScript) {

				Display.getDefault().syncExec(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						IEditorReference[] editorReferences = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
								.getActivePage().getEditorReferences();
						TriqDiagramEditor triqDiagramEditor = null;
						for (IEditorReference iEditorReference : editorReferences) {

							IEditorPart editor = iEditorReference.getEditor(true);
							if (editor instanceof TriqDiagramEditor) {
								triqDiagramEditor = (TriqDiagramEditor) editor;
								break;
							}
						}

//						triqDiagramEditor.
						
						TriqFeatureProvider provider = new TriqFeatureProvider(new TriqDiagramTypeProvider());
						Diagram diagram = Graphiti.getCreateService().createDiagram("Triquetrum workflow",
								resource.getURI().lastSegment());

						// TriqFactory triqFactory = TriqFactoryImpl.init();

						TriquetrumScript triquetrumScript = (TriquetrumScript) eObject;
						EList<Command> commands = triquetrumScript.getCommands();
						for (Command command : commands) {
							if (command instanceof Insert) {
								Insert insert = (Insert) command;
								NamedObj name = insert.getName();
								AddContext addContext = new AddContext();
								NamedObj obj = insert.getObj();
								String paleteKey = obj.getName();
								ModelElementCreateFeature modelElementCreateFeature = featuresMap
										.get(paleteKey.replaceAll("\"", ""));
								CreateContext createContext = new CreateContext();
								createContext.setTargetContainer(diagram);
								Object[] created = modelElementCreateFeature.create(createContext);

								Object newObject = created[0];
								addContext.setNewObject(newObject);
								addContext.setTargetContainer(diagram);
								addContext.setX(10);
								addContext.setY(10);
								provider.getAddFeature(addContext).add(addContext);

							}
						}
					}
				});

			}
		}

		// Iterator<Greeting> filtered =
		// Iterators.filter(resource.getAllContents(), Greeting.class);
		// Iterator<String> names = Iterators.transform(filtered, new
		// Function<Greeting, String>() {
		//
		// @Override
		// public String apply(Greeting greeting) {
		// return greeting.getName();
		// }
		// });
		// fsa.generateFile("greetings.txt", "People to greet: " +
		// IteratorExtensions.join(names, ", "));
	}

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
}
