package interfaceConcepts;

public interface Car {

	//below variables were public static final in nature, no need to mention it explicitly
	int maxSpeed = 100;
	int minSpeed = 20;
	
	//abstract methods
	abstract void start();
	abstract void accelerate();	
	abstract void gearShist();
	abstract void stop();
	
	//static methods
	static void automaticDoorClose(){
		System.out.println("door will be automatically closed");
	}
	
	//default methods
	default void automaticWiperOnRain(){
		System.out.println("Glass will be wiped automatically on rain");
	}
	
	
}
