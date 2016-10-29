package collections.sorrting1;

import java.util.Comparator;

public class NameComparator1 implements Comparator<Student>{

	@Override
	public int compare(Student s1,Student s2) {
		// TODO Auto-generated method stub
		
		
		return s1.name.compareTo(s2.name);
		
		
	}

}
