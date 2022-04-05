/**
 */
package TH;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TH.Communicator#getExecutor <em>Executor</em>}</li>
 * </ul>
 *
 * @see TH.THPackage#getCommunicator()
 * @model
 * @generated
 */
public interface Communicator extends EObject {
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
	 * @see TH.THPackage#getCommunicator_Executor()
	 * @model ordered="false"
	 * @generated
	 */
	Executor getExecutor();

	/**
	 * Sets the value of the '{@link TH.Communicator#getExecutor <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executor</em>' reference.
	 * @see #getExecutor()
	 * @generated
	 */
	void setExecutor(Executor value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Communicate();

} // Communicator
