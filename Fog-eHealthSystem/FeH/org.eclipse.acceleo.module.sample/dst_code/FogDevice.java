		public class FogDevice{
private static void 
createFogDevices

( Integer userId, String appId)
{
FogDevice cloud = 
	createFogDevice(

"cloud"
,44800
,4000
,100
,10000
,0
,0.1
,103.0
,83.25
);

cloud.setParentId();
 fogDevices.add(cloud);

FogDevice

proxy=
	createFogDevice(
"proxy-server"
,2800
,4000
,10000
,10000
,1
,0.0
,107.339
,83.4333
);
proxy.setParentId
(cloud.

getId);

proxy.
);

 fogDevices.add(proxy); 
    for(int i=0;i<numOfDepts;i++){ 
      addGw(i+"", userId, appId, proxy.getId()); 
    } 
  } 

private static FogDevice 

addGw

( String id, Integer userId, String appId, Integer parentId)
{
FogDevice  =

	createFogDevice(



fogDevices.add();


 for(int i=0;i<numOfMobilesPerDept;i++){ 
      String mobileId = id+"-"+i; 

FogDevice mobile =

	createFogDevice(
"m-"
,1000
,1000
,10000
,270
,3
,0.0
,87.53
,82.44
);
FogDevice
(mobileId, userId, appId, 
 .getId());
      
fogDevices.add(mobile);
}

dept.
);


FogDevice dept.
setParentId();
return dept
}


private static FogDevice 

addMobile

( String id, Integer userId, String appId, Integer parentId)
{
FogDevicemobile =

mobile.setParentId());

Sensor eegSensor = new Sensor ("s-"+id, "EEG", userId, appId, 
DeterministicDistribution new (
		));
sensors.add(eegSensor);

Actuator display = new Actuator ("a-"+id, userId, appId, "DISPALY")
actuators.add(display);
 eegSensor.setGatewayDeviceId(mobile.getId()); 
    eegSensor.setLatency(1.0); 
display.setGatewayDeviceId(

mobile.
getId());

display.setLatency();

return mobile
}

private static FogDevice


createFogDevice(

 String nodeName, ELong mips, Integer ram, ELong upBw, ELong downBw, Integer level, EDouble ratePerMips, EDouble busyPower, EDouble idlePower)

{
