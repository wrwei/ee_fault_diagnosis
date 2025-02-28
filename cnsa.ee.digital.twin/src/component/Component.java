/**
 */
package component;

import base.ArtifactElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.Component#isDynamic <em>Dynamic</em>}</li>
 *   <li>{@link component.Component#getIdentity <em>Identity</em>}</li>
 *   <li>{@link component.Component#getComponent_name <em>Component name</em>}</li>
 *   <li>{@link component.Component#getReuse <em>Reuse</em>}</li>
 *   <li>{@link component.Component#getCots <em>Cots</em>}</li>
 *   <li>{@link component.Component#getFit <em>Fit</em>}</li>
 *   <li>{@link component.Component#isSafety_related <em>Safety related</em>}</li>
 *   <li>{@link component.Component#getSil <em>Sil</em>}</li>
 *   <li>{@link component.Component#getReadings <em>Readings</em>}</li>
 *   <li>{@link component.Component#getBlockType <em>Block Type</em>}</li>
 *   <li>{@link component.Component#getFunction <em>Function</em>}</li>
 *   <li>{@link component.Component#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link component.Component#getInputs <em>Inputs</em>}</li>
 *   <li>{@link component.Component#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link component.Component#getLports <em>Lports</em>}</li>
 *   <li>{@link component.Component#getRports <em>Rports</em>}</li>
 *   <li>{@link component.Component#getSub_components <em>Sub components</em>}</li>
 *   <li>{@link component.Component#getFailure_modes <em>Failure modes</em>}</li>
 *   <li>{@link component.Component#getSafety_mechanisms <em>Safety mechanisms</em>}</li>
 *   <li>{@link component.Component#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link component.Component#getReading <em>Reading</em>}</li>
 *   <li>{@link component.Component#isFaulty <em>Faulty</em>}</li>
 *   <li>{@link component.Component#isRunningNormally <em>Running Normally</em>}</li>
 *   <li>{@link component.Component#isRunningAbnormally <em>Running Abnormally</em>}</li>
 *   <li>{@link component.Component#isToBePredicted <em>To Be Predicted</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getComponent()
 * @model
 * @generated
 */
public interface Component extends ComponentElement {
	/**
	 * Returns the value of the '<em><b>Dynamic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic</em>' attribute.
	 * @see #setDynamic(boolean)
	 * @see component.Component_Package#getComponent_Dynamic()
	 * @model
	 * @generated
	 */
	boolean isDynamic();

	/**
	 * Sets the value of the '{@link component.Component#isDynamic <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic</em>' attribute.
	 * @see #isDynamic()
	 * @generated
	 */
	void setDynamic(boolean value);

	/**
	 * Returns the value of the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' attribute.
	 * @see #setIdentity(int)
	 * @see component.Component_Package#getComponent_Identity()
	 * @model
	 * @generated
	 */
	int getIdentity();

	/**
	 * Sets the value of the '{@link component.Component#getIdentity <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' attribute.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(int value);

	/**
	 * Returns the value of the '<em><b>Component name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component name</em>' attribute.
	 * @see #setComponent_name(String)
	 * @see component.Component_Package#getComponent_Component_name()
	 * @model
	 * @generated
	 */
	String getComponent_name();

	/**
	 * Sets the value of the '{@link component.Component#getComponent_name <em>Component name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component name</em>' attribute.
	 * @see #getComponent_name()
	 * @generated
	 */
	void setComponent_name(String value);

	/**
	 * Returns the value of the '<em><b>Reuse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reuse</em>' attribute.
	 * @see #setReuse(Boolean)
	 * @see component.Component_Package#getComponent_Reuse()
	 * @model
	 * @generated
	 */
	Boolean getReuse();

	/**
	 * Sets the value of the '{@link component.Component#getReuse <em>Reuse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reuse</em>' attribute.
	 * @see #getReuse()
	 * @generated
	 */
	void setReuse(Boolean value);

	/**
	 * Returns the value of the '<em><b>Cots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cots</em>' attribute.
	 * @see #setCots(Boolean)
	 * @see component.Component_Package#getComponent_Cots()
	 * @model
	 * @generated
	 */
	Boolean getCots();

	/**
	 * Sets the value of the '{@link component.Component#getCots <em>Cots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cots</em>' attribute.
	 * @see #getCots()
	 * @generated
	 */
	void setCots(Boolean value);

	/**
	 * Returns the value of the '<em><b>Fit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fit</em>' attribute.
	 * @see #setFit(float)
	 * @see component.Component_Package#getComponent_Fit()
	 * @model
	 * @generated
	 */
	float getFit();

	/**
	 * Sets the value of the '{@link component.Component#getFit <em>Fit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fit</em>' attribute.
	 * @see #getFit()
	 * @generated
	 */
	void setFit(float value);

	/**
	 * Returns the value of the '<em><b>Safety related</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety related</em>' attribute.
	 * @see #setSafety_related(boolean)
	 * @see component.Component_Package#getComponent_Safety_related()
	 * @model
	 * @generated
	 */
	boolean isSafety_related();

	/**
	 * Sets the value of the '{@link component.Component#isSafety_related <em>Safety related</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety related</em>' attribute.
	 * @see #isSafety_related()
	 * @generated
	 */
	void setSafety_related(boolean value);

	/**
	 * Returns the value of the '<em><b>Sil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sil</em>' attribute.
	 * @see #setSil(int)
	 * @see component.Component_Package#getComponent_Sil()
	 * @model
	 * @generated
	 */
	int getSil();

	/**
	 * Sets the value of the '{@link component.Component#getSil <em>Sil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sil</em>' attribute.
	 * @see #getSil()
	 * @generated
	 */
	void setSil(int value);

	/**
	 * Returns the value of the '<em><b>Readings</b></em>' containment reference list.
	 * The list contents are of type {@link component.Reading}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readings</em>' containment reference list.
	 * @see component.Component_Package#getComponent_Readings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reading> getReadings();

	/**
	 * Returns the value of the '<em><b>Block Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Type</em>' reference.
	 * @see #setBlockType(ArtifactElement)
	 * @see component.Component_Package#getComponent_BlockType()
	 * @model
	 * @generated
	 */
	ArtifactElement getBlockType();

	/**
	 * Sets the value of the '{@link component.Component#getBlockType <em>Block Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Type</em>' reference.
	 * @see #getBlockType()
	 * @generated
	 */
	void setBlockType(ArtifactElement value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(Function)
	 * @see component.Component_Package#getComponent_Function()
	 * @model
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link component.Component#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * The literals are from the enumeration {@link component.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see component.ComponentType
	 * @see #setComponentType(ComponentType)
	 * @see component.Component_Package#getComponent_ComponentType()
	 * @model required="true"
	 * @generated
	 */
	ComponentType getComponentType();

	/**
	 * Sets the value of the '{@link component.Component#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see component.ComponentType
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link component.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see component.Component_Package#getComponent_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link component.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see component.Component_Package#getComponent_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Lports</b></em>' containment reference list.
	 * The list contents are of type {@link component.LPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lports</em>' containment reference list.
	 * @see component.Component_Package#getComponent_Lports()
	 * @model containment="true"
	 * @generated
	 */
	EList<LPort> getLports();

	/**
	 * Returns the value of the '<em><b>Rports</b></em>' containment reference list.
	 * The list contents are of type {@link component.RPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rports</em>' containment reference list.
	 * @see component.Component_Package#getComponent_Rports()
	 * @model containment="true"
	 * @generated
	 */
	EList<RPort> getRports();

	/**
	 * Returns the value of the '<em><b>Sub components</b></em>' containment reference list.
	 * The list contents are of type {@link component.ComponentElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub components</em>' containment reference list.
	 * @see component.Component_Package#getComponent_Sub_components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentElement> getSub_components();

	/**
	 * Returns the value of the '<em><b>Failure modes</b></em>' containment reference list.
	 * The list contents are of type {@link component.FailureMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure modes</em>' containment reference list.
	 * @see component.Component_Package#getComponent_Failure_modes()
	 * @model containment="true"
	 * @generated
	 */
	EList<FailureMode> getFailure_modes();

	/**
	 * Returns the value of the '<em><b>Safety mechanisms</b></em>' containment reference list.
	 * The list contents are of type {@link component.SafetyMechanism}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety mechanisms</em>' containment reference list.
	 * @see component.Component_Package#getComponent_Safety_mechanisms()
	 * @model containment="true"
	 * @generated
	 */
	EList<SafetyMechanism> getSafety_mechanisms();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' reference list.
	 * The list contents are of type {@link base.ArtifactElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' reference list.
	 * @see component.Component_Package#getComponent_Requirements()
	 * @model
	 * @generated
	 */
	EList<ArtifactElement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading</em>' containment reference.
	 * @see #setReading(Reading)
	 * @see component.Component_Package#getComponent_Reading()
	 * @model containment="true"
	 * @generated
	 */
	Reading getReading();

	/**
	 * Sets the value of the '{@link component.Component#getReading <em>Reading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading</em>' containment reference.
	 * @see #getReading()
	 * @generated
	 */
	void setReading(Reading value);

	/**
	 * Returns the value of the '<em><b>Faulty</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faulty</em>' attribute.
	 * @see #setFaulty(boolean)
	 * @see component.Component_Package#getComponent_Faulty()
	 * @model default="false"
	 * @generated
	 */
	boolean isFaulty();

	/**
	 * Sets the value of the '{@link component.Component#isFaulty <em>Faulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faulty</em>' attribute.
	 * @see #isFaulty()
	 * @generated
	 */
	void setFaulty(boolean value);

	/**
	 * Returns the value of the '<em><b>Running Normally</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running Normally</em>' attribute.
	 * @see #setRunningNormally(boolean)
	 * @see component.Component_Package#getComponent_RunningNormally()
	 * @model default="false"
	 * @generated
	 */
	boolean isRunningNormally();

	/**
	 * Sets the value of the '{@link component.Component#isRunningNormally <em>Running Normally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running Normally</em>' attribute.
	 * @see #isRunningNormally()
	 * @generated
	 */
	void setRunningNormally(boolean value);

	/**
	 * Returns the value of the '<em><b>Running Abnormally</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running Abnormally</em>' attribute.
	 * @see #setRunningAbnormally(boolean)
	 * @see component.Component_Package#getComponent_RunningAbnormally()
	 * @model default="false"
	 * @generated
	 */
	boolean isRunningAbnormally();

	/**
	 * Sets the value of the '{@link component.Component#isRunningAbnormally <em>Running Abnormally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running Abnormally</em>' attribute.
	 * @see #isRunningAbnormally()
	 * @generated
	 */
	void setRunningAbnormally(boolean value);

	/**
	 * Returns the value of the '<em><b>To Be Predicted</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Be Predicted</em>' attribute.
	 * @see #setToBePredicted(boolean)
	 * @see component.Component_Package#getComponent_ToBePredicted()
	 * @model default="true"
	 * @generated
	 */
	boolean isToBePredicted();

	/**
	 * Sets the value of the '{@link component.Component#isToBePredicted <em>To Be Predicted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Predicted</em>' attribute.
	 * @see #isToBePredicted()
	 * @generated
	 */
	void setToBePredicted(boolean value);

} // Component
