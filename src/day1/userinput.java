package day1;

import java.util.Scanner;

public class userinput 
{

	public static void main(String[] args) 
{
		
		// TODO Auto-generated method stub
		
        
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
        
    
        int a = sc.nextInt();
        System.out.println("Entered no: " + a);
        
        System.out.println("Enter an string: ");
        
		@SuppressWarnings("unused")
		String s = sc.nextLine();
        System.out.println("Entered string: " + a);
}

}
