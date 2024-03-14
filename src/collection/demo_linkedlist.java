package collection;

import java.util.*;
import java.util.Iterator;

public class demo_linkedlist 
{

	public static void main(String[] args) 
{
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("Python");
		list.add("Ruby");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
{
			System.out.println(itr.next());
}	
		System.out.println(list);
		System.out.println(list.get(1));
		list.set(2, "php");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.size());
		list.clear();
		System.out.println(list);
}
}
