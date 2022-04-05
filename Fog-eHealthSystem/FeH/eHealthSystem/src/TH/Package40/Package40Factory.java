/**
 */
package TH.Package40;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TH.Package40.Package40Package
 * @generated
 */
public interface Package40Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Package40Factory eINSTANCE = TH.Package40.impl.Package40FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Glucose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glucose</em>'.
	 * @generated
	 */
	Glucose createGlucose();

	/**
	 * Returns a new object of class '<em>Glucometer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glucometer</em>'.
	 * @generated
	 */
	Glucometer createGlucometer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Package40Package getPackage40Package();

} //Package40Factory
