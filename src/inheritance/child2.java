package inheritance;

public class child2 extends parent
{
	int child1var = 50;
	public static void main(String[] args)
	{
      child1 obj = new child1();
      obj.parentmethod();
      System.out.println("method from child2: "+ obj.child1method());
      
	}
	int child2method()
	{
		return child1var;

	}

}
