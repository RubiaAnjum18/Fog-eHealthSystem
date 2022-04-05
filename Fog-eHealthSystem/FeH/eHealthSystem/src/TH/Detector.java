/**
 */
package TH;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Detector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TH.Detector#getCommunicator <em>Communicator</em>}</li>
 *   <li>{@link TH.Detector#getSensor <em>Sensor</em>}</li>
 *   <li>{@link TH.Detector#getProcessing <em>Processing</em>}</li>
 * </ul>
 *
 * @see TH.THPackage#getDetector()
 * @model
 * @generated
 */
public interface Detector extends EObject {
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
	 * @see TH.THPackage#getDetector_Communicator()
	 * @model ordered="false"
	 * @generated
	 */
	Communicator getCommunicator();

	/**
	 * Sets the value of the '{@link TH.Detector#getCommunicator <em>Communicator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communicator</em>' reference.
	 * @see #getCommunicator()
	 * @generated
	 */
	void setCommunicator(Communicator value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see TH.THPackage#getDetector_Sensor()
	 * @model ordered="false"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link TH.Detector#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

	/**
	 * Returns the value of the '<em><b>Processing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing</em>' reference.
	 * @see #setProcessing(Processing)
	 * @see TH.THPackage#getDetector_Processing()
	 * @model ordered="false"
	 * @generated
	 */
	Processing getProcessing();

	/**
	 * Sets the value of the '{@link TH.Detector#getProcessing <em>Processing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing</em>' reference.
	 * @see #getProcessing()
	 * @generated
	 */
	void setProcessing(Processing value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Detects();

} // Detector
