package work;

public enum EnumTry {

	nadi(25,"male","dark"),
	karthi(24,"male","mild");
	
	
	private Integer age=0;
	private String sex=null;
	private String color=null;
	EnumTry( Integer age,  String sex,String   color){
		this.age=age;
		this.sex=sex;
		this.color=color;
		
	}
	
	public int getAge(){
		return age;
	}
	public int setAge(int inputAge){
		return age=inputAge;
	}
}
