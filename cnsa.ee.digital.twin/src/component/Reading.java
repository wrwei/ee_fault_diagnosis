/**
 */
package component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.Reading#getValue <em>Value</em>}</li>
 *   <li>{@link component.Reading#getUpper_value <em>Upper value</em>}</li>
 *   <li>{@link component.Reading#getLower_value <em>Lower value</em>}</li>
 *   <li>{@link component.Reading#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getReading()
 * @model
 * @generated
 */
public interface Reading extends ComponentAsset {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see component.Component_Package#getReading_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link component.Reading#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Upper value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper value</em>' attribute.
	 * @see #setUpper_value(double)
	 * @see component.Component_Package#getReading_Upper_value()
	 * @model
	 * @generated
	 */
	double getUpper_value();

	/**
	 * Sets the value of the '{@link component.Reading#getUpper_value <em>Upper value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper value</em>' attribute.
	 * @see #getUpper_value()
	 * @generated
	 */
	void setUpper_value(double value);

	/**
	 * Returns the value of the '<em><b>Lower value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower value</em>' attribute.
	 * @see #setLower_value(double)
	 * @see component.Component_Package#getReading_Lower_value()
	 * @model
	 * @generated
	 */
	double getLower_value();

	/**
	 * Sets the value of the '{@link component.Reading#getLower_value <em>Lower value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower value</em>' attribute.
	 * @see #getLower_value()
	 * @generated
	 */
	void setLower_value(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see component.Component_Package#getReading_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link component.Reading#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

} // Reading
