package interfaceConcepts;

public class AnotherExampleParentClass implements AnotherExampleInterface {

	@Override
	public void method1() {
		System.out.println("1 i am returning value from parent class not interface");
		
	}

	@Override
	public void method2() {
		System.out.println("2 i am returning value from class not interface");
		
	}

	public void method3(){
		System.out.println("i am method 3 of parent class");
	}
	
	public void method4(){
		System.out.println("i am method 3 of parent class");
	}	
}
