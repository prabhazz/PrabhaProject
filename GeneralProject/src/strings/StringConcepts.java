package strings;

public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1= "value1";               //usual way, internally creates an object for String class in run time
		System.out.println("str1 is "+str1);    
		
		char[] chr = {'s','t','r','2','v','a','l','u','e'};            
		String str2 = new String(chr);       // explicitly creating object for String by passing char array
		System.out.println("str2 is "+str2);
		
		str2="updated String value";         //during compile time, it will kill the above str2 object and creates the new one for this operation
		System.out.println("updated str2 value is"+str2);
		
		
		
		
	}

}
