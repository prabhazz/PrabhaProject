package package1;

public class ExtendsMethodOverloadingAndOverriding extends MethodOverloadingAndOverriding{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ExtendsMethodOverloadingAndOverriding obj1 = new ExtendsMethodOverloadingAndOverriding();
		MethodOverloadingAndOverriding obj2 = new MethodOverloadingAndOverriding();
	//	obj1.add();
		obj1.add(1, 2);
		obj2.add(2, 3);
//		obj1.extra
		
	}

//	private void extra(){
//		System.out.println("i am belongs to child class");
//	}
	
	public void add(int a,int b){
		System.out.println("i am overiden method from extended class");
		
		
	}
	
	
	
	
}
