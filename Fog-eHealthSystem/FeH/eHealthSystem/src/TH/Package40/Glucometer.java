/**
 */
package TH.Package40;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glucometer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TH.Package40.Glucometer#getGlucose <em>Glucose</em>}</li>
 * </ul>
 *
 * @see TH.Package40.Package40Package#getGlucometer()
 * @model
 * @generated
 */
public interface Glucometer extends EObject {
	/**
	 * Returns the value of the '<em><b>Glucose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glucose</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glucose</em>' reference.
	 * @see #setGlucose(Glucose)
	 * @see TH.Package40.Package40Package#getGlucometer_Glucose()
	 * @model ordered="false"
	 * @generated
	 */
	Glucose getGlucose();

	/**
	 * Sets the value of the '{@link TH.Package40.Glucometer#getGlucose <em>Glucose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glucose</em>' reference.
	 * @see #getGlucose()
	 * @generated
	 */
	void setGlucose(Glucose value);

} // Glucometer
