/**
 */
package TH;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TH.Processing#getPat_ID <em>Pat ID</em>}</li>
 *   <li>{@link TH.Processing#getData_type <em>Data type</em>}</li>
 *   <li>{@link TH.Processing#getService_time <em>Service time</em>}</li>
 *   <li>{@link TH.Processing#getStorage <em>Storage</em>}</li>
 * </ul>
 *
 * @see TH.THPackage#getProcessing()
 * @model
 * @generated
 */
public interface Processing extends EObject {
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
	 * @see TH.THPackage#getProcessing_Pat_ID()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPat_ID();

	/**
	 * Sets the value of the '{@link TH.Processing#getPat_ID <em>Pat ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pat ID</em>' attribute.
	 * @see #getPat_ID()
	 * @generated
	 */
	void setPat_ID(int value);

	/**
	 * Returns the value of the '<em><b>Data type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data type</em>' attribute.
	 * @see #setData_type(String)
	 * @see TH.THPackage#getProcessing_Data_type()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getData_type();

	/**
	 * Sets the value of the '{@link TH.Processing#getData_type <em>Data type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data type</em>' attribute.
	 * @see #getData_type()
	 * @generated
	 */
	void setData_type(String value);

	/**
	 * Returns the value of the '<em><b>Service time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service time</em>' attribute.
	 * @see #setService_time(String)
	 * @see TH.THPackage#getProcessing_Service_time()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getService_time();

	/**
	 * Sets the value of the '{@link TH.Processing#getService_time <em>Service time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service time</em>' attribute.
	 * @see #getService_time()
	 * @generated
	 */
	void setService_time(String value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' reference.
	 * @see #setStorage(Storage)
	 * @see TH.THPackage#getProcessing_Storage()
	 * @model ordered="false"
	 * @generated
	 */
	Storage getStorage();

	/**
	 * Sets the value of the '{@link TH.Processing#getStorage <em>Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' reference.
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(Storage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void analysis();

} // Processing
