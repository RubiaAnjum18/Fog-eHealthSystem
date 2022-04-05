/**
 */
package TH.impl;

import TH.EEG;
import TH.THPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TH.impl.EEGImpl#getElectric_signal <em>Electric signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEGImpl extends SensorImpl implements EEG {
	/**
	 * The default value of the '{@link #getElectric_signal() <em>Electric signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectric_signal()
	 * @generated
	 * @ordered
	 */
	protected static final String ELECTRIC_SIGNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElectric_signal() <em>Electric signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectric_signal()
	 * @generated
	 * @ordered
	 */
	protected String electric_signal = ELECTRIC_SIGNAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return THPackage.Literals.EEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElectric_signal() {
		return electric_signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElectric_signal(String newElectric_signal) {
		String oldElectric_signal = electric_signal;
		electric_signal = newElectric_signal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.EEG__ELECTRIC_SIGNAL, oldElectric_signal, electric_signal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case THPackage.EEG__ELECTRIC_SIGNAL:
				return getElectric_signal();
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
			case THPackage.EEG__ELECTRIC_SIGNAL:
				setElectric_signal((String)newValue);
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
			case THPackage.EEG__ELECTRIC_SIGNAL:
				setElectric_signal(ELECTRIC_SIGNAL_EDEFAULT);
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
			case THPackage.EEG__ELECTRIC_SIGNAL:
				return ELECTRIC_SIGNAL_EDEFAULT == null ? electric_signal != null : !ELECTRIC_SIGNAL_EDEFAULT.equals(electric_signal);
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
		result.append(" (electric_signal: ");
		result.append(electric_signal);
		result.append(')');
		return result.toString();
	}

} //EEGImpl
