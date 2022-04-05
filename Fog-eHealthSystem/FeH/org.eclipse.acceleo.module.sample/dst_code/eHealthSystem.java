		public class EHealthSystem{
package org.fog.test.perfeval; 
 
import java.util.ArrayList; 
import java.util.Calendar; 
import java.util.LinkedList; 
import java.util.List; 
 
import org.cloudbus.cloudsim.Host; 
import org.cloudbus.cloudsim.Log; 
import org.cloudbus.cloudsim.Pe; 
import org.cloudbus.cloudsim.Storage; 
import org.cloudbus.cloudsim.core.CloudSim; 
import org.cloudbus.cloudsim.power.PowerHost; 
import org.cloudbus.cloudsim.provisioners.RamProvisionerSimple; 
import org.cloudbus.cloudsim.sdn.overbooking.BwProvisionerOverbooking; 
import org.cloudbus.cloudsim.sdn.overbooking.PeProvisionerOverbooking; 
import org.fog.application.AppEdge; 
import org.fog.application.AppLoop; 
import org.fog.application.Application; 
import org.fog.application.selectivity.FractionalSelectivity; 
import org.fog.entities.Actuator; 
import org.fog.entities.FogBroker; 
import org.fog.entities.FogDevice; 
import org.fog.entities.FogDeviceCharacteristics; 
import org.fog.entities.Sensor; 
import org.fog.entities.Tuple; 
import org.fog.placement.Controller; 
import org.fog.placement.ModuleMapping; 
import org.fog.placement.ModulePlacementEdgewards; 
import org.fog.placement.ModulePlacementMapping; 
import org.fog.policy.AppModuleAllocationPolicy; 
import org.fog.scheduler.StreamOperatorScheduler; 
import org.fog.utils.FogLinearPowerModel; 
import org.fog.utils.FogUtils; 
import org.fog.utils.TimeKeeper; 
import org.fog.utils.distribution.DeterministicDistribution; 
 
/** 
 * Simulation setup for case study - Intelligent Surveillance 
 */ 

public class eHealthSystem {

	static List<EEG> sensors = new ArrayList<sensors>();
	static List<Actuator> actuators = new ArrayList<actuators>();
	static List<FogDevice> devices = new ArrayList<devices>();
		 static int numOfDepts  =  2;

		 static int numOfMobilesPerDept  =  4;

		 static int EEG_TRANSMISSION_TIME  =  5.1;
private static boolean CLOUD = false;

public static void main(args String) 
{
