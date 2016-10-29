package interfaceConcepts;

public class BMWCar implements Car {

	public static void main(String[] args) {

		BMWCar bmw = new BMWCar();
		bmw.start();
		Car.automaticDoorClose();   // see here static method has been simply used with class name
		bmw.automaticDoorClose();
		bmw.stop();
		bmw.automaticWiperOnRain(); // default method has to be accessed by object
		bmw.calculatingMaxSpeed();  //using the constants of interface
		
	}

	public void automaticDoorClose(){
		System.out.println("automatic door close has been overridden");
	}
	
	@Override
	public void start() {
		System.out.println("will start");
		
	}

	@Override
	public void accelerate() {
		System.out.println("will stop");
		
	}

	@Override
	public void gearShist() {
		System.out.println("will shift gear");
		
	}

	@Override
	public void stop() {
		System.out.println("will stop");
		
	}
	
	private void calculatingMaxSpeed(){
		System.out.println("maximum speed is"+Car.maxSpeed);
	}

}
