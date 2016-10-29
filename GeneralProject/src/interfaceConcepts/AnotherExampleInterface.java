package interfaceConcepts;

public interface AnotherExampleInterface {

	public void method1();
	public void method2();
	
	public default void implementationInInterface(){
		
		System.out.println("this is an implementation in interface");
		
	}
	
}
