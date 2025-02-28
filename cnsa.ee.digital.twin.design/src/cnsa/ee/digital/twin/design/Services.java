package cnsa.ee.digital.twin.design;

import java.io.File;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;

import base.ModelElement;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	
	protected ModelElement modelElement;
	
	public boolean toggleFaulty(EObject self) {
		if(self == null) {
			return false;
		}
		EStructuralFeature feature = self.eClass().getEStructuralFeature("faulty");
		if (feature != null && feature.getEType().getInstanceClass() == boolean.class) {
			boolean currentValue = (boolean) self.eGet(feature);
			boolean newValue = !currentValue;
			return newValue;
		}
		return false;
	}
	public boolean toggleRunningNormally(EObject self) {
		if(self == null) {
			return false;
		}
		EStructuralFeature feature = self.eClass().getEStructuralFeature("RunningNormally");
		if (feature != null && feature.getEType().getInstanceClass() == boolean.class) {
			boolean currentValue = (boolean) self.eGet(feature);
			boolean newValue = !currentValue;
			return newValue;
		}
		return false;
	}
	public boolean toggleRunningAbnormally(EObject self) {
		if(self == null) {
			return false;
		}
		EStructuralFeature feature = self.eClass().getEStructuralFeature("RunningAbnormally");
		if (feature != null && feature.getEType().getInstanceClass() == boolean.class) {
			boolean currentValue = (boolean) self.eGet(feature);
			boolean newValue = !currentValue;
			return newValue;
		}
		return false;
	}
	public boolean toggleToBePredicted(EObject self) {
		if(self == null) {
			return false;
		}
		EStructuralFeature feature = self.eClass().getEStructuralFeature("ToBePredicted");
		if (feature != null && feature.getEType().getInstanceClass() == boolean.class) {
			boolean currentValue = (boolean) self.eGet(feature);
			boolean newValue = !currentValue;
			return newValue;
		}
		return false;
	}
	public boolean toggleToBeChecked(EObject self) {
		if(self == null) {
			return false;
		}
		EStructuralFeature feature = self.eClass().getEStructuralFeature("ToBeChecked");
		if (feature != null && feature.getEType().getInstanceClass() == boolean.class) {
			boolean currentValue = (boolean) self.eGet(feature);
			boolean newValue = !currentValue;
			return newValue;
		}
		return false;
	}
	public boolean toggleOperationalAfterPrediction(EObject self) {
		if(self == null) {
			return false;
		}
		EStructuralFeature feature = self.eClass().getEStructuralFeature("OperationalAfterPrediction");
		if (feature != null && feature.getEType().getInstanceClass() == boolean.class) {
			boolean currentValue = (boolean) self.eGet(feature);
			boolean newValue = !currentValue;
			return newValue;
		}
		return false;
	}
	
	public void runEOL(EObject context, List<EObject> selection) {
		try {
			
			IEolModule module = new EolModule();
			File eolFile = new File("/cnsa.ee.digital.twin.design/src/cnsa/ee/digital/twin/design/printModelNames.eol");
			module.parse(eolFile);
			
			InMemoryEmfModel model = new InMemoryEmfModel("Model", context.eResource(),context.eClass().getEPackage());
			module.getContext().getModelRepository().addModel(model);
			
			module.execute();
			
			module.getContext().getModelRepository().dispose();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
}
