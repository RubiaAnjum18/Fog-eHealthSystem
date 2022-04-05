/**
 */
package TH;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TH.EEG#getElectric_signal <em>Electric signal</em>}</li>
 * </ul>
 *
 * @see TH.THPackage#getEEG()
 * @model
 * @generated
 */
public interface EEG extends Sensor {
	/**
	 * Returns the value of the '<em><b>Electric signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electric signal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electric signal</em>' attribute.
	 * @see #setElectric_signal(String)
	 * @see TH.THPackage#getEEG_Electric_signal()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getElectric_signal();

	/**
	 * Sets the value of the '{@link TH.EEG#getElectric_signal <em>Electric signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electric signal</em>' attribute.
	 * @see #getElectric_signal()
	 * @generated
	 */
	void setElectric_signal(String value);

} // EEG
