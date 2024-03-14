package exceptions;

public class trycatchfinally {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			int[] mynum = {1,2,3};
			System.out.println(mynum[10]);
	    }
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("the try-catch is finished");
		}
}
}
