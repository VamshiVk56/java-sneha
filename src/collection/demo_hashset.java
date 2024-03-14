package collection;

import java.util.HashSet;

public class demo_hashset 
{

	public static void main(String[] args) 
{
		HashSet<String> list = new HashSet<String>();
		
		list.add("Java");
		list.add("Mysql");
		list.add("Appium");
		for(String i : list)
{
			System.out.println(i);
}
		System.out.println(list.contains("Java"));
		
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list);
		System.out.println(list.size());
		list.clear();
		System.out.println(list);
}
}
