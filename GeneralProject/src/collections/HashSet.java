package collections;

import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
		set.hashSetImplementation();
	}

	
	private void hashSetImplementation(){
		java.util.HashSet<String> hashset = new java.util.HashSet<>();
		hashset.add("ram");
		hashset.add("ram"); //no duplicates allowed, no compile time errors instead it will consider only one value for many similar values
		hashset.add("ravi");
		hashset.add("raju");
		hashset.add("gopal");
		hashset.add("shastri");
		
		//iterating values using foreach
		for (String string : hashset) {
			System.out.println(string);
		}
		
		//iterating using iterator interface
	    Iterator<String> iterator =	 hashset.iterator();
	    while (iterator.hasNext()) {
	    	System.out.println(iterator.next());	
	    }	
	}
	
}
