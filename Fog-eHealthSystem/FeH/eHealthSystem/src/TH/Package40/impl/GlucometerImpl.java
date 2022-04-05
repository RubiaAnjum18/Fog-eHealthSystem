/**
 */
package TH.Package40.impl;

import TH.Package40.Glucometer;
import TH.Package40.Glucose;
import TH.Package40.Package40Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glucometer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TH.Package40.impl.GlucometerImpl#getGlucose <em>Glucose</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlucometerImpl extends MinimalEObjectImpl.Container implements Glucometer {
	/**
	 * The cached value of the '{@link #getGlucose() <em>Glucose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlucose()
	 * @generated
	 * @ordered
	 */
	protected Glucose glucose;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlucometerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Package40Package.Literals.GLUCOMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Glucose getGlucose() {
		if (glucose != null && glucose.eIsProxy()) {
			InternalEObject oldGlucose = (InternalEObject)glucose;
			glucose = (Glucose)eResolveProxy(oldGlucose);
			if (glucose != oldGlucose) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Package40Package.GLUCOMETER__GLUCOSE, oldGlucose, glucose));
			}
		}
		return glucose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glucose basicGetGlucose() {
		return glucose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGlucose(Glucose newGlucose) {
		Glucose oldGlucose = glucose;
		glucose = newGlucose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Package40Package.GLUCOMETER__GLUCOSE, oldGlucose, glucose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Package40Package.GLUCOMETER__GLUCOSE:
				if (resolve) return getGlucose();
				return basicGetGlucose();
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
			case Package40Package.GLUCOMETER__GLUCOSE:
				setGlucose((Glucose)newValue);
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
			case Package40Package.GLUCOMETER__GLUCOSE:
				setGlucose((Glucose)null);
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
			case Package40Package.GLUCOMETER__GLUCOSE:
				return glucose != null;
		}
		return super.eIsSet(featureID);
	}

} //GlucometerImpl
