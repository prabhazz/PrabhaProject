package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMapImplementation hashmap = new HashMapImplementation();
		hashmap.hashMapImplementation();
		
	}
	
	private void hashMapImplementation(){
		HashMap<Integer, String> hashmap = new HashMap<>();
		hashmap.put(1, "Ram");
		hashmap.put(2, "Ravi");
		hashmap.put(3, "Raju");
		hashmap.put(4, "Kumar");
		
		//how to iterate the hashMap
		for (Entry<Integer, String> iterable_element : hashmap.entrySet()) {
			System.out.println(iterable_element.getKey());
			System.out.println(iterable_element.getValue());			
		}
		
	}

}
