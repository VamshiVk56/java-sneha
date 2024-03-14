package collection;

import java.util.Stack;

public class demo_stack 
{
	public static void main(String[] args) 
{
		Stack<String> s = new Stack<String>();
		s.push("first");
		s.push("second");
		s.push("third");
		System.out.println(s.pop());
		System.out.println(s);
}
}
