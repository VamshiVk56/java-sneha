package projectday1;

public class vowelconsonant {

	public static void main(String[] args) 
	{
		char ch = 'o';
		
		switch(ch) //using switch case statement
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is vowel");
			break;
			default:
			System.out.println(ch + " is consonant");
		}
		
		
		
	    char tt = 'b';    //using if else statement
	    if(tt == 'a' || tt == 'e' || tt == 'i' || tt == 'o' || tt == 'u')
		    System.out.println(tt + " is vowel");
	    else
		    System.out.println(tt + " is consonant");
	}
}
