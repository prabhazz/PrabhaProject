package overloadingAndOverriding;

public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Parent();
		
		//method overloading example
		//can achieve only in same class. have horizontal in mind like ---------------------------------------
		//in the same class, keeping the method name as same with different number of argument or different types of arguments
		//
		parent.add(1, 1);
		parent.add("a","b");
		parent.add(1, 2, 3, 4);
		
		//method overriding example
		//overriding happens in vertical fashion
		//parent class method can be overriden by child class with same name and same type and same number of arguments.
		//creating a object for child class will show you only one add (which belongs to child, becuase it has been overriden)
		Child child = new Child();
		child.add(1, 2);
		
	}

	
	public void add(int a,int b){
		System.out.println("adding two integers");
	}
	public  void add(String a,String b){
		System.out.println("adding two string");
	}	
	public void add(int a, int b,int c){
		System.out.println("i am second overloaded method");
	}
	public  void add (int a , int b,int c,int d){
		System.out.println("i am third overloaded method");
	}
	
	
	
}
