package oops;

public class demo1 {

	public static void main(String[] args)
	{
		System.out.println("inside main");
		demo1 obj = new demo1();
		obj.m();
		class2 obj2 = new class2();
		obj2.m1();
		demo2 obj1 = new demo2();
		obj1.m2();
	}
	void m()
	{
		System.out.println("inside m");
		
	}
	int n()
	{
		return 0;
	}
	demo1()
	{
		System.out.println("call from constructor");
	}
}
class class2{
	void m1()
	{
	System.out.println("inside m1");
	}
}
