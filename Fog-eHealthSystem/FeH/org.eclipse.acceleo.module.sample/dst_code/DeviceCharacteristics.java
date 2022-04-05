		public class DeviceCharacteristics{
			 ArchType architecture  =  org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@497ad6c2 (name: x86, visibility: <unset>);	
			 OSType os  =  org.eclipse.uml2.uml.internal.impl.EnumerationLiteralImpl@6726ab85 (name: Linux, visibility: <unset>);	
			 String vmm  =  "Xen";

			 EDouble timezone  =  10.0;	
			 EDouble costPerSec  =  3.0;	
			 EDouble costPerMem  =  0.05;	
			 EDouble costPerStorage  =  0.001;	
			 EDouble costPerBw  =  0.0;	
LinkedList<Storage> 
 = new LinkedList<Storage> ();



FogDeviceCharacteristics characteristics = new FogDeviceCharacteristics (

			  architecture ,	
			  os ,	
			  vmm ,	
			  timezone ,	
			  costPerSec ,	
			  costPerMem ,	
			  costPerStorage ,	
			  costPerBw ,	)

FogDevice  fogdevice = null; 
 
 try { 
   fogdevice = new FogDevice(FogDevice(nodeName, characteristics,new AppModuleAllocationPolicy(hostList), storageList, 10,upBw, downBw, 0, ratePerMips); 
 }

catch (Exception e)
 { 
      e.printStackTrace();
}
fogdevice.setLevel(level);
 return fogdevice; 
  } 
