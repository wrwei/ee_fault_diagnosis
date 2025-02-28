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
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;


public class RunEolClean implements IExternalJavaAction{
	
	public RunEolClean() {
		
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
        try {
            IEolModule module = new EolModule();    
            File eolFile = new File("E:\\GitYang\\FaultLocationAssistant-demo\\cnsa.ee.digital.twin.example\\test149\\cleanAll.eol");
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

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;
	}
    

}