package collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import category.Item;

public class TestArraylist {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("Hellow");
		list.add("World");
		
		
		System.out.println("0="+list.get(0));
		System.out.println("1="+list.get(1));
		System.out.println("size="+list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("第"+i+"個"+list.get(i));
			
		}
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
		
			Object item =iterator.next();
			System.out.println(item);
		}
		for (Object item : list) {
			System.out.println(item);
			
		}

	}

}
