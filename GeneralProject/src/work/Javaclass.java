package work;

public class Javaclass {
	private EnumTry obj=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Javaclass jav = new Javaclass();
jav.nadi();
	}
	
	public void nadi(){
		obj=EnumTry.nadi;
		System.out.println("before setting"+obj.getAge());
		obj.setAge(20);
		System.out.println("after setting"+obj.getAge());
	}

}
