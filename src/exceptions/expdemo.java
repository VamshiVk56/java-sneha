package exceptions;

public class expdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[] = new int[5];
			a[6]=30;
			//a[5] = 30/0
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception occurs"); 
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception occurs"); 
		}
		System.out.println("Rest of the code"); 

	}
}
