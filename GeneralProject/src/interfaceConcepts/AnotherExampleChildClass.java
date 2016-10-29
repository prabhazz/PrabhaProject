package interfaceConcepts;

public class AnotherExampleChildClass extends AnotherExampleParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnotherExampleChildClass child = new AnotherExampleChildClass();
		child.implementation();
		
		AnotherExampleInterface inter = new AnotherExampleChildClass();
		inter.method1();
		
		
	}
	
	
	public void implementation(){
		AnotherExampleInterface another=new AnotherExampleParentClass();
		another.method1();
		another.implementationInInterface();
		
	}
	
	public void method3(){
		System.out.println("i am method 3 of child class");
	}
}
