package package1;

public class MethodOverloadingAndOverriding {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MethodOverloadingAndOverriding overloading = new MethodOverloadingAndOverriding();
//		overloading.add(1, 1);
//		overloading.add(1,1 , 1);
//		overloading.add(1, 1, 1, 1);
//		
//		
//	}

	
	public void add(int a,int b){
		System.out.println("i am first overloaded method");
	}
	public void add(int a, int b,int c){
		System.out.println("i am second overloaded method");
	}
	public void add (int a , int b,int c,int d){
		System.out.println("i am third overloaded method");
	}
	
	
	
}
