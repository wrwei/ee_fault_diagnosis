/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package cnsa.ee.digital.twin.design.utils;



import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.emc.spreadsheets.excel.ExcelModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;


public class GenerateExcel implements IExternalJavaAction{
	
	public GenerateExcel() {
		
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
//        try {
//        	IEolModule module = new EolModule();    
//            File eolFile = new File("D:\\Workspaces\\Projects\\ESDT2\\cnsa.ee.digital.twin.example\\test149\\generateExcel.eol");
//            module.parse(eolFile);           
//            if (!selections.isEmpty()) {
//            	EObject context = selections.iterator().next();
//            	InMemoryEmfModel model = new InMemoryEmfModel("Model", context.eResource(), context.eClass().getEPackage());
//                module.getContext().getModelRepository().addModel(model);
//            }
//            
//            try (ExcelModel excelModel = new ExcelModel()) {
//				File excelFile = new File("D:\\Workspaces\\Projects\\ESDT2\\cnsa.ee.digital.twin.example\\test149\\Result.xlsx");
//				excelModel.setSpreadsheetFile(excelFile.getAbsolutePath());            
//				excelModel.setConfigurationFile(null);
//				excelModel.setName("Excel");  // 给模型起一个名称
//				excelModel.setReadOnLoad(true);  // 设置为在加载时读取数据
//				excelModel.setStoredOnDisposal(true);
//				excelModel.load();
//				module.getContext().getModelRepository().addModel(excelModel);
//			}
//          
//            module.execute();
//            module.getContext().getModelRepository().dispose();         
//        }
//        catch (Exception e) {
//        	e.printStackTrace();
//        }
        
        try {
            IEolModule module = new EolModule();    
            File eolFile = new File("D:\\Workspaces\\Projects\\ESDT2\\cnsa.ee.digital.twin.example\\test149\\generateExcel.eol");
            module.parse(eolFile);           
            
            Resource resource = loadEmfModel("D:\\Workspaces\\Projects\\ESDT2\\cnsa.ee.digital.twin.example\\test149\\test_DT.digital_twin");    
            InMemoryEmfModel emfModel = new InMemoryEmfModel("Model", resource, resource.getContents().get(0).eClass().getEPackage());
            emfModel.setReadOnLoad(true);  
            emfModel.setStoredOnDisposal(true); 
            module.getContext().getModelRepository().addModel(emfModel);

            ExcelModel excelModel = new ExcelModel();
            File excelFile = new File("D:\\Workspaces\\Projects\\ESDT2\\cnsa.ee.digital.twin.example\\test149\\Result.xlsx");
            excelModel.setSpreadsheetFile(excelFile.getAbsolutePath());            
            excelModel.setConfigurationFile(null);
            excelModel.setName("Excel");  
            excelModel.setReadOnLoad(true);  
            excelModel.setStoredOnDisposal(true);
            excelModel.load();        
            module.getContext().getModelRepository().addModel(excelModel);
            
            module.execute();
            module.getContext().getModelRepository().dispose();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
	}
	
	
	
	private static Resource loadEmfModel(String modelPath) throws Exception {

        ResourceSetImpl resourceSet = new ResourceSetImpl();

        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

        Resource resource = resourceSet.createResource(org.eclipse.emf.common.util.URI.createFileURI(modelPath));

        resource.load(new HashMap<String, Object>());
        
        return resource;
    }
	
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}
    

}