package polymorphism;

public class methodoverloading 
{
	public static void main(String[] args) 
	{
		//TODO Auto-generated method stub
		
		System.out.println(Adder.add(11,11));
		System.out.println(Adder.add(11,11,11));
		System.out.println(Adder.add(11.5,11.5));
		Adder.m(11,11);
		Adder.m(11,11,11);
	}
}
class Adder
{
	static int add(int a, int b)
	{
		return a+b;
	}
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	static double add(double a,double b)
	{
	   return a+b;	
	}
	static void m(int a, int b)
	
	{
		System.out.println(a+b);
		
	}
	static void m(int a,int b,int c)
	{ 
		System.out.println(a+b+c);
	}
}
