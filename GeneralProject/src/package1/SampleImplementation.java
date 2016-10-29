package package1;

public class SampleImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//gonna add two numbers
		
		
		
//		 int number1 =3;
//		 int number2=1;
//		
		int sumIs;
		int minusIs;


		SampleImplementation sample = new SampleImplementation();
		
		
		sumIs =		sample.sumMyTwoNumbers(2, 1);
		//minusIs=	sample.minusMyTwoNumbers(2, 1);
		
		
		System.out.println(sumIs);
		//System.out.println(minusIs);
		
		
		
	}

    private int sumMyTwoNumbers(int a,int b){
    	int output = 0;
    	
    	output=a+b;
    	System.out.println("sum method");
    	return output;
    }
	
    private int minusMyTwoNumbers(int a,int b){
    	int output = 0;
    	
    	output=a+b;
    	System.out.println("minuns two numbers");
    	return output;
    }
	
	
	
}
