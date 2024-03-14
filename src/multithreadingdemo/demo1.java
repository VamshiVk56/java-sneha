package multithreadingdemo;

public class demo1 extends Thread
{
	

	public static void main(String[] args) 
	{
		demo1 obj = new demo1();
		obj.start();
		System.out.println("This is outside of the thread");
	}
	public void run() {
		System.out.println("This is inside of the thread");
	}

}

//If the class extends the Thread class,
//the thread can be run by creating an instance of the class and call its start() method:
