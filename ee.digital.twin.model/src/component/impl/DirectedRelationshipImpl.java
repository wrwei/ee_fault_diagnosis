/**
 */
package component.impl;

import component.ComponentElement;
import component.Component_Package;
import component.DirectedRelationship;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link component.impl.DirectedRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link component.impl.DirectedRelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link component.impl.DirectedRelationshipImpl#isFaulty <em>Faulty</em>}</li>
 *   <li>{@link component.impl.DirectedRelationshipImpl#isRunningNormally <em>Running Normally</em>}</li>
 *   <li>{@link component.impl.DirectedRelationshipImpl#isRunningAbnormally <em>Running Abnormally</em>}</li>
 *   <li>{@link component.impl.DirectedRelationshipImpl#isToBePredicted <em>To Be Predicted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectedRelationshipImpl extends ComponentRelationshipImpl implements DirectedRelationship {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ComponentElement source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ComponentElement target;

	/**
	 * The default value of the '{@link #isFaulty() <em>Faulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFaulty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAULTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFaulty() <em>Faulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFaulty()
	 * @generated
	 * @ordered
	 */
	protected boolean faulty = FAULTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isRunningNormally() <em>Running Normally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunningNormally()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUNNING_NORMALLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunningNormally() <em>Running Normally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunningNormally()
	 * @generated
	 * @ordered
	 */
	protected boolean runningNormally = RUNNING_NORMALLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isRunningAbnormally() <em>Running Abnormally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunningAbnormally()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUNNING_ABNORMALLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunningAbnormally() <em>Running Abnormally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunningAbnormally()
	 * @generated
	 * @ordered
	 */
	protected boolean runningAbnormally = RUNNING_ABNORMALLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isToBePredicted() <em>To Be Predicted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToBePredicted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TO_BE_PREDICTED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isToBePredicted() <em>To Be Predicted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToBePredicted()
	 * @generated
	 * @ordered
	 */
	protected boolean toBePredicted = TO_BE_PREDICTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectedRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_Package.Literals.DIRECTED_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentElement getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ComponentElement)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Component_Package.DIRECTED_RELATIONSHIP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentElement basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ComponentElement newSource) {
		ComponentElement oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.DIRECTED_RELATIONSHIP__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentElement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ComponentElement)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Component_Package.DIRECTED_RELATIONSHIP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentElement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ComponentElement newTarget) {
		ComponentElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.DIRECTED_RELATIONSHIP__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFaulty() {
		return faulty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaulty(boolean newFaulty) {
		boolean oldFaulty = faulty;
		faulty = newFaulty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.DIRECTED_RELATIONSHIP__FAULTY, oldFaulty, faulty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunningNormally() {
		return runningNormally;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunningNormally(boolean newRunningNormally) {
		boolean oldRunningNormally = runningNormally;
		runningNormally = newRunningNormally;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.DIRECTED_RELATIONSHIP__RUNNING_NORMALLY, oldRunningNormally, runningNormally));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunningAbnormally() {
		return runningAbnormally;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunningAbnormally(boolean newRunningAbnormally) {
		boolean oldRunningAbnormally = runningAbnormally;
		runningAbnormally = newRunningAbnormally;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.DIRECTED_RELATIONSHIP__RUNNING_ABNORMALLY, oldRunningAbnormally, runningAbnormally));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToBePredicted() {
		return toBePredicted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBePredicted(boolean newToBePredicted) {
		boolean oldToBePredicted = toBePredicted;
		toBePredicted = newToBePredicted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.DIRECTED_RELATIONSHIP__TO_BE_PREDICTED, oldToBePredicted, toBePredicted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Component_Package.DIRECTED_RELATIONSHIP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case Component_Package.DIRECTED_RELATIONSHIP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case Component_Package.DIRECTED_RELATIONSHIP__FAULTY:
				return isFaulty();
			case Component_Package.DIRECTED_RELATIONSHIP__RUNNING_NORMALLY:
				return isRunningNormally();
			case Component_Package.DIRECTED_RELATIONSHIP__RUNNING_ABNORMALLY:
				return isRunningAbnormally();
			case Component_Package.DIRECTED_RELATIONSHIP__TO_BE_PREDICTED:
				return isToBePredicted();
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
			case Component_Package.DIRECTED_RELATIONSHIP__SOURCE:
				setSource((ComponentElement)newValue);
				return;
			case Component_Package.DIRECTED_RELATIONSHIP__TARGET:
				setTarget((ComponentElement)newValue);
				return;
			case Component_Package.DIRECTED_RELATIONSHIP__FAULTY:
				setFaulty((Boolean)newValue);
				return;
			case Component_Package.DIRECTED_RELATIONSHIP__RUNNING_NORMALLY:
				setRunningNormally((Boolean)newValue);
				return;
			case Component_Package.DIRECTED_RELATIONSHIP__RUNNING_ABNORMALLY:
				setRunningAbnormally((Boolean)newValue);
				return;
			case Component_Package.DIRECTED_RELATIONSHIP__TO_BE_PREDICTED:
				setToBePredicted((Boolean)newValue);
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
			case Component_Package.DIRECTED_RELATIONSHIP__SOURCE:
				setSource((ComponentElement)null);
				return;
			case Component_Package.DIRECTED_RELATIONSHIP__TARGET:
				setTarget((ComponentElement)null);
				return;
			case Component_Package.DIRECTED_RELATIONSHIP__FAULTY:
				setFaulty(FAULTY_EDEFAULT);
				return;
			case Component_Package.DIRECTED_RELATIONSHIP__RUNNING_NORMALLY:
				setRunningNormally(RUNNING_NORMALLY_EDEFAULT);
				return;
			case Component_Package.DIRECTED_RELATIONSHIP__RUNNING_ABNORMALLY:
				setRunningAbnormally(RUNNING_ABNORMALLY_EDEFAULT);
				return;
			case Component_Package.DIRECTED_RELATIONSHIP__TO_BE_PREDICTED:
				setToBePredicted(TO_BE_PREDICTED_EDEFAULT);
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
			case Component_Package.DIRECTED_RELATIONSHIP__SOURCE:
				return source != null;
			case Component_Package.DIRECTED_RELATIONSHIP__TARGET:
				return target != null;
			case Component_Package.DIRECTED_RELATIONSHIP__FAULTY:
				return faulty != FAULTY_EDEFAULT;
			case Component_Package.DIRECTED_RELATIONSHIP__RUNNING_NORMALLY:
				return runningNormally != RUNNING_NORMALLY_EDEFAULT;
			case Component_Package.DIRECTED_RELATIONSHIP__RUNNING_ABNORMALLY:
				return runningAbnormally != RUNNING_ABNORMALLY_EDEFAULT;
			case Component_Package.DIRECTED_RELATIONSHIP__TO_BE_PREDICTED:
				return toBePredicted != TO_BE_PREDICTED_EDEFAULT;
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
		result.append(" (faulty: ");
		result.append(faulty);
		result.append(", RunningNormally: ");
		result.append(runningNormally);
		result.append(", RunningAbnormally: ");
		result.append(runningAbnormally);
		result.append(", ToBePredicted: ");
		result.append(toBePredicted);
		result.append(')');
		return result.toString();
	}

} //DirectedRelationshipImpl
