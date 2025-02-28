/**
 */
package component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.Output#isFaulty <em>Faulty</em>}</li>
 *   <li>{@link component.Output#isRunningNormally <em>Running Normally</em>}</li>
 *   <li>{@link component.Output#isRunningAbnormally <em>Running Abnormally</em>}</li>
 *   <li>{@link component.Output#isToBePredicted <em>To Be Predicted</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getOutput()
 * @model
 * @generated
 */
public interface Output extends IONode {

	/**
	 * Returns the value of the '<em><b>Faulty</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faulty</em>' attribute.
	 * @see #setFaulty(boolean)
	 * @see component.Component_Package#getOutput_Faulty()
	 * @model default="false"
	 * @generated
	 */
	boolean isFaulty();

	/**
	 * Sets the value of the '{@link component.Output#isFaulty <em>Faulty</em>}' attribute.
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
	 * @see component.Component_Package#getOutput_RunningNormally()
	 * @model default="false"
	 * @generated
	 */
	boolean isRunningNormally();

	/**
	 * Sets the value of the '{@link component.Output#isRunningNormally <em>Running Normally</em>}' attribute.
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
	 * @see component.Component_Package#getOutput_RunningAbnormally()
	 * @model default="false"
	 * @generated
	 */
	boolean isRunningAbnormally();

	/**
	 * Sets the value of the '{@link component.Output#isRunningAbnormally <em>Running Abnormally</em>}' attribute.
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
	 * @see component.Component_Package#getOutput_ToBePredicted()
	 * @model default="true"
	 * @generated
	 */
	boolean isToBePredicted();

	/**
	 * Sets the value of the '{@link component.Output#isToBePredicted <em>To Be Predicted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Predicted</em>' attribute.
	 * @see #isToBePredicted()
	 * @generated
	 */
	void setToBePredicted(boolean value);
} // Output
