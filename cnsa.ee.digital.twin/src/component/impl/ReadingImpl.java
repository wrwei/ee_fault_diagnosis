/**
 */
package component.impl;

import component.Component_Package;
import component.Reading;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link component.impl.ReadingImpl#getValue <em>Value</em>}</li>
 *   <li>{@link component.impl.ReadingImpl#getUpper_value <em>Upper value</em>}</li>
 *   <li>{@link component.impl.ReadingImpl#getLower_value <em>Lower value</em>}</li>
 *   <li>{@link component.impl.ReadingImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadingImpl extends ComponentAssetImpl implements Reading {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpper_value() <em>Upper value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper_value()
	 * @generated
	 * @ordered
	 */
	protected static final double UPPER_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUpper_value() <em>Upper value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper_value()
	 * @generated
	 * @ordered
	 */
	protected double upper_value = UPPER_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower_value() <em>Lower value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower_value()
	 * @generated
	 * @ordered
	 */
	protected static final double LOWER_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLower_value() <em>Lower value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower_value()
	 * @generated
	 * @ordered
	 */
	protected double lower_value = LOWER_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_Package.Literals.READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.READING__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUpper_value() {
		return upper_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpper_value(double newUpper_value) {
		double oldUpper_value = upper_value;
		upper_value = newUpper_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.READING__UPPER_VALUE, oldUpper_value, upper_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLower_value() {
		return lower_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLower_value(double newLower_value) {
		double oldLower_value = lower_value;
		lower_value = newLower_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.READING__LOWER_VALUE, oldLower_value, lower_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.READING__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Component_Package.READING__VALUE:
				return getValue();
			case Component_Package.READING__UPPER_VALUE:
				return getUpper_value();
			case Component_Package.READING__LOWER_VALUE:
				return getLower_value();
			case Component_Package.READING__UNIT:
				return getUnit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Component_Package.READING__VALUE:
				setValue((Double)newValue);
				return;
			case Component_Package.READING__UPPER_VALUE:
				setUpper_value((Double)newValue);
				return;
			case Component_Package.READING__LOWER_VALUE:
				setLower_value((Double)newValue);
				return;
			case Component_Package.READING__UNIT:
				setUnit((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Component_Package.READING__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case Component_Package.READING__UPPER_VALUE:
				setUpper_value(UPPER_VALUE_EDEFAULT);
				return;
			case Component_Package.READING__LOWER_VALUE:
				setLower_value(LOWER_VALUE_EDEFAULT);
				return;
			case Component_Package.READING__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Component_Package.READING__VALUE:
				return value != VALUE_EDEFAULT;
			case Component_Package.READING__UPPER_VALUE:
				return upper_value != UPPER_VALUE_EDEFAULT;
			case Component_Package.READING__LOWER_VALUE:
				return lower_value != LOWER_VALUE_EDEFAULT;
			case Component_Package.READING__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", upper_value: ");
		result.append(upper_value);
		result.append(", lower_value: ");
		result.append(lower_value);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //ReadingImpl
