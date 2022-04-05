/**
 */
package TH;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TH.Scheduler#getTime <em>Time</em>}</li>
 *   <li>{@link TH.Scheduler#getDetector <em>Detector</em>}</li>
 *   <li>{@link TH.Scheduler#getCommunicator <em>Communicator</em>}</li>
 *   <li>{@link TH.Scheduler#getExecutor <em>Executor</em>}</li>
 *   <li>{@link TH.Scheduler#getStorage <em>Storage</em>}</li>
 *   <li>{@link TH.Scheduler#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @see TH.THPackage#getScheduler()
 * @model
 * @generated
 */
public interface Scheduler extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see TH.THPackage#getScheduler_Time()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link TH.Scheduler#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

	/**
	 * Returns the value of the '<em><b>Detector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detector</em>' reference.
	 * @see #setDetector(Detector)
	 * @see TH.THPackage#getScheduler_Detector()
	 * @model ordered="false"
	 * @generated
	 */
	Detector getDetector();

	/**
	 * Sets the value of the '{@link TH.Scheduler#getDetector <em>Detector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detector</em>' reference.
	 * @see #getDetector()
	 * @generated
	 */
	void setDetector(Detector value);

	/**
	 * Returns the value of the '<em><b>Communicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communicator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communicator</em>' reference.
	 * @see #setCommunicator(Communicator)
	 * @see TH.THPackage#getScheduler_Communicator()
	 * @model ordered="false"
	 * @generated
	 */
	Communicator getCommunicator();

	/**
	 * Sets the value of the '{@link TH.Scheduler#getCommunicator <em>Communicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communicator</em>' reference.
	 * @see #getCommunicator()
	 * @generated
	 */
	void setCommunicator(Communicator value);

	/**
	 * Returns the value of the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executor</em>' reference.
	 * @see #setExecutor(Executor)
	 * @see TH.THPackage#getScheduler_Executor()
	 * @model ordered="false"
	 * @generated
	 */
	Executor getExecutor();

	/**
	 * Sets the value of the '{@link TH.Scheduler#getExecutor <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' reference.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(Executor value);

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
	 * @see TH.THPackage#getScheduler_Storage()
	 * @model ordered="false"
	 * @generated
	 */
	Storage getStorage();

	/**
	 * Sets the value of the '{@link TH.Scheduler#getStorage <em>Storage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' reference.
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(Storage value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' reference.
	 * @see #setController(Controller)
	 * @see TH.THPackage#getScheduler_Controller()
	 * @model ordered="false"
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link TH.Scheduler#getController <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Controller value);

} // Scheduler
