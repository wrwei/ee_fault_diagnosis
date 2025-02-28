/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package cnsa.ee.digital.twin.design.utils;


//import java.io.*;
//import java.net.*;
//import java.awt.BorderLayout;
//import java.awt.Frame;
//import java.awt.TextField;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
//import java.net.Socket;
import java.net.URISyntaxException;
import java.net.URL;
//import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.csv.CsvModel;
import org.eclipse.epsilon.emc.emf.EmfMetaModel;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfUtil;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.emc.simulink.model.SimulinkModel;
import org.eclipse.epsilon.emc.spreadsheets.excel.ExcelModel;
import org.eclipse.epsilon.emf.dt.EmfRegistryManager;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.eol.parse.Eol_EolParserRules.ifStatement_return;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.model.business.internal.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import base.LangString;
import base.ModelElement;
import cnsa.ee.digital.twin.design.Activator;
import component.Component;
//import cnsa.ee.digital.twin.design.com.net.CommClient;
//import cnsa.ee.digital.twin.design.com.net.CommClient.MyListener;
import component.ComponentElement;
import component.ComponentPackage;

public class UtilityMethods {

	protected static IFile current_selection;
	protected String metamodel_uri;
	protected String model_uri;
	private static List<Object> metamodels = new ArrayList<Object>();
	protected static HashSet<IResource> resourcePool = new HashSet<>();

	protected String text_query;

	String project_name;

	// progress monitor
	IProgressMonitor progressMonitor = new NullProgressMonitor();

	// get current workspace
	IWorkspace workspace = ResourcesPlugin.getWorkspace();

	// get root of workspace
	IWorkspaceRoot root = workspace.getRoot();

	IProject project;

	public UtilityMethods(String theSelectedFilePath) {
	}

	public static IFile getCurrent_selection() {
		return current_selection;
	}

	public static void setCurrent_selection(IFile current_selection) {
		UtilityMethods.current_selection = current_selection;
	}

	public static void openDiagram(String string) {
		
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
//		IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();

		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
		   IEditorInput input = activeEditor.getEditorInput();

		   IProject project = input.getAdapter(IProject.class);
		   if (project == null) {
		      IResource resource = input.getAdapter(IResource.class);
		      if (resource != null) {
		         project = resource.getProject();
		      }
		   }
		   IFile airdFile = project.getFile("representations.aird");
		   URI representationsFileURI = URI.createPlatformResourceURI(airdFile
					.getFullPath().toOSString(), true);
			Session session = SessionManager.INSTANCE.getSession(
					representationsFileURI, new NullProgressMonitor());

			DAnalysis root = (DAnalysis) session.getSessionResource()
					.getContents().get(0);
			EList<DView> views = root.getOwnedViews();
			
			EList<DRepresentationDescriptor> representations = new BasicEList<DRepresentationDescriptor>();
			
			for(DView view: views) {
				representations.addAll(view.getOwnedRepresentationDescriptors());

			}
			DRepresentation representation = null;
			ModelElement modelElement = null;
//			EObject rootObject = null;
			for (DRepresentationDescriptor currentRep : representations) {
				ModelElement temp = (ModelElement) currentRep.getTarget();
				if(temp != null) {
					LangString name = temp.getName();
					if (name != null) {
						String content = name.getContent();
						if (string.equals(content)) {
							modelElement = temp;
							representation = currentRep.getRepresentation();
						}
						else if(isContainedWithin(temp, string)) {
							modelElement = temp;
							representation = currentRep.getRepresentation();
						}
					}
				}
			}
			DialectUIManager.INSTANCE.openEditor(session, representation,
					new NullProgressMonitor());
		}
	}
	
	private static boolean isContainedWithin(ModelElement modelElement, String s) {
		if(modelElement instanceof Component) {
			Component temp = (Component) modelElement;
			for(ComponentElement c: temp.getSub_components()) {
				LangString name = c.getName();
				if (name!= null && name.getContent() != null) {
					if(name.getContent().equals(s)) {
						return true;
					}
				}
			}
		}
		else if(modelElement instanceof ComponentPackage) {
			ComponentPackage temp = (ComponentPackage) modelElement;
			for(ComponentElement c: temp.getComponents()) {
				LangString name = c.getName();
				if (name!= null && name.getContent() != null) {
					if(name.getContent().equals(s)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static String getProjectPath() {
	    IWorkbenchWindow window = PlatformUI.getWorkbench()
	            .getActiveWorkbenchWindow();

		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
		   IEditorInput input = activeEditor.getEditorInput();

		   IProject project = input.getAdapter(IProject.class);
		   if (project == null) {
		      IResource resource = input.getAdapter(IResource.class);
		      if (resource != null) {
		         project = resource.getProject();
		         return project.getFullPath().toOSString();
		      }
		   }
		   else {
			  return project.getFullPath().toOSString();
		   }
		}
		return null;
	}
	
	public static String executeQuery(EObject obj, String query, String... mmuri) throws Exception {
		// FIXME: getArtifactProperty returns a list. In this implementation we assume
		// the query model is the first property.

//		URI uri = EcoreUtil.getURI(obj);
//		
//		uri = uri.trimFragment();
//		URI resolved = CommonPlugin.resolve(uri);
//		String referencedModelPath = resolved.toFileString();

		EmfModel theReferencedEMFModel = loadInMemoryEMFModel("M", "true", "true", obj.eResource(), mmuri);
		String result = runStringEOLQuery(theReferencedEMFModel, query).toString();
		System.out.println("Result: " + result);
		return result;
	}
	
	public static String executeQuery(String doc_path, String metadata_path, String query) throws Exception {

		// getting the absolute path
		String projectlocation = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

		if (window == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
			if (windows.length > 0) {
				window = windows[0];
			}
		}
		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
			IEditorInput input = activeEditor.getEditorInput();

			IProject project = input.getAdapter(IProject.class);
			if (project == null) {
				IResource resource = input.getAdapter(IResource.class);
				if (resource != null) {
					project = resource.getProject();
					projectlocation = project.getLocation().toOSString();
				}
			}
		}
		String doc_absolute_path = projectlocation + doc_path;
		String metadata_absolute_path = projectlocation + metadata_path;

//		registerMetamodel(metadata_path);
		Collection<EPackage> ePackages = registerMetamodel(metadata_absolute_path);
		if (ePackages.size() > 0) {
			for (EPackage ePkg : ePackages) {
				final URI uri = URI.createURI(ePkg.getNsURI());
				if (!metamodels.contains(uri)) {
					metamodels.add(uri);
				}
			}
		}

		String metamodelsString = "";
		for (Object mm : metamodels) {
			metamodelsString = metamodelsString + mm.toString() + ", ";
		}
		metamodelsString = metamodelsString.substring(0, metamodelsString.length() - 2);
		System.err.println(metamodelsString);
		
		
		EmfModel theReferencedEMFModel = createAndLoadAnEmfModel(metamodelsString, doc_absolute_path, "M", "true",
				"false");
		String result = runStringEOLQueryOnOneModel(theReferencedEMFModel, query).toString();
		System.out.println("Result: " + result);
		return result;
	}
	
	public static String executeQueryOnExcel(String doc_path, String metadata_path, String query) throws Exception {

		// getting the absolute path
		String projectlocation = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

		if (window == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
			if (windows.length > 0) {
				window = windows[0];
			}
		}
		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
			IEditorInput input = activeEditor.getEditorInput();

			IProject project = input.getAdapter(IProject.class);
			if (project == null) {
				IResource resource = input.getAdapter(IResource.class);
				if (resource != null) {
					project = resource.getProject();
					projectlocation = project.getLocation().toOSString();
				}
			}
		}
		String doc_absolute_path = projectlocation + doc_path;

		ExcelModel theReferencedEMFModel = createAndLoadAnExcelModel(doc_absolute_path, "M", "true",
				"false");
		String result = runStringEOLQueryOnOneModel(theReferencedEMFModel, query).toString();
		System.out.println("Result: " + result);
		return result;
	}
	
	public static String executeQueryOnCsv(String doc_path, String metadata_path, String query) throws Exception {

		// getting the absolute path
		String projectlocation = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

		if (window == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
			if (windows.length > 0) {
				window = windows[0];
			}
		}
		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
			IEditorInput input = activeEditor.getEditorInput();

			IProject project = input.getAdapter(IProject.class);
			if (project == null) {
				IResource resource = input.getAdapter(IResource.class);
				if (resource != null) {
					project = resource.getProject();
					projectlocation = project.getLocation().toOSString();
				}
			}
		}
		String doc_absolute_path = projectlocation + doc_path;

		CsvModel theReferencedEMFModel = createAndLoadAnCsvModel(doc_absolute_path, "M", "true",
				"false");
		String result = runStringEOLQueryOnOneModel(theReferencedEMFModel, query).toString();
		System.out.println("Result: " + result);
		return result;
	}

	public static String getAbsoluteProjectPath() {
		// getting the absolute path
		String projectlocation = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

		if (window == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
			if (windows.length > 0) {
				window = windows[0];
			}
		}
		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
			IEditorInput input = activeEditor.getEditorInput();

			IProject project = input.getAdapter(IProject.class);
			if (project == null) {
				IResource resource = input.getAdapter(IResource.class);
				if (resource != null) {
					project = resource.getProject();
					projectlocation = project.getLocation().toOSString();
				}
			}
		}
		return projectlocation;
	}

	private static EmfModel createAndLoadAnEmfModel(String metamodelURI, String modelFile, String modelName,
			String readOnLoad, String storeOnDisposal) throws EolModelLoadingException {
		EmfModel theModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodelURI);
		properties.put(EmfModel.PROPERTY_MODEL_FILE, modelFile);
		properties.put(EmfModel.PROPERTY_NAME, modelName);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		theModel.load(properties, (IRelativePathResolver) null);
		return theModel;
	}
	
	public static SimulinkModel createAndLoadSimulinkMode (String modelFile, String modelName,
			String readOnLoad, String storeOnDisposal) throws EolModelLoadingException {
		SimulinkModel model = new SimulinkModel();
		StringProperties properties = new StringProperties();
		properties.put(ExcelModel.SPREADSHEET_FILE, modelFile);
		properties.put(ExcelModel.PROPERTY_NAME, modelName);
		properties.put(ExcelModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(ExcelModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		model.load(properties);
		return model;
	}
	
	private static ExcelModel createAndLoadAnExcelModel(String modelFile, String modelName,
			String readOnLoad, String storeOnDisposal) throws EolModelLoadingException {
		ExcelModel theModel = new ExcelModel();
		StringProperties properties = new StringProperties();
		properties.put(ExcelModel.SPREADSHEET_FILE, modelFile);
		properties.put(ExcelModel.PROPERTY_NAME, modelName);
		properties.put(ExcelModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(ExcelModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		theModel.load(properties);
		return theModel;
	}
	
	private static CsvModel createAndLoadAnCsvModel(String modelFile, String modelName,
			String readOnLoad, String storeOnDisposal) throws EolModelLoadingException {
		CsvModel model = new CsvModel();
		char separator = ',';
		StringProperties properties = new StringProperties();
		properties.put(CsvModel.PROPERTY_FILE, modelFile);
		properties.put(CsvModel.PROPERTY_FIELD_SEPARATOR, separator);
		properties.put(CsvModel.PROPERTY_HAS_KNOWN_HEADERS, true);
		properties.put(CsvModel.PROPERTY_HAS_VARARGS_HEADERS, false);
		properties.put(CsvModel.PROPERTY_NAME, modelName);
		properties.put(CsvModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(CsvModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		model.load(properties);
		//model.load(properties, (IRelativePathResolver) null);
		return model;
	}
	
	public static EmfModel loadInMemoryEMFModel(String modelName, String readOnLoad, String storeOnDisposal,
			Resource modelFile, String... nsuris) throws EolModelLoadingException {
		InMemoryEmfModel theModel = new InMemoryEmfModel(modelName, modelFile, nsuris);
		theModel.setReadOnLoad(false);
		theModel.setStoredOnDisposal(true);
		theModel.allContents().clear();
		return theModel;
	}

	private EmfMetaModel createAndLoadAnEmfMetaModel(String metamodelUri, String modelName, String readOnLoad,
			String storeOnDisposal) throws EolModelLoadingException {
		EmfMetaModel metamodel = new EmfMetaModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfMetaModel.PROPERTY_METAMODEL_URI, metamodelUri);
		properties.put(EmfMetaModel.PROPERTY_NAME, modelName);
		properties.put(EmfMetaModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(EmfMetaModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		metamodel.load(properties, (IRelativePathResolver) null);
		return metamodel;
	}

	private String runEOLQuery(ArrayList<IModel> allTheModels, String theFile) throws Exception {
		String ret = "";
		EolModule eolModule = new EolModule();
		for (IModel theModel : allTheModels) {
			eolModule.getContext().getModelRepository().addModel(theModel);
		}
		java.net.URI eolFile = Activator.getDefault().getBundle().getResource(theFile).toURI();
		eolModule.parse(eolFile);
		Object object = eolModule.execute();
		System.out.println(object);
		return ret;
	}

	private static String runStringEOLQueryOnOneModel(IModel model, String query) throws Exception {
		Object result = null;
		EolModule eolModule = new EolModule();
		eolModule.getContext().getModelRepository().addModel(model);
//		if (!query.endsWith(";")) {
//			query = query + ";";
//		}
		try {
			eolModule.parse(query);
//			eolModule.parse("return " +  query);
		} catch (Exception e) {
			throw new IllegalStateException("Pattern expression cannot be parsed.", e);
		}

		try {
			result = eolModule.execute();
		} catch (EolRuntimeException e) {
			throw new IllegalStateException(String.format("The query <%s> could not be evaluated.", query), e);
		}
		System.out.println("Result: " + result);
		if (result != null) {
			result = result.toString();
			eolModule.getContext().getModelRepository().dispose();
			return result.toString();
		}
		else {
			return "null";
		}
		
	}

	private static String runStringEOLQuery(IModel model, String query) throws Exception {
		Object result = null;
		EolModule eolModule = new EolModule();
		eolModule.getContext().getModelRepository().addModel(model);
		try {
			eolModule.parse(query);
		} catch (Exception e) {
			throw new IllegalStateException("Pattern expression cannot be parsed.", e);
		}

		try {
			result = eolModule.execute();
		} catch (EolRuntimeException e) {
			throw new IllegalStateException(String.format("The query <%s> could not be evaluated.", query), e);
		}
		return "";
	}

	public static void doEOLTransformation(ArrayList<IModel> allTheModels, String theFile) throws Exception {
		EolModule eolModule = new EolModule();
		for (IModel theModel : allTheModels) {
			eolModule.getContext().getModelRepository().addModel(theModel);
		}
		java.net.URI etlFile = Activator.getDefault().getBundle().getResource(theFile).toURI();
		eolModule.parse(etlFile);
		eolModule.execute();
		eolModule.getContext().getModelRepository().dispose();
	}

	public void refresh(IProject parentProject) throws CoreException {
		parentProject.refreshLocal(1, null);
	}

	private static Collection<EPackage> findEPackages(String resourceLocation) {
		registerMetamodels();

		Set<EPackage> ePackages = new HashSet<EPackage>();

		try {
			ResourceSet rs = new ResourceSetImpl();
			Resource r = rs.createResource(URI.createFileURI(resourceLocation));
			r.load(null);
			EcoreUtil.resolveAll(r);
			for (Resource res : rs.getResources()) {
				Iterator<EObject> it = res.getAllContents();
				while (it.hasNext()) {
					ePackages.add(EmfUtil.getTopEPackage(it.next().eClass().getEPackage()));
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return ePackages;
	}

	private static Collection<EPackage> registerMetamodel(String path) {
		IFile file = getCurrentSelection();
		List<EPackage> ePackages = null;
		try {
			for (IResource r : file.getParent().members()) {
				if (path.contains(r.getName())) {
					if (r instanceof IFolder) {
						for(IResource s : ((IContainer) r).members()) {
							if (path.contains(s.getName())) {
								String filename = s.getFullPath().toOSString();
								try {
									EmfRegistryManager.getInstance().addMetamodel(filename);
									LogUtil.logInfo(filename + " registered successfully");
									ePackages = EmfUtil.register(URI.createPlatformResourceURI(filename, true),
											EPackage.Registry.INSTANCE);
								} catch (Exception ex) {
									LogUtil.log(filename + " could not be registered", ex);
								}
							}
						}
					}
					else {
						String filename = r.getFullPath().toOSString();
						try {
							EmfRegistryManager.getInstance().addMetamodel(filename);
							LogUtil.logInfo(filename + " registered successfully");
							ePackages = EmfUtil.register(URI.createPlatformResourceURI(filename, true),
									EPackage.Registry.INSTANCE);
						} catch (Exception ex) {
							LogUtil.log(filename + " could not be registered", ex);
						}
					}
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return ePackages;
	}

	private static boolean registerMetamodels() {
		IFile file = getCurrentSelection();
		try {
			for (IResource r : file.getParent().members()) {
				if (resourcePool.contains(r)) {
					continue;
				}
				resourcePool.add(r);
				String filename = r.getFullPath().toOSString();
				try {
					EmfRegistryManager.getInstance().addMetamodel(filename);
					LogUtil.logInfo(filename + " registered successfully");
				} catch (Exception ex) {
					LogUtil.log(filename + " could not be registered", ex);
					return false;
				}
			}
			return true;
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public static IFile getCurrentSelection() {
		if (current_selection == null) {
			IWorkbenchPage workbenchPage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			IEditorPart editor = workbenchPage.getActiveEditor();
			IEditorInput input = editor.getEditorInput();
			URIEditorInput editorInput = (URIEditorInput) input;
			URI uri = editorInput.getURI();
			URI resolvedFile = CommonPlugin.resolve(uri.trimFragment());

			Path path = new Path(resolvedFile.devicePath());
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IFile file = workspace.getRoot().getFileForLocation(path);
			return file;
		} else {
			return current_selection;
		}
	}

	private static void copyFileUsingStream(File source, File dest) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		} finally {
			is.close();
			os.close();
		}
	}
	
	public static java.net.URI getSimu2Emf() throws URISyntaxException
	{
		return Activator.getDefault().getBundle().getResource("files/simulink2dt.eol").toURI();
	}
	
	public static String getSimu2EmfMode() throws URISyntaxException
	{
		URL url = null;
		try {
			url = FileLocator.toFileURL(Activator.getDefault().getBundle().getResource("files/dt.model"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String path = url.getPath();
		return path;
	}
	
	
//	public class CommClient extends Frame{
//		
//		private static final long serialVersionUID = 2979302049596512894L;
//		Socket socket = null;
//		DataOutputStream dos = null;
//		TextField tf = new TextField(40);
//		java.awt.List list = new java.awt.List(10);
//		
//		public void createClientWindow() {
//			this.connect();
//			this.setLocation(400, 300);
//			this.setSize(300, 300);
//			this.list.add("��������˷��͵�����:");
//			this.setTitle("�ͻ���");
//			this.add(list, BorderLayout.NORTH);
//			this.add(tf, BorderLayout.SOUTH);
//			this.pack();
//			this.addWindowListener(
//				new WindowAdapter(){
//					public void windowClosing(WindowEvent e){
//						disconnect();
//						System.exit(0);
//						}
//					}
//				);
//			this.setVisible(true);
//		}
//		
//		public void connect(){
//			String port = "8888";
//			try{
//				socket = new Socket("127.0.0.1", Integer.parseInt(port));
//				dos = new DataOutputStream(socket.getOutputStream());
//				System.out.println("���ӳɹ�");
//			} catch (UnknownHostException e){
//				e.printStackTrace();
//			} catch (IOException e){
//				e.printStackTrace();
//			}
//		}
//
//		public void disconnect(){
//			try{
//				dos.close();
//				socket.close();
//				System.exit(0);
//			} catch (IOException e){
//				e.printStackTrace();
//			}
//		}
//		
//		public void listen() {
//			tf.addActionListener(new MyListener());
//		}
//		
//		private class MyListener implements ActionListener{
//		    public void actionPerformed(ActionEvent e){
//			    String str = tf.getText().trim();
//			    list.add(str);
//			    tf.setText("");
//			    try{
//			    	dos.writeUTF(str);
//			    	dos.flush();
//			    } catch (IOException e1){
//			       e1.printStackTrace();  
//			    }
//			    if (str.equals("0") | str.equals("q")) {
//			    	System.out.println("�������");
//
//			    	disconnect();
//			    }
//		    }
//		}
//	}
}