package day1;

public class operators 
{

	@SuppressWarnings("unused")
	public static void main(String[] args) 
{
//unary operators
		int x = 10;
		System.out.println(x++); //10(11)
		System.out.println(x);
		System.out.println(++x); //12
		System.out.println(x--); //12(11)
		System.out.println(x);
		System.out.println(--x);
		System.out.println("left shift operators");
		System.out.println(10<<2); //10*2pow2 ==== 10*4
		System.out.println(10<<3); //10*8
		System.out.println("right shift operators");
		System.out.println(10>>2); //10/2pow2 ==== 2
		System.out.println(10>>3); //10/2pow3 ==== 1
		System.out.println("Assignment operators");
		int num1 = 10;
		System.out.println(num1);
		num1+=3; //10 + 3 == 13
		System.out.println(num1);
		num1-=3; //13 - 3 == 10
		System.out.println(num1);
		num1*=2; //10 * 2 == 20
		System.out.println(num1);
		num1/=2; //20 / 2 == 10
		System.out.println(num1);
		System.out.println("comparision operators");
		int y = 5;
		int z = 4;
		System.out.println(y == z);
		System.out.println(y != z);
		System.out.println(y > z);
		System.out.println(y < z);
		System.out.println(y >= z);
		System.out.println(y <= z);
		System.out.println("logical operators");
		int c = 50;
		System.out.println(y <= z);
		
		//arithmetic
		System.out.print("Arithematic operators");
		int a = 10;
		int b = 12;
		System.out.println(c > 40 && c < 60);
		System.out.println(c > 40 || c < 60);
		int a1 =5;
		int b1 =4;
		int min = (a1<b1)?b1:a1;
		System.out.println(min);
		
}

}
