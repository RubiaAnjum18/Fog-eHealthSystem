/**
 */
package TH;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TH.Controller#getPerformance <em>Performance</em>}</li>
 *   <li>{@link TH.Controller#getExecutor <em>Executor</em>}</li>
 * </ul>
 *
 * @see TH.THPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends EObject {
	/**
	 * Returns the value of the '<em><b>Performance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' reference.
	 * @see #setPerformance(Performance)
	 * @see TH.THPackage#getController_Performance()
	 * @model ordered="false"
	 * @generated
	 */
	Performance getPerformance();

	/**
	 * Sets the value of the '{@link TH.Controller#getPerformance <em>Performance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance</em>' reference.
	 * @see #getPerformance()
	 * @generated
	 */
	void setPerformance(Performance value);

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
	 * @see TH.THPackage#getController_Executor()
	 * @model ordered="false"
	 * @generated
	 */
	Executor getExecutor();

	/**
	 * Sets the value of the '{@link TH.Controller#getExecutor <em>Executor</em>}' reference.
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
	void Control();

} // Controller
