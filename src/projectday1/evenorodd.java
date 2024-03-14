package projectday1;

import java.util.Scanner;

public class evenorodd
{

	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String[] args) 
	
	{
		// parameters (passing arguments)
		Scanner sc =  new Scanner(System.in); 
		System.out.println("Enter number to check whether even or odd: ");
		int n = sc.nextInt();
		int x = 10;
		int y = 20;
		evenorodd(n);

		//evenorodd(n);
		evenorodd obj = new evenorodd(x, y);
		obj.evenorodd(n);
		
		
	}
	evenorodd(int x,int y)
	{
		int s1;
		s1 = x + y;
		System.out.println("from constructor : " + s1);
	}
	public static int evenorodd (int num)
	{
		if(num%2 == 0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		return 0;
	}

}