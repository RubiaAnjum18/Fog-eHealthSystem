		public class Application{
		String appId  =  "eHealth";

FogBroker broker = new FogBroker("broker");

Application application = createApplication(
 appId,broker.
getId());

Application.setUserId(broker.
getId());

createFogDevices(broker.
getId(),
		 appId)
