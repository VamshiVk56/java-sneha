package polymorphism;

public class methodoverriding extends vehicle
{

	public static void main(String[] args) 
{
        //methodoverriding obj = new methodoverriding();
        vehicle obj = new methodoverriding();
        obj.run();
}
	void run()
{
	System.out.println("Bike is running");
}
}
class vehicle
{
	void run()
{
		System.out.println("Vehicle is running");
}
}
