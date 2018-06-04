# The facade pattern: 
It provides a unified interface (i.e. interaction/connexion) to a set of interfaces in a subsystem.
Facade defines a higher-level interface that makes the subsystem easier to use.
	 
>  client use the facade of the subsystem(computer = set of classes) to communicate with the subsystem, otherwise it would be too complex for the client to go directly and communicate with the classes of the subsystem (like hard drive which the client should know everything about), facade provides a simplified interface to a larger body of code, so we put under an umbrella all the system that needs to be abstracted out and we use the facade to communicate with that subsystem (e.g. facade.harddrive.setOn/setOff ...) as opposed to the client that has to know everything about all subsystem. Hence, the classes are decoupled from the client and used through the facade interface.
