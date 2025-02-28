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
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;


public class RunJudge implements IExternalJavaAction{
	
	public RunJudge() {
		
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
        try {
            IEolModule module = new EolModule();    
            File eolFile = new File("D:\\Workspaces\\Projects\\ESDT2\\cnsa.ee.digital.twin.example\\test149\\judge.eol");
            module.parse(eolFile);           
            if (!selections.isEmpty()) {
            	EObject context = selections.iterator().next();
            	InMemoryEmfModel model = new InMemoryEmfModel("Model", context.eResource(), context.eClass().getEPackage());
                module.getContext().getModelRepository().addModel(model);
            }
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