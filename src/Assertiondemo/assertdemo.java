package Assertiondemo;

import java.util.*;

public class assertdemo 
{

	public static void main(String[] args) 
{
		// TODO Auto-generated method stud
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		//assert expression1 : expression2;
		assert age>=18:"Not Valid";
		System.out.println(age);
}

}
