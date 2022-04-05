		public class AppEdge{
if(EEG_TRANSMISSION_TIME==10)
 application.addAppEdgeaddAppEdge(

"EEG"
,"patient"
,3000.0
,500.0
,"EEG"
,"UP"
,"SENSOR"
);
else
application.addAppEdgeaddAppEdge(

"patient"
,"concentration_calculator"
,3500.0
,500.0
,"_SENSOR"
,"UP"
,"MODULE"
);

 
application.addAppEdgeaddAppEdge(

"connector"
,"patient"
,28.0
,1000.0
,"GLOBAL_GAME_STATE"
,"DOWN"
,"MODULE"
);


 
application.addAppEdgeaddAppEdge(

);

 
application.addAppEdgeaddAppEdge(

"EEG"
,"patient"
,3000.0
,500.0
,"EEG"
,"UP"
,"SENSOR"
);


application.addAppEdgeaddAppEdge(

"patient"
,"DISPLAY"
,1000.0
,500.0
,"SELF_STATE_UPDATE"
,"DOWN"
,"ACTUATOR"
);

