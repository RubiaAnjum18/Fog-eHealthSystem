/**
 */
package TH.impl;

import TH.Device;
import TH.Storage;
import TH.THPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TH.impl.DeviceImpl#getDev_id <em>Dev id</em>}</li>
 *   <li>{@link TH.impl.DeviceImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link TH.impl.DeviceImpl#getStorage_size <em>Storage size</em>}</li>
 *   <li>{@link TH.impl.DeviceImpl#getStorage <em>Storage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device {
	/**
	 * The default value of the '{@link #getDev_id() <em>Dev id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDev_id()
	 * @generated
	 * @ordered
	 */
	protected static final int DEV_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDev_id() <em>Dev id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDev_id()
	 * @generated
	 * @ordered
	 */
	protected int dev_id = DEV_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessor() <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected String processor = PROCESSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorage_size() <em>Storage size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage_size()
	 * @generated
	 * @ordered
	 */
	protected static final String STORAGE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorage_size() <em>Storage size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage_size()
	 * @generated
	 * @ordered
	 */
	protected String storage_size = STORAGE_SIZE_EDEFAULT;

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
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return THPackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDev_id() {
		return dev_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDev_id(int newDev_id) {
		int oldDev_id = dev_id;
		dev_id = newDev_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.DEVICE__DEV_ID, oldDev_id, dev_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessor(String newProcessor) {
		String oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.DEVICE__PROCESSOR, oldProcessor, processor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStorage_size() {
		return storage_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorage_size(String newStorage_size) {
		String oldStorage_size = storage_size;
		storage_size = newStorage_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.DEVICE__STORAGE_SIZE, oldStorage_size, storage_size));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, THPackage.DEVICE__STORAGE, oldStorage, storage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.DEVICE__STORAGE, oldStorage, storage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case THPackage.DEVICE__DEV_ID:
				return getDev_id();
			case THPackage.DEVICE__PROCESSOR:
				return getProcessor();
			case THPackage.DEVICE__STORAGE_SIZE:
				return getStorage_size();
			case THPackage.DEVICE__STORAGE:
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
			case THPackage.DEVICE__DEV_ID:
				setDev_id((Integer)newValue);
				return;
			case THPackage.DEVICE__PROCESSOR:
				setProcessor((String)newValue);
				return;
			case THPackage.DEVICE__STORAGE_SIZE:
				setStorage_size((String)newValue);
				return;
			case THPackage.DEVICE__STORAGE:
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
			case THPackage.DEVICE__DEV_ID:
				setDev_id(DEV_ID_EDEFAULT);
				return;
			case THPackage.DEVICE__PROCESSOR:
				setProcessor(PROCESSOR_EDEFAULT);
				return;
			case THPackage.DEVICE__STORAGE_SIZE:
				setStorage_size(STORAGE_SIZE_EDEFAULT);
				return;
			case THPackage.DEVICE__STORAGE:
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
			case THPackage.DEVICE__DEV_ID:
				return dev_id != DEV_ID_EDEFAULT;
			case THPackage.DEVICE__PROCESSOR:
				return PROCESSOR_EDEFAULT == null ? processor != null : !PROCESSOR_EDEFAULT.equals(processor);
			case THPackage.DEVICE__STORAGE_SIZE:
				return STORAGE_SIZE_EDEFAULT == null ? storage_size != null : !STORAGE_SIZE_EDEFAULT.equals(storage_size);
			case THPackage.DEVICE__STORAGE:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dev_id: ");
		result.append(dev_id);
		result.append(", processor: ");
		result.append(processor);
		result.append(", storage_size: ");
		result.append(storage_size);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
