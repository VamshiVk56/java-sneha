package inheritance;

public class class1 extends class2
{
	int class1var = 500000;

	public static void main(String[] args) 
	{
		System.out.println("Multi Level Inheritance");
		class1 obj = new class1();
		obj.class1method();
		obj.class2method();
		obj.class3method();
		System.out.println("variable of classs3 from obj of class1: " + obj.class3var);
		System.out.println("variable of classs3 from obj of class1: " + obj.class2var);
		System.out.println("variable of classs3 from obj of class1: " + obj.class1var);
		
		
		class2 obj2 = new class2();
		((class3) obj2).class3method();
		((class2) obj2).class2method();
		System.out.println("variable of classs3 from obj of class2: " + obj2.class2var);
		System.out.println("variable of classs2: " + obj2.class3var);
		
		
		class3.obj3 = new class3();
		obj3.class3method();
		System.out.println("variable of class3: " + obj3.class3var);
	}
	void class1method()
	{
		System.out.println("This call is from class1");
	}

}