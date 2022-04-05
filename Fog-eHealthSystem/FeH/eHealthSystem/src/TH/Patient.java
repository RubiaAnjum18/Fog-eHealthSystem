/**
 */
package TH;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TH.Patient#getPat_ID <em>Pat ID</em>}</li>
 *   <li>{@link TH.Patient#getActivity_type <em>Activity type</em>}</li>
 *   <li>{@link TH.Patient#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see TH.THPackage#getPatient()
 * @model
 * @generated
 */
public interface Patient extends EObject {
	/**
	 * Returns the value of the '<em><b>Pat ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pat ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pat ID</em>' attribute.
	 * @see #setPat_ID(int)
	 * @see TH.THPackage#getPatient_Pat_ID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPat_ID();

	/**
	 * Sets the value of the '{@link TH.Patient#getPat_ID <em>Pat ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pat ID</em>' attribute.
	 * @see #getPat_ID()
	 * @generated
	 */
	void setPat_ID(int value);

	/**
	 * Returns the value of the '<em><b>Activity type</b></em>' attribute.
	 * The literals are from the enumeration {@link TH.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity type</em>' attribute.
	 * @see TH.Activity
	 * @see #setActivity_type(Activity)
	 * @see TH.THPackage#getPatient_Activity_type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Activity getActivity_type();

	/**
	 * Sets the value of the '{@link TH.Patient#getActivity_type <em>Activity type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity type</em>' attribute.
	 * @see TH.Activity
	 * @see #getActivity_type()
	 * @generated
	 */
	void setActivity_type(Activity value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' reference.
	 * @see #setDevice(Device)
	 * @see TH.THPackage#getPatient_Device()
	 * @model ordered="false"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link TH.Patient#getDevice <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

} // Patient
