package exceptions;

public class throwdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
checkage(14);
	}
	static void checkage(int age)
	{
		if (age<18)
		{
			throw new ArrayIndexOutOfBoundsException("Access denied - You are not eligible.");	
		}
		else
		{
			System.out.println("Access granteed - You are eligible..");
		}
	}

}
