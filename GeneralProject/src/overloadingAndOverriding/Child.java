package overloadingAndOverriding;

public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child chi = new Child();
		chi.add(1, 2);  //when you create object, it will show you only child class overridden method
	}

	
	public void add(int a,int b){
		System.out.println("i am overiden method from extended class");
		

	}
	
	public void extraMethod(){
		System.out.println("i am here for e demo");
	}
	
	
	
}
