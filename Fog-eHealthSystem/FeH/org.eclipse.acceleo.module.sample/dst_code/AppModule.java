		public class AppModule{

private static ApplicationcreateApplication
	  (	    String appId,	    Integer userId)
	{
Application application = Application.createApplication
 		( appId, userId);application. addAppModule(

		  10,		  "patient");


-----------------------------------
application. addAppModule(
		  10,		  "concentration_calculator");

-----------------------------------

application. addAppModule(
		  10,		  "connector");

-----------------------------------
application. addAppModule(
