package inheritance;

public class child extends parent
{
	int child1 = 20;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		parent p = new parent();
		System.out.println(p.parent);
		System.out.println(p.m());
		
		child c = new child();
		System.out.println(c.parent);
		System.out.println(c.child1);
		System.out.println(c.m());
		System.out.println(c.m1());
	}
	int m1()
	{
		return child1;
	}

}
