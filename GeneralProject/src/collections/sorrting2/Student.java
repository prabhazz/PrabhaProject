package collections.sorrting2;

public class Student implements Comparable<Student>{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}
	@Override
	public int compareTo(Student o1) {
		// TODO Auto-generated method stub
		
		if(age==o1.age){
			return 0;
		}else if (age>o1.age){
			return 1;
		}else{
			return -1;
		}
		
		
		
	}  
}  