package collection;

import java.util.*;

public class demo_arraylist 
{

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("Java");
		for (int i =0;i<list.size();i++)
{
			System.out.println(list.get(i));
}
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
{
			System.out.println(itr.next());	
}
		System.out.println(list.get(1));
		for(String i : list)
{
			System.out.println(i);
}
		list.set(2, "php");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.size());
		list.clear();
		System.out.println(list);	
}
}
