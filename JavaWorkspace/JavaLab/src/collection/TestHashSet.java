package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import equals.Employee;

public class TestHashSet {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Hello");
		set.add("World");
		set.add(5);
		Employee e1 =new Employee("001");
		Employee e2 =new Employee("001");
		set.add(e1);
		set.add(e2);
		
		System.out.println("size="+set.size());
		System.out.println("contains hello="+set.contains("Hello"));
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Object item = iterator.next();
			System.out.println(item);
			
		}
	}

}
