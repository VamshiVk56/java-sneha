package projectday1;
import java.util.Random;

public class randomnumber
{
	
	public static void main(String args[]) 
	{
		// generate random integer,float and double
		Random rand = new Random();
		int upperbound = 2500;
		
		int int_random = rand.nextInt(upperbound);
		double double_random = rand.nextDouble();
		float float_random = rand.nextFloat();
		
		System.out.println("Random integer value from 0 to" + (upperbound-1) + " : " + int_random);
		System.out.println("Random float value from 0.0 and 1.0 :" + float_random);
		System.out.println("Random double value from 0.0 and 1.0 :" + double_random);
	}
}
