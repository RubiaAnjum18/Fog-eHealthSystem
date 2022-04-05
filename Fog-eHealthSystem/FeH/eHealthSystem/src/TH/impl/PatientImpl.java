/**
 */
package TH.impl;

import TH.Activity;
import TH.Device;
import TH.Patient;
import TH.THPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TH.impl.PatientImpl#getPat_ID <em>Pat ID</em>}</li>
 *   <li>{@link TH.impl.PatientImpl#getActivity_type <em>Activity type</em>}</li>
 *   <li>{@link TH.impl.PatientImpl#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientImpl extends MinimalEObjectImpl.Container implements Patient {
	/**
	 * The default value of the '{@link #getPat_ID() <em>Pat ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPat_ID()
	 * @generated
	 * @ordered
	 */
	protected static final int PAT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPat_ID() <em>Pat ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPat_ID()
	 * @generated
	 * @ordered
	 */
	protected int pat_ID = PAT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivity_type() <em>Activity type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity_type()
	 * @generated
	 * @ordered
	 */
	protected static final Activity ACTIVITY_TYPE_EDEFAULT = Activity.WALKING;

	/**
	 * The cached value of the '{@link #getActivity_type() <em>Activity type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity_type()
	 * @generated
	 * @ordered
	 */
	protected Activity activity_type = ACTIVITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Device device;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return THPackage.Literals.PATIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPat_ID() {
		return pat_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPat_ID(int newPat_ID) {
		int oldPat_ID = pat_ID;
		pat_ID = newPat_ID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.PATIENT__PAT_ID, oldPat_ID, pat_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getActivity_type() {
		return activity_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivity_type(Activity newActivity_type) {
		Activity oldActivity_type = activity_type;
		activity_type = newActivity_type == null ? ACTIVITY_TYPE_EDEFAULT : newActivity_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.PATIENT__ACTIVITY_TYPE, oldActivity_type, activity_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Device getDevice() {
		if (device != null && device.eIsProxy()) {
			InternalEObject oldDevice = (InternalEObject)device;
			device = (Device)eResolveProxy(oldDevice);
			if (device != oldDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, THPackage.PATIENT__DEVICE, oldDevice, device));
			}
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevice(Device newDevice) {
		Device oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.PATIENT__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case THPackage.PATIENT__PAT_ID:
				return getPat_ID();
			case THPackage.PATIENT__ACTIVITY_TYPE:
				return getActivity_type();
			case THPackage.PATIENT__DEVICE:
				if (resolve) return getDevice();
				return basicGetDevice();
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
			case THPackage.PATIENT__PAT_ID:
				setPat_ID((Integer)newValue);
				return;
			case THPackage.PATIENT__ACTIVITY_TYPE:
				setActivity_type((Activity)newValue);
				return;
			case THPackage.PATIENT__DEVICE:
				setDevice((Device)newValue);
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
			case THPackage.PATIENT__PAT_ID:
				setPat_ID(PAT_ID_EDEFAULT);
				return;
			case THPackage.PATIENT__ACTIVITY_TYPE:
				setActivity_type(ACTIVITY_TYPE_EDEFAULT);
				return;
			case THPackage.PATIENT__DEVICE:
				setDevice((Device)null);
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
			case THPackage.PATIENT__PAT_ID:
				return pat_ID != PAT_ID_EDEFAULT;
			case THPackage.PATIENT__ACTIVITY_TYPE:
				return activity_type != ACTIVITY_TYPE_EDEFAULT;
			case THPackage.PATIENT__DEVICE:
				return device != null;
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
		result.append(" (Pat_ID: ");
		result.append(pat_ID);
		result.append(", Activity_type: ");
		result.append(activity_type);
		result.append(')');
		return result.toString();
	}

} //PatientImpl
