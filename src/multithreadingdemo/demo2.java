package multithreadingdemo;

public class demo2 implements Runnable
{

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		demo2 obj1 = new demo2();
		Thread th = new Thread (obj1);
		th.start();
		System.out.println("This is outside of the thread");
}
	@Override
public void run()
{
	System.out.println("This is inside of the thread");
}
}