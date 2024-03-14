package collection;

import java.util.Vector;

public class demo_vector 
{

	public static void main(String[] args) 
{
		Vector<String> v = new Vector<String>();
		v.add("Hello");
		v.add("Welcome");
		v.add("to Java");
		for(String i : v)
{
			System.out.println(i);
}
		System.out.println(v);
		System.out.println(v.get(2));
		v.set(2, "my java");
		v.set(0, "hai");
		System.out.println(v);
		System.out.println(v.size());
		v.remove(2);
		System.out.println(v);
		System.out.println(v.size());
		v.clear();
		System.out.println(v);
}
}
