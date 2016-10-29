package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleArrayList parent = new SimpleArrayList();
		
		parent.arrayImplementation();
		
	}
	
	protected  void staticMethod()
	{
		System.out.println("static method");
	}
	
	protected void arrayImplementation(){
		List<String> a = new ArrayList<String>(); //can access only LIST interface methods implemented in ArrayList Class
		a.add("nadi");
		a.add("sudir");
		
		ArrayList<String> arraylist = new ArrayList<>(); //can access all the methods in ArrayList class
		arraylist.add("ram");
		arraylist.add("ravi");
		arraylist.add("kumar");
		arraylist.add("raju");
		arraylist.add("kumar");  //can allow duplicates
		
		//example for arraylist contains
		System.out.println("is arraylist contains name of raju"+arraylist.contains("raju"));
		

		System.out.println("output"+arraylist.get(2)); // get value based on index

		//How to get values from LIST
		//simply by foreach 
		for (String string : arraylist) {
			System.out.println(string);
		}

		//using iterator
		Iterator<String> iterator = arraylist.iterator();
		
//		arraylist.addAll(a);
//		arraylist.equals(arg0);
		//arraylist.sort(c);
		
		while (iterator.hasNext() ) {
			System.out.println(iterator.next());			
		}
	
		
	}

}
