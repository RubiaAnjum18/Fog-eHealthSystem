/**
 */
package TH.Package40;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TH.Package40.Package40Factory
 * @model kind="package"
 * @generated
 */
public interface Package40Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Package40";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///TH/Package40.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TH.Package40";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Package40Package eINSTANCE = TH.Package40.impl.Package40PackageImpl.init();

	/**
	 * The meta object id for the '{@link TH.Package40.impl.GlucoseImpl <em>Glucose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TH.Package40.impl.GlucoseImpl
	 * @see TH.Package40.impl.Package40PackageImpl#getGlucose()
	 * @generated
	 */
	int GLUCOSE = 0;

	/**
	 * The number of structural features of the '<em>Glucose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Glucose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TH.Package40.impl.GlucometerImpl <em>Glucometer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TH.Package40.impl.GlucometerImpl
	 * @see TH.Package40.impl.Package40PackageImpl#getGlucometer()
	 * @generated
	 */
	int GLUCOMETER = 1;

	/**
	 * The feature id for the '<em><b>Glucose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOMETER__GLUCOSE = 0;

	/**
	 * The number of structural features of the '<em>Glucometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Glucometer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUCOMETER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link TH.Package40.Glucose <em>Glucose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glucose</em>'.
	 * @see TH.Package40.Glucose
	 * @generated
	 */
	EClass getGlucose();

	/**
	 * Returns the meta object for class '{@link TH.Package40.Glucometer <em>Glucometer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glucometer</em>'.
	 * @see TH.Package40.Glucometer
	 * @generated
	 */
	EClass getGlucometer();

	/**
	 * Returns the meta object for the reference '{@link TH.Package40.Glucometer#getGlucose <em>Glucose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Glucose</em>'.
	 * @see TH.Package40.Glucometer#getGlucose()
	 * @see #getGlucometer()
	 * @generated
	 */
	EReference getGlucometer_Glucose();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Package40Factory getPackage40Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TH.Package40.impl.GlucoseImpl <em>Glucose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TH.Package40.impl.GlucoseImpl
		 * @see TH.Package40.impl.Package40PackageImpl#getGlucose()
		 * @generated
		 */
		EClass GLUCOSE = eINSTANCE.getGlucose();

		/**
		 * The meta object literal for the '{@link TH.Package40.impl.GlucometerImpl <em>Glucometer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TH.Package40.impl.GlucometerImpl
		 * @see TH.Package40.impl.Package40PackageImpl#getGlucometer()
		 * @generated
		 */
		EClass GLUCOMETER = eINSTANCE.getGlucometer();

		/**
		 * The meta object literal for the '<em><b>Glucose</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLUCOMETER__GLUCOSE = eINSTANCE.getGlucometer_Glucose();

	}

} //Package40Package
