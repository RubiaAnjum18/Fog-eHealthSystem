/**
 */
package TH.impl;

import TH.Processing;
import TH.Storage;
import TH.THPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TH.impl.ProcessingImpl#getPat_ID <em>Pat ID</em>}</li>
 *   <li>{@link TH.impl.ProcessingImpl#getData_type <em>Data type</em>}</li>
 *   <li>{@link TH.impl.ProcessingImpl#getService_time <em>Service time</em>}</li>
 *   <li>{@link TH.impl.ProcessingImpl#getStorage <em>Storage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessingImpl extends MinimalEObjectImpl.Container implements Processing {
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
	 * The default value of the '{@link #getData_type() <em>Data type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_type()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData_type() <em>Data type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_type()
	 * @generated
	 * @ordered
	 */
	protected String data_type = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getService_time() <em>Service time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService_time()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getService_time() <em>Service time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService_time()
	 * @generated
	 * @ordered
	 */
	protected String service_time = SERVICE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected Storage storage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return THPackage.Literals.PROCESSING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.PROCESSING__PAT_ID, oldPat_ID, pat_ID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getData_type() {
		return data_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData_type(String newData_type) {
		String oldData_type = data_type;
		data_type = newData_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.PROCESSING__DATA_TYPE, oldData_type, data_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getService_time() {
		return service_time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setService_time(String newService_time) {
		String oldService_time = service_time;
		service_time = newService_time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.PROCESSING__SERVICE_TIME, oldService_time, service_time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Storage getStorage() {
		if (storage != null && storage.eIsProxy()) {
			InternalEObject oldStorage = (InternalEObject)storage;
			storage = (Storage)eResolveProxy(oldStorage);
			if (storage != oldStorage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, THPackage.PROCESSING__STORAGE, oldStorage, storage));
			}
		}
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storage basicGetStorage() {
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorage(Storage newStorage) {
		Storage oldStorage = storage;
		storage = newStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.PROCESSING__STORAGE, oldStorage, storage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void analysis() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case THPackage.PROCESSING__PAT_ID:
				return getPat_ID();
			case THPackage.PROCESSING__DATA_TYPE:
				return getData_type();
			case THPackage.PROCESSING__SERVICE_TIME:
				return getService_time();
			case THPackage.PROCESSING__STORAGE:
				if (resolve) return getStorage();
				return basicGetStorage();
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
			case THPackage.PROCESSING__PAT_ID:
				setPat_ID((Integer)newValue);
				return;
			case THPackage.PROCESSING__DATA_TYPE:
				setData_type((String)newValue);
				return;
			case THPackage.PROCESSING__SERVICE_TIME:
				setService_time((String)newValue);
				return;
			case THPackage.PROCESSING__STORAGE:
				setStorage((Storage)newValue);
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
			case THPackage.PROCESSING__PAT_ID:
				setPat_ID(PAT_ID_EDEFAULT);
				return;
			case THPackage.PROCESSING__DATA_TYPE:
				setData_type(DATA_TYPE_EDEFAULT);
				return;
			case THPackage.PROCESSING__SERVICE_TIME:
				setService_time(SERVICE_TIME_EDEFAULT);
				return;
			case THPackage.PROCESSING__STORAGE:
				setStorage((Storage)null);
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
			case THPackage.PROCESSING__PAT_ID:
				return pat_ID != PAT_ID_EDEFAULT;
			case THPackage.PROCESSING__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? data_type != null : !DATA_TYPE_EDEFAULT.equals(data_type);
			case THPackage.PROCESSING__SERVICE_TIME:
				return SERVICE_TIME_EDEFAULT == null ? service_time != null : !SERVICE_TIME_EDEFAULT.equals(service_time);
			case THPackage.PROCESSING__STORAGE:
				return storage != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case THPackage.PROCESSING___ANALYSIS:
				analysis();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", data_type: ");
		result.append(data_type);
		result.append(", service_time: ");
		result.append(service_time);
		result.append(')');
		return result.toString();
	}

} //ProcessingImpl
