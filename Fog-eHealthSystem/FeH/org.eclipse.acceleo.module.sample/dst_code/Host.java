		public class Host{
			 Integer hostId  =  0;

			 ELong storage  =  1000000;

			 Integer Bw  =  10000;

PowerHost host = new PowerHost (hostId,	new RamProvisionerSimple(ram),new BwProvisionerOverbooking(bw),
				storage,peList,	new StreamOperatorScheduler(peList),new FogLinearPowerModel(busyPower, idlePower));

List <Host> hostList = new ArrayList<Host> ();
hostList.add(host);
