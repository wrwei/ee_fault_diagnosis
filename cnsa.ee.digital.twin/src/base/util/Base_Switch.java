/**
 */
package base.util;

import base.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see base.Base_Package
 * @generated
 */
public class Base_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Base_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base_Switch() {
		if (modelPackage == null) {
			modelPackage = Base_Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Base_Package.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Base_Package.DT_ELEMENT: {
				DTElement dtElement = (DTElement)theEObject;
				T result = caseDTElement(dtElement);
				if (result == null) result = caseElement(dtElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Base_Package.COORDINATE: {
				Coordinate coordinate = (Coordinate)theEObject;
				T result = caseCoordinate(coordinate);
				if (result == null) result = caseElement(coordinate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Base_Package.DIMENSION: {
				Dimension dimension = (Dimension)theEObject;
				T result = caseDimension(dimension);
				if (result == null) result = caseElement(dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Base_Package.HEADING: {
				Heading heading = (Heading)theEObject;
				T result = caseHeading(heading);
				if (result == null) result = caseElement(heading);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Base_Package.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = caseDTElement(modelElement);
				if (result == null) result = caseElement(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Base_Package.LANG_STRING: {
				LangString langString = (LangString)theEObject;
				T result = caseLangString(langString);
				if (result == null) result = caseElement(langString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Base_Package.MULTI_LANG_STRING: {
				MultiLangString multiLangString = (MultiLangString)theEObject;
				T result = caseMultiLangString(multiLangString);
				if (result == null) result = caseElement(multiLangString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Base_Package.UTILITY_ELEMENT: {
				UtilityElement utilityElement = (UtilityElement)theEObject;
				T result = caseUtilityElement(utilityElement);
				if (result == null) result = caseDTElement(utilityElement);
				if (result == null) result = caseElement(utilityElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Base_Package.EXTERNAL_REFERENCE: {
				ExternalReference externalReference = (ExternalReference)theEObject;
				T result = caseExternalReference(externalReference);
				if (result == null) result = caseUtilityElement(externalReference);
				if (result == null) result = caseDTElement(externalReference);
				if (result == null) result = caseElement(externalReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Base_Package.DESCRIPTION: {
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = caseUtilityElement(description);
				if (result == null) result = caseDTElement(description);
				if (result == null) result = caseElement(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Base_Package.IMPLEMENTATION_CONSTRAINT: {
				ImplementationConstraint implementationConstraint = (ImplementationConstraint)theEObject;
				T result = caseImplementationConstraint(implementationConstraint);
				if (result == null) result = caseUtilityElement(implementationConstraint);
				if (result == null) result = caseDTElement(implementationConstraint);
				if (result == null) result = caseElement(implementationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Base_Package.NOTE: {
				Note note = (Note)theEObject;
				T result = caseNote(note);
				if (result == null) result = caseUtilityElement(note);
				if (result == null) result = caseDTElement(note);
				if (result == null) result = caseElement(note);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Base_Package.TAGGED_VALUE: {
				TaggedValue taggedValue = (TaggedValue)theEObject;
				T result = caseTaggedValue(taggedValue);
				if (result == null) result = caseUtilityElement(taggedValue);
				if (result == null) result = caseDTElement(taggedValue);
				if (result == null) result = caseElement(taggedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Base_Package.ARTIFACT_ELEMENT: {
				ArtifactElement artifactElement = (ArtifactElement)theEObject;
				T result = caseArtifactElement(artifactElement);
				if (result == null) result = caseModelElement(artifactElement);
				if (result == null) result = caseDTElement(artifactElement);
				if (result == null) result = caseElement(artifactElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DT Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DT Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTElement(DTElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinate(Coordinate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimension(Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heading</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heading</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeading(Heading object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lang String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lang String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLangString(LangString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Lang String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Lang String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiLangString(MultiLangString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utility Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utility Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilityElement(UtilityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalReference(ExternalReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationConstraint(ImplementationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNote(Note object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaggedValue(TaggedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactElement(ArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Base_Switch
