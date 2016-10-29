package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ArrayListWithUserDefinedObjects {

	private static GeneralClass object1 =null;
	private static GeneralClass object2 =null;
	private static GeneralClass object3 =null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 object1 = new GeneralClass(1, "Raj");
		 object2 = new GeneralClass(1, "Ram");
		 object3 = new GeneralClass(1, "Ramu");
		
		ArrayListWithUserDefinedObjects parent = new ArrayListWithUserDefinedObjects();
		parent.arrayImplementation();
		
	}
	
	protected void arrayImplementation(){
		List<GeneralClass> a = new ArrayList<GeneralClass>(); //can access only LIST interface methods implemented in ArrayList Class
		a.add(object1);
		a.add(object2);
		a.add(object3);

		//How to get values from LIST
		//simply by foreach 
		for (GeneralClass class1 : a) {
			class1.printNumber();
			class1.printName();
		}

		//using iterator
/**		Iterator<GeneralClass> iterator = a.iterator();
		
		while (iterator.hasNext() ) {
			iterator.next().printName();
			iterator.next().printNumber();
		} **/
	
		
	}

}
