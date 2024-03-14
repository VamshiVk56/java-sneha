package abstraction;

public class abstractdemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s = new rect();
		s.draw();
		shape s1 = new cir();
		s1.draw();
	}

}
//================================================================
abstract class shape
{
	abstract void draw();
}

//================================================================
class rect extends shape
{
	@Override 
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}
//=================================================================
class cir extends shape
{
	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}
}
