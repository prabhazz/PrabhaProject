package collections;

public class GeneralClass {
	int number;
	String Name;

	public GeneralClass(int number, String Name){
		this.number=number;
		this.Name=Name;
	}
	
	public void printStudentDetails(){
		System.out.println("number is "+number);
		System.out.println("Name is "+Name);
	}
	
	public void printNumber(){
		System.out.println("number is "+number);
	}
	
	public void printName(){
		System.out.println("Name is "+Name);
	}
	
}
