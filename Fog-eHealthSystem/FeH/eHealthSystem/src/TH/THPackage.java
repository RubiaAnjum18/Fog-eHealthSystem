/**
 */
package TH;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see TH.THFactory
 * @model kind="package"
 * @generated
 */
public interface THPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TH";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///TH.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TH";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	THPackage eINSTANCE = TH.impl.THPackageImpl.init();

	/**
	 * The meta object id for the '{@link TH.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TH.impl.PatientImpl
	 * @see TH.impl.THPackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 0;

	/**
	 * The feature id for the '<em><b>Pat ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__PAT_ID = 0;

	/**
	 * The feature id for the '<em><b>Activity type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ACTIVITY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__DEVICE = 2;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TH.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TH.impl.DeviceImpl
	 * @see TH.impl.THPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Dev id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DEV_ID = 0;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PROCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Storage size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__STORAGE_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__STORAGE = 3;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TH.impl.StorageImpl <em>Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TH.impl.StorageImpl
	 * @see TH.impl.THPackageImpl#getStorage()
	 * @generated
	 */
	int STORAGE = 2;

	/**
	 * The number of structural features of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE___ADD = 0;

	/**
	 * The number of operations of the '<em>Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link TH.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TH.impl.SensorImpl
	 * @see TH.impl.THPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DEVICE = 2;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PATIENT = 3;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TH.impl.DetectorImpl <em>Detector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TH.impl.DetectorImpl
	 * @see TH.impl.THPackageImpl#getDetector()
	 * @generated
	 */
	int DETECTOR = 4;

	/**
	 * The feature id for the '<em><b>Communicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__COMMUNICATOR = 0;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Processing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR__PROCESSING = 2;

	/**
	 * The number of structural features of the '<em>Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Detects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR___DETECTS = 0;

	/**
	 * The number of operations of the '<em>Detector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETECTOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link TH.impl.CommunicatorImpl <em>Communicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TH.impl.CommunicatorImpl
	 * @see TH.impl.THPackageImpl#getCommunicator()
	 * @generated
	 */
	int COMMUNICATOR = 5;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATOR__EXECUTOR = 0;

	/**
	 * The number of structural features of the '<em>Communicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATOR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Communicate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATOR___COMMUNICATE = 0;

	/**
	 * The number of operations of the '<em>Communicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link TH.impl.ExecutorImpl <em>Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TH.impl.ExecutorImpl
	 * @see TH.impl.THPackageImpl#getExecutor()
	 * @generated
	 */
	int EXECUTOR = 6;

	/**
	 * The number of structural features of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR___EXECUTE = 0;

	/**
	 * The number of operations of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link TH.impl.ProcessingImpl <em>Processing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TH.impl.ProcessingImpl
	 * @see TH.impl.THPackageImpl#getProcessing()
	 * @generated
	 */
	int PROCESSING = 7;

	/**
	 * The feature id for the '<em><b>Pat ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING__PAT_ID = 0;

	/**
	 * The feature id for the '<em><b>Data type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Service time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING__SERVICE_TIME = 2;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING__STORAGE = 3;

	/**
	 * The number of structural features of the '<em>Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING___ANALYSIS = 0;

	/**
	 * The number of operations of the '<em>Processing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link TH.impl.SchedulerImpl <em>Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TH.impl.SchedulerImpl
	 * @see TH.impl.THPackageImpl#getScheduler()
	 * @generated
	 */
	int SCHEDULER = 8;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__TIME = 0;

	/**
	 * The feature id for the '<em><b>Detector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__DETECTOR = 1;

	/**
	 * The feature id for the '<em><b>Communicator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__COMMUNICATOR = 2;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__EXECUTOR = 3;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__STORAGE = 4;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__CONTROLLER = 5;

	/**
	 * The number of structural features of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TH.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TH.impl.ControllerImpl
	 * @see TH.impl.THPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 9;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PERFORMANCE = 0;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__EXECUTOR = 1;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Control</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER___CONTROL = 0;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link TH.impl.PerformanceImpl <em>Performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TH.impl.PerformanceImpl
	 * @see TH.impl.THPackageImpl#getPerformance()
	 * @generated
	 */
	int PERFORMANCE = 10;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__LATENCY = 0;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__BANDWIDTH = 1;

	/**
	 * The number of structural features of the '<em>Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TH.impl.EEGImpl <em>EEG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TH.impl.EEGImpl
	 * @see TH.impl.THPackageImpl#getEEG()
	 * @generated
	 */
	int EEG = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEG__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEG__TYPE = SENSOR__TYPE;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEG__DEVICE = SENSOR__DEVICE;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEG__PATIENT = SENSOR__PATIENT;

	/**
	 * The feature id for the '<em><b>Electric signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEG__ELECTRIC_SIGNAL = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEG_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EEG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEG_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TH.Activity <em>Activity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TH.Activity
	 * @see TH.impl.THPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 12;


	/**
	 * Returns the meta object for class '{@link TH.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see TH.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the attribute '{@link TH.Patient#getPat_ID <em>Pat ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pat ID</em>'.
	 * @see TH.Patient#getPat_ID()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Pat_ID();

	/**
	 * Returns the meta object for the attribute '{@link TH.Patient#getActivity_type <em>Activity type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity type</em>'.
	 * @see TH.Patient#getActivity_type()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Activity_type();

	/**
	 * Returns the meta object for the reference '{@link TH.Patient#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see TH.Patient#getDevice()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Device();

	/**
	 * Returns the meta object for class '{@link TH.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see TH.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link TH.Device#getDev_id <em>Dev id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dev id</em>'.
	 * @see TH.Device#getDev_id()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Dev_id();

	/**
	 * Returns the meta object for the attribute '{@link TH.Device#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor</em>'.
	 * @see TH.Device#getProcessor()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Processor();

	/**
	 * Returns the meta object for the attribute '{@link TH.Device#getStorage_size <em>Storage size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage size</em>'.
	 * @see TH.Device#getStorage_size()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Storage_size();

	/**
	 * Returns the meta object for the reference '{@link TH.Device#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Storage</em>'.
	 * @see TH.Device#getStorage()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Storage();

	/**
	 * Returns the meta object for class '{@link TH.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage</em>'.
	 * @see TH.Storage
	 * @generated
	 */
	EClass getStorage();

	/**
	 * Returns the meta object for the '{@link TH.Storage#add() <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see TH.Storage#add()
	 * @generated
	 */
	EOperation getStorage__Add();

	/**
	 * Returns the meta object for class '{@link TH.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see TH.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link TH.Sensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TH.Sensor#getName()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Name();

	/**
	 * Returns the meta object for the attribute '{@link TH.Sensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see TH.Sensor#getType()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Type();

	/**
	 * Returns the meta object for the reference '{@link TH.Sensor#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see TH.Sensor#getDevice()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Device();

	/**
	 * Returns the meta object for the reference list '{@link TH.Sensor#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Patient</em>'.
	 * @see TH.Sensor#getPatient()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Patient();

	/**
	 * Returns the meta object for class '{@link TH.Detector <em>Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detector</em>'.
	 * @see TH.Detector
	 * @generated
	 */
	EClass getDetector();

	/**
	 * Returns the meta object for the reference '{@link TH.Detector#getCommunicator <em>Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communicator</em>'.
	 * @see TH.Detector#getCommunicator()
	 * @see #getDetector()
	 * @generated
	 */
	EReference getDetector_Communicator();

	/**
	 * Returns the meta object for the reference '{@link TH.Detector#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see TH.Detector#getSensor()
	 * @see #getDetector()
	 * @generated
	 */
	EReference getDetector_Sensor();

	/**
	 * Returns the meta object for the reference '{@link TH.Detector#getProcessing <em>Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processing</em>'.
	 * @see TH.Detector#getProcessing()
	 * @see #getDetector()
	 * @generated
	 */
	EReference getDetector_Processing();

	/**
	 * Returns the meta object for the '{@link TH.Detector#Detects() <em>Detects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Detects</em>' operation.
	 * @see TH.Detector#Detects()
	 * @generated
	 */
	EOperation getDetector__Detects();

	/**
	 * Returns the meta object for class '{@link TH.Communicator <em>Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communicator</em>'.
	 * @see TH.Communicator
	 * @generated
	 */
	EClass getCommunicator();

	/**
	 * Returns the meta object for the reference '{@link TH.Communicator#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executor</em>'.
	 * @see TH.Communicator#getExecutor()
	 * @see #getCommunicator()
	 * @generated
	 */
	EReference getCommunicator_Executor();

	/**
	 * Returns the meta object for the '{@link TH.Communicator#Communicate() <em>Communicate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Communicate</em>' operation.
	 * @see TH.Communicator#Communicate()
	 * @generated
	 */
	EOperation getCommunicator__Communicate();

	/**
	 * Returns the meta object for class '{@link TH.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor</em>'.
	 * @see TH.Executor
	 * @generated
	 */
	EClass getExecutor();

	/**
	 * Returns the meta object for the '{@link TH.Executor#Execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see TH.Executor#Execute()
	 * @generated
	 */
	EOperation getExecutor__Execute();

	/**
	 * Returns the meta object for class '{@link TH.Processing <em>Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing</em>'.
	 * @see TH.Processing
	 * @generated
	 */
	EClass getProcessing();

	/**
	 * Returns the meta object for the attribute '{@link TH.Processing#getPat_ID <em>Pat ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pat ID</em>'.
	 * @see TH.Processing#getPat_ID()
	 * @see #getProcessing()
	 * @generated
	 */
	EAttribute getProcessing_Pat_ID();

	/**
	 * Returns the meta object for the attribute '{@link TH.Processing#getData_type <em>Data type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data type</em>'.
	 * @see TH.Processing#getData_type()
	 * @see #getProcessing()
	 * @generated
	 */
	EAttribute getProcessing_Data_type();

	/**
	 * Returns the meta object for the attribute '{@link TH.Processing#getService_time <em>Service time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service time</em>'.
	 * @see TH.Processing#getService_time()
	 * @see #getProcessing()
	 * @generated
	 */
	EAttribute getProcessing_Service_time();

	/**
	 * Returns the meta object for the reference '{@link TH.Processing#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Storage</em>'.
	 * @see TH.Processing#getStorage()
	 * @see #getProcessing()
	 * @generated
	 */
	EReference getProcessing_Storage();

	/**
	 * Returns the meta object for the '{@link TH.Processing#analysis() <em>Analysis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Analysis</em>' operation.
	 * @see TH.Processing#analysis()
	 * @generated
	 */
	EOperation getProcessing__Analysis();

	/**
	 * Returns the meta object for class '{@link TH.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler</em>'.
	 * @see TH.Scheduler
	 * @generated
	 */
	EClass getScheduler();

	/**
	 * Returns the meta object for the attribute '{@link TH.Scheduler#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see TH.Scheduler#getTime()
	 * @see #getScheduler()
	 * @generated
	 */
	EAttribute getScheduler_Time();

	/**
	 * Returns the meta object for the reference '{@link TH.Scheduler#getDetector <em>Detector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Detector</em>'.
	 * @see TH.Scheduler#getDetector()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Detector();

	/**
	 * Returns the meta object for the reference '{@link TH.Scheduler#getCommunicator <em>Communicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communicator</em>'.
	 * @see TH.Scheduler#getCommunicator()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Communicator();

	/**
	 * Returns the meta object for the reference '{@link TH.Scheduler#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executor</em>'.
	 * @see TH.Scheduler#getExecutor()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Executor();

	/**
	 * Returns the meta object for the reference '{@link TH.Scheduler#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Storage</em>'.
	 * @see TH.Scheduler#getStorage()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Storage();

	/**
	 * Returns the meta object for the reference '{@link TH.Scheduler#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller</em>'.
	 * @see TH.Scheduler#getController()
	 * @see #getScheduler()
	 * @generated
	 */
	EReference getScheduler_Controller();

	/**
	 * Returns the meta object for class '{@link TH.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see TH.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the reference '{@link TH.Controller#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Performance</em>'.
	 * @see TH.Controller#getPerformance()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Performance();

	/**
	 * Returns the meta object for the reference '{@link TH.Controller#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executor</em>'.
	 * @see TH.Controller#getExecutor()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Executor();

	/**
	 * Returns the meta object for the '{@link TH.Controller#Control() <em>Control</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Control</em>' operation.
	 * @see TH.Controller#Control()
	 * @generated
	 */
	EOperation getController__Control();

	/**
	 * Returns the meta object for class '{@link TH.Performance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance</em>'.
	 * @see TH.Performance
	 * @generated
	 */
	EClass getPerformance();

	/**
	 * Returns the meta object for the attribute '{@link TH.Performance#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency</em>'.
	 * @see TH.Performance#getLatency()
	 * @see #getPerformance()
	 * @generated
	 */
	EAttribute getPerformance_Latency();

	/**
	 * Returns the meta object for the attribute '{@link TH.Performance#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth</em>'.
	 * @see TH.Performance#getBandwidth()
	 * @see #getPerformance()
	 * @generated
	 */
	EAttribute getPerformance_Bandwidth();

	/**
	 * Returns the meta object for class '{@link TH.EEG <em>EEG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEG</em>'.
	 * @see TH.EEG
	 * @generated
	 */
	EClass getEEG();

	/**
	 * Returns the meta object for the attribute '{@link TH.EEG#getElectric_signal <em>Electric signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Electric signal</em>'.
	 * @see TH.EEG#getElectric_signal()
	 * @see #getEEG()
	 * @generated
	 */
	EAttribute getEEG_Electric_signal();

	/**
	 * Returns the meta object for enum '{@link TH.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activity</em>'.
	 * @see TH.Activity
	 * @generated
	 */
	EEnum getActivity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	THFactory getTHFactory();

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
		 * The meta object literal for the '{@link TH.impl.PatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TH.impl.PatientImpl
		 * @see TH.impl.THPackageImpl#getPatient()
		 * @generated
		 */
		EClass PATIENT = eINSTANCE.getPatient();

		/**
		 * The meta object literal for the '<em><b>Pat ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__PAT_ID = eINSTANCE.getPatient_Pat_ID();

		/**
		 * The meta object literal for the '<em><b>Activity type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__ACTIVITY_TYPE = eINSTANCE.getPatient_Activity_type();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__DEVICE = eINSTANCE.getPatient_Device();

		/**
		 * The meta object literal for the '{@link TH.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TH.impl.DeviceImpl
		 * @see TH.impl.THPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Dev id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__DEV_ID = eINSTANCE.getDevice_Dev_id();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__PROCESSOR = eINSTANCE.getDevice_Processor();

		/**
		 * The meta object literal for the '<em><b>Storage size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__STORAGE_SIZE = eINSTANCE.getDevice_Storage_size();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__STORAGE = eINSTANCE.getDevice_Storage();

		/**
		 * The meta object literal for the '{@link TH.impl.StorageImpl <em>Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TH.impl.StorageImpl
		 * @see TH.impl.THPackageImpl#getStorage()
		 * @generated
		 */
		EClass STORAGE = eINSTANCE.getStorage();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STORAGE___ADD = eINSTANCE.getStorage__Add();

		/**
		 * The meta object literal for the '{@link TH.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TH.impl.SensorImpl
		 * @see TH.impl.THPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__NAME = eINSTANCE.getSensor_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TYPE = eINSTANCE.getSensor_Type();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__DEVICE = eINSTANCE.getSensor_Device();

		/**
		 * The meta object literal for the '<em><b>Patient</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__PATIENT = eINSTANCE.getSensor_Patient();

		/**
		 * The meta object literal for the '{@link TH.impl.DetectorImpl <em>Detector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TH.impl.DetectorImpl
		 * @see TH.impl.THPackageImpl#getDetector()
		 * @generated
		 */
		EClass DETECTOR = eINSTANCE.getDetector();

		/**
		 * The meta object literal for the '<em><b>Communicator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETECTOR__COMMUNICATOR = eINSTANCE.getDetector_Communicator();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETECTOR__SENSOR = eINSTANCE.getDetector_Sensor();

		/**
		 * The meta object literal for the '<em><b>Processing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETECTOR__PROCESSING = eINSTANCE.getDetector_Processing();

		/**
		 * The meta object literal for the '<em><b>Detects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DETECTOR___DETECTS = eINSTANCE.getDetector__Detects();

		/**
		 * The meta object literal for the '{@link TH.impl.CommunicatorImpl <em>Communicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TH.impl.CommunicatorImpl
		 * @see TH.impl.THPackageImpl#getCommunicator()
		 * @generated
		 */
		EClass COMMUNICATOR = eINSTANCE.getCommunicator();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATOR__EXECUTOR = eINSTANCE.getCommunicator_Executor();

		/**
		 * The meta object literal for the '<em><b>Communicate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMUNICATOR___COMMUNICATE = eINSTANCE.getCommunicator__Communicate();

		/**
		 * The meta object literal for the '{@link TH.impl.ExecutorImpl <em>Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TH.impl.ExecutorImpl
		 * @see TH.impl.THPackageImpl#getExecutor()
		 * @generated
		 */
		EClass EXECUTOR = eINSTANCE.getExecutor();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTOR___EXECUTE = eINSTANCE.getExecutor__Execute();

		/**
		 * The meta object literal for the '{@link TH.impl.ProcessingImpl <em>Processing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TH.impl.ProcessingImpl
		 * @see TH.impl.THPackageImpl#getProcessing()
		 * @generated
		 */
		EClass PROCESSING = eINSTANCE.getProcessing();

		/**
		 * The meta object literal for the '<em><b>Pat ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING__PAT_ID = eINSTANCE.getProcessing_Pat_ID();

		/**
		 * The meta object literal for the '<em><b>Data type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING__DATA_TYPE = eINSTANCE.getProcessing_Data_type();

		/**
		 * The meta object literal for the '<em><b>Service time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING__SERVICE_TIME = eINSTANCE.getProcessing_Service_time();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING__STORAGE = eINSTANCE.getProcessing_Storage();

		/**
		 * The meta object literal for the '<em><b>Analysis</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSING___ANALYSIS = eINSTANCE.getProcessing__Analysis();

		/**
		 * The meta object literal for the '{@link TH.impl.SchedulerImpl <em>Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TH.impl.SchedulerImpl
		 * @see TH.impl.THPackageImpl#getScheduler()
		 * @generated
		 */
		EClass SCHEDULER = eINSTANCE.getScheduler();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULER__TIME = eINSTANCE.getScheduler_Time();

		/**
		 * The meta object literal for the '<em><b>Detector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__DETECTOR = eINSTANCE.getScheduler_Detector();

		/**
		 * The meta object literal for the '<em><b>Communicator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__COMMUNICATOR = eINSTANCE.getScheduler_Communicator();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__EXECUTOR = eINSTANCE.getScheduler_Executor();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__STORAGE = eINSTANCE.getScheduler_Storage();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULER__CONTROLLER = eINSTANCE.getScheduler_Controller();

		/**
		 * The meta object literal for the '{@link TH.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TH.impl.ControllerImpl
		 * @see TH.impl.THPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__PERFORMANCE = eINSTANCE.getController_Performance();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__EXECUTOR = eINSTANCE.getController_Executor();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTROLLER___CONTROL = eINSTANCE.getController__Control();

		/**
		 * The meta object literal for the '{@link TH.impl.PerformanceImpl <em>Performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TH.impl.PerformanceImpl
		 * @see TH.impl.THPackageImpl#getPerformance()
		 * @generated
		 */
		EClass PERFORMANCE = eINSTANCE.getPerformance();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE__LATENCY = eINSTANCE.getPerformance_Latency();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE__BANDWIDTH = eINSTANCE.getPerformance_Bandwidth();

		/**
		 * The meta object literal for the '{@link TH.impl.EEGImpl <em>EEG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TH.impl.EEGImpl
		 * @see TH.impl.THPackageImpl#getEEG()
		 * @generated
		 */
		EClass EEG = eINSTANCE.getEEG();

		/**
		 * The meta object literal for the '<em><b>Electric signal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEG__ELECTRIC_SIGNAL = eINSTANCE.getEEG_Electric_signal();

		/**
		 * The meta object literal for the '{@link TH.Activity <em>Activity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TH.Activity
		 * @see TH.impl.THPackageImpl#getActivity()
		 * @generated
		 */
		EEnum ACTIVITY = eINSTANCE.getActivity();

	}

} //THPackage
