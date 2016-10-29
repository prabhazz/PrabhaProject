package abstracttion;

public abstract class Parent {

	protected String variable1="value"; // abstract can have variables
	
	//abstract methods
	public abstract void abstractMethod1();
	public abstract void abstractMethod2();
	
	//non abstract methods
	public static void nonAbstractMethod(){
		System.out.println("i am non abstract method");
		//System.out.println(nadi);
	}
	
}
