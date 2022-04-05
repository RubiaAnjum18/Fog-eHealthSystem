/**
 */
package TH;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TH.Device#getDev_id <em>Dev id</em>}</li>
 *   <li>{@link TH.Device#getProcessor <em>Processor</em>}</li>
 *   <li>{@link TH.Device#getStorage_size <em>Storage size</em>}</li>
 *   <li>{@link TH.Device#getStorage <em>Storage</em>}</li>
 * </ul>
 *
 * @see TH.THPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject {
	/**
	 * Returns the value of the '<em><b>Dev id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dev id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dev id</em>' attribute.
	 * @see #setDev_id(int)
	 * @see TH.THPackage#getDevice_Dev_id()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getDev_id();

	/**
	 * Sets the value of the '{@link TH.Device#getDev_id <em>Dev id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dev id</em>' attribute.
	 * @see #getDev_id()
	 * @generated
	 */
	void setDev_id(int value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' attribute.
	 * @see #setProcessor(String)
	 * @see TH.THPackage#getDevice_Processor()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getProcessor();

	/**
	 * Sets the value of the '{@link TH.Device#getProcessor <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' attribute.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(String value);

	/**
	 * Returns the value of the '<em><b>Storage size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage size</em>' attribute.
	 * @see #setStorage_size(String)
	 * @see TH.THPackage#getDevice_Storage_size()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getStorage_size();

	/**
	 * Sets the value of the '{@link TH.Device#getStorage_size <em>Storage size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage size</em>' attribute.
	 * @see #getStorage_size()
	 * @generated
	 */
	void setStorage_size(String value);

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
	 * @see TH.THPackage#getDevice_Storage()
	 * @model ordered="false"
	 * @generated
	 */
	Storage getStorage();

	/**
	 * Sets the value of the '{@link TH.Device#getStorage <em>Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' reference.
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(Storage value);

} // Device
