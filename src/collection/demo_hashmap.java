package collection;

import java.util.HashMap;

public class demo_hashmap 
{
	public static void main(String[] args) 
{
		HashMap<String,String> h = new HashMap<String,String>();
		
		
		h.put("Java","prog lang");
		h.put("Mysql", "Datebase");
		h.put("Appium", "Testing");
		
		System.out.println(h);
		System.out.println(h.get("Java"));
		h.remove("Appium");
		System.out.println("After removing:");
		System.out.println(h);
		System.out.println(h.size());
        h.clear();
        System.out.println(h);
}
}
