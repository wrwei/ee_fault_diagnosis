/**
 */
package component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.DirectedRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link component.DirectedRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link component.DirectedRelationship#isFaulty <em>Faulty</em>}</li>
 *   <li>{@link component.DirectedRelationship#isRunningNormally <em>Running Normally</em>}</li>
 *   <li>{@link component.DirectedRelationship#isRunningAbnormally <em>Running Abnormally</em>}</li>
 *   <li>{@link component.DirectedRelationship#isToBePredicted <em>To Be Predicted</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getDirectedRelationship()
 * @model
 * @generated
 */
public interface DirectedRelationship extends ComponentRelationship {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ComponentElement)
	 * @see component.Component_Package#getDirectedRelationship_Source()
	 * @model
	 * @generated
	 */
	ComponentElement getSource();

	/**
	 * Sets the value of the '{@link component.DirectedRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ComponentElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ComponentElement)
	 * @see component.Component_Package#getDirectedRelationship_Target()
	 * @model
	 * @generated
	 */
	ComponentElement getTarget();

	/**
	 * Sets the value of the '{@link component.DirectedRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ComponentElement value);

	/**
	 * Returns the value of the '<em><b>Faulty</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faulty</em>' attribute.
	 * @see #setFaulty(boolean)
	 * @see component.Component_Package#getDirectedRelationship_Faulty()
	 * @model default="false"
	 * @generated
	 */
	boolean isFaulty();

	/**
	 * Sets the value of the '{@link component.DirectedRelationship#isFaulty <em>Faulty</em>}' attribute.
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
	 * @see component.Component_Package#getDirectedRelationship_RunningNormally()
	 * @model default="false"
	 * @generated
	 */
	boolean isRunningNormally();

	/**
	 * Sets the value of the '{@link component.DirectedRelationship#isRunningNormally <em>Running Normally</em>}' attribute.
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
	 * @see component.Component_Package#getDirectedRelationship_RunningAbnormally()
	 * @model default="false"
	 * @generated
	 */
	boolean isRunningAbnormally();

	/**
	 * Sets the value of the '{@link component.DirectedRelationship#isRunningAbnormally <em>Running Abnormally</em>}' attribute.
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
	 * @see component.Component_Package#getDirectedRelationship_ToBePredicted()
	 * @model default="true"
	 * @generated
	 */
	boolean isToBePredicted();

	/**
	 * Sets the value of the '{@link component.DirectedRelationship#isToBePredicted <em>To Be Predicted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Predicted</em>' attribute.
	 * @see #isToBePredicted()
	 * @generated
	 */
	void setToBePredicted(boolean value);

} // DirectedRelationship
