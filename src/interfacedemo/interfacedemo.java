package interfacedemo;

public class interfacedemo implements print {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		interfacedemo obj = new interfacedemo();
		obj.print();
	}
	@Override
	public void print() {
	System.out.println("Hello");
	}
	@Override
	public void m() {
		//TODO Auto-generated method stud
	}
}
//===============================================================

interface print
{
	void print();
	void m();
}
