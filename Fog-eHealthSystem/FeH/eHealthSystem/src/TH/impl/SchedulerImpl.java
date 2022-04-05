/**
 */
package TH.impl;

import TH.Communicator;
import TH.Controller;
import TH.Detector;
import TH.Executor;
import TH.Scheduler;
import TH.Storage;
import TH.THPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TH.impl.SchedulerImpl#getTime <em>Time</em>}</li>
 *   <li>{@link TH.impl.SchedulerImpl#getDetector <em>Detector</em>}</li>
 *   <li>{@link TH.impl.SchedulerImpl#getCommunicator <em>Communicator</em>}</li>
 *   <li>{@link TH.impl.SchedulerImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link TH.impl.SchedulerImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link TH.impl.SchedulerImpl#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulerImpl extends MinimalEObjectImpl.Container implements Scheduler {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDetector() <em>Detector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetector()
	 * @generated
	 * @ordered
	 */
	protected Detector detector;

	/**
	 * The cached value of the '{@link #getCommunicator() <em>Communicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicator()
	 * @generated
	 * @ordered
	 */
	protected Communicator communicator;

	/**
	 * The cached value of the '{@link #getExecutor() <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected Executor executor;

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
	 * The cached value of the '{@link #getController() <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected Controller controller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return THPackage.Literals.SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.SCHEDULER__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Detector getDetector() {
		if (detector != null && detector.eIsProxy()) {
			InternalEObject oldDetector = (InternalEObject)detector;
			detector = (Detector)eResolveProxy(oldDetector);
			if (detector != oldDetector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, THPackage.SCHEDULER__DETECTOR, oldDetector, detector));
			}
		}
		return detector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Detector basicGetDetector() {
		return detector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetector(Detector newDetector) {
		Detector oldDetector = detector;
		detector = newDetector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.SCHEDULER__DETECTOR, oldDetector, detector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Communicator getCommunicator() {
		if (communicator != null && communicator.eIsProxy()) {
			InternalEObject oldCommunicator = (InternalEObject)communicator;
			communicator = (Communicator)eResolveProxy(oldCommunicator);
			if (communicator != oldCommunicator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, THPackage.SCHEDULER__COMMUNICATOR, oldCommunicator, communicator));
			}
		}
		return communicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communicator basicGetCommunicator() {
		return communicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicator(Communicator newCommunicator) {
		Communicator oldCommunicator = communicator;
		communicator = newCommunicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.SCHEDULER__COMMUNICATOR, oldCommunicator, communicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Executor getExecutor() {
		if (executor != null && executor.eIsProxy()) {
			InternalEObject oldExecutor = (InternalEObject)executor;
			executor = (Executor)eResolveProxy(oldExecutor);
			if (executor != oldExecutor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, THPackage.SCHEDULER__EXECUTOR, oldExecutor, executor));
			}
		}
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor basicGetExecutor() {
		return executor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutor(Executor newExecutor) {
		Executor oldExecutor = executor;
		executor = newExecutor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.SCHEDULER__EXECUTOR, oldExecutor, executor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, THPackage.SCHEDULER__STORAGE, oldStorage, storage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.SCHEDULER__STORAGE, oldStorage, storage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller getController() {
		if (controller != null && controller.eIsProxy()) {
			InternalEObject oldController = (InternalEObject)controller;
			controller = (Controller)eResolveProxy(oldController);
			if (controller != oldController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, THPackage.SCHEDULER__CONTROLLER, oldController, controller));
			}
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller basicGetController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setController(Controller newController) {
		Controller oldController = controller;
		controller = newController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.SCHEDULER__CONTROLLER, oldController, controller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case THPackage.SCHEDULER__TIME:
				return getTime();
			case THPackage.SCHEDULER__DETECTOR:
				if (resolve) return getDetector();
				return basicGetDetector();
			case THPackage.SCHEDULER__COMMUNICATOR:
				if (resolve) return getCommunicator();
				return basicGetCommunicator();
			case THPackage.SCHEDULER__EXECUTOR:
				if (resolve) return getExecutor();
				return basicGetExecutor();
			case THPackage.SCHEDULER__STORAGE:
				if (resolve) return getStorage();
				return basicGetStorage();
			case THPackage.SCHEDULER__CONTROLLER:
				if (resolve) return getController();
				return basicGetController();
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
			case THPackage.SCHEDULER__TIME:
				setTime((String)newValue);
				return;
			case THPackage.SCHEDULER__DETECTOR:
				setDetector((Detector)newValue);
				return;
			case THPackage.SCHEDULER__COMMUNICATOR:
				setCommunicator((Communicator)newValue);
				return;
			case THPackage.SCHEDULER__EXECUTOR:
				setExecutor((Executor)newValue);
				return;
			case THPackage.SCHEDULER__STORAGE:
				setStorage((Storage)newValue);
				return;
			case THPackage.SCHEDULER__CONTROLLER:
				setController((Controller)newValue);
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
			case THPackage.SCHEDULER__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case THPackage.SCHEDULER__DETECTOR:
				setDetector((Detector)null);
				return;
			case THPackage.SCHEDULER__COMMUNICATOR:
				setCommunicator((Communicator)null);
				return;
			case THPackage.SCHEDULER__EXECUTOR:
				setExecutor((Executor)null);
				return;
			case THPackage.SCHEDULER__STORAGE:
				setStorage((Storage)null);
				return;
			case THPackage.SCHEDULER__CONTROLLER:
				setController((Controller)null);
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
			case THPackage.SCHEDULER__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case THPackage.SCHEDULER__DETECTOR:
				return detector != null;
			case THPackage.SCHEDULER__COMMUNICATOR:
				return communicator != null;
			case THPackage.SCHEDULER__EXECUTOR:
				return executor != null;
			case THPackage.SCHEDULER__STORAGE:
				return storage != null;
			case THPackage.SCHEDULER__CONTROLLER:
				return controller != null;
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
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //SchedulerImpl
