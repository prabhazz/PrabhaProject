package exceptionConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionClass {

	public static void main(String[] args) throws FileNotFoundException, CustomErrorClass {
		// TODO Auto-generated method stub

		int i =2;
		int j=0;
		int k;
		
		try {
			k=i/j;     //unchecked exception
			System.out.println("value of k is "+k);
		} catch (Exception e) {
			
			System.out.println("something went wrong");
			e.printStackTrace();
		}
		
		finally{
			System.out.println("i am in finally block");
		}
		
		try {
			String stringVariable=null;
			stringVariable.charAt(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//throw new NullPointerException("this is from explicit null pointer exception");
			throw new CustomErrorClass();
		}
		
		System.out.println("normal flow continues");    //although exception occurs, this line gets executed which means program flow continues after exception
		//System.out.println("hi");

		//checked exception / throws   
		//whenever you extend some class, compiler asks you to handle it using "throws" or "try catch"
		//this is because the parent class didnt handled the exception and they designed it like throws in their constructors
		//so when you try to create a object either you have to handle it by try catch or using throws as they did.
		//so this gives the user an opportunity to catch the exception in their own way.
		FileInputStream fis = new FileInputStream("name");   
		
		
		
		
	}

}
