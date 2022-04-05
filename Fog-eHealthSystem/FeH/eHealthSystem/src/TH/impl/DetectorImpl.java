/**
 */
package TH.impl;

import TH.Communicator;
import TH.Detector;
import TH.Processing;
import TH.Sensor;
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
 * An implementation of the model object '<em><b>Detector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TH.impl.DetectorImpl#getCommunicator <em>Communicator</em>}</li>
 *   <li>{@link TH.impl.DetectorImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link TH.impl.DetectorImpl#getProcessing <em>Processing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetectorImpl extends MinimalEObjectImpl.Container implements Detector {
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
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected Sensor sensor;

	/**
	 * The cached value of the '{@link #getProcessing() <em>Processing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessing()
	 * @generated
	 * @ordered
	 */
	protected Processing processing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return THPackage.Literals.DETECTOR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, THPackage.DETECTOR__COMMUNICATOR, oldCommunicator, communicator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.DETECTOR__COMMUNICATOR, oldCommunicator, communicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor getSensor() {
		if (sensor != null && sensor.eIsProxy()) {
			InternalEObject oldSensor = (InternalEObject)sensor;
			sensor = (Sensor)eResolveProxy(oldSensor);
			if (sensor != oldSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, THPackage.DETECTOR__SENSOR, oldSensor, sensor));
			}
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor basicGetSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensor(Sensor newSensor) {
		Sensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.DETECTOR__SENSOR, oldSensor, sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Processing getProcessing() {
		if (processing != null && processing.eIsProxy()) {
			InternalEObject oldProcessing = (InternalEObject)processing;
			processing = (Processing)eResolveProxy(oldProcessing);
			if (processing != oldProcessing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, THPackage.DETECTOR__PROCESSING, oldProcessing, processing));
			}
		}
		return processing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processing basicGetProcessing() {
		return processing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessing(Processing newProcessing) {
		Processing oldProcessing = processing;
		processing = newProcessing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, THPackage.DETECTOR__PROCESSING, oldProcessing, processing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Detects() {
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
			case THPackage.DETECTOR__COMMUNICATOR:
				if (resolve) return getCommunicator();
				return basicGetCommunicator();
			case THPackage.DETECTOR__SENSOR:
				if (resolve) return getSensor();
				return basicGetSensor();
			case THPackage.DETECTOR__PROCESSING:
				if (resolve) return getProcessing();
				return basicGetProcessing();
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
			case THPackage.DETECTOR__COMMUNICATOR:
				setCommunicator((Communicator)newValue);
				return;
			case THPackage.DETECTOR__SENSOR:
				setSensor((Sensor)newValue);
				return;
			case THPackage.DETECTOR__PROCESSING:
				setProcessing((Processing)newValue);
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
			case THPackage.DETECTOR__COMMUNICATOR:
				setCommunicator((Communicator)null);
				return;
			case THPackage.DETECTOR__SENSOR:
				setSensor((Sensor)null);
				return;
			case THPackage.DETECTOR__PROCESSING:
				setProcessing((Processing)null);
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
			case THPackage.DETECTOR__COMMUNICATOR:
				return communicator != null;
			case THPackage.DETECTOR__SENSOR:
				return sensor != null;
			case THPackage.DETECTOR__PROCESSING:
				return processing != null;
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
			case THPackage.DETECTOR___DETECTS:
				Detects();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DetectorImpl
