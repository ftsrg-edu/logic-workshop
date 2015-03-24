package hu.bme.mit.inf.dsl2smt2.parameterization.initialiser;

import hu.bme.mit.kk.KKSolver;
import hu.bme.mit.kk.dsl.language.Model;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public class InitiateButtonHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			IEditorInput input = window.getActivePage().getActiveEditor()
					.getEditorInput();

			if (input instanceof FileEditorInput) {
				FileEditorInput editorInput = (FileEditorInput) input;
				IFile file = editorInput.getFile();
				ResourceSet resSet = new ResourceSetImpl();
				Resource resource;
				try {
					resource = resSet.getResource(URI
							.createPlatformResourceURI(file.getFullPath()
									.toString(), true), true);
				} catch (RuntimeException exception) {
					showInformationMessage("Can not load the source file!");
					return null;
				}
				EObject root = resource.getContents().get(0);
				if (root instanceof Model) {
					Model model = ((Model) root);
					KKSolver transformer = new KKSolver();
					try {
						showInformationMessage(transformer.solve(model));
					} catch (Exception e) {

					}
				} else
					showInformationMessage("The edited file is not a logic problem!");
			} else
				showInformationMessage("Can not detect the source file!");
		} else
			showInformationMessage("There isn't any active window!");

		return null;
	}

	/**
	 * Static method that shows an error message to the user
	 * 
	 * @param errorMessage
	 */
	public static void showInformationMessage(String errorMessage) {
		MessageDialog messageDialog = new MessageDialog(null,
				"", null, errorMessage,
				MessageDialog.INFORMATION, new String[] { "Ok" }, 0);
		messageDialog.open();
	}
}