package javaprograms;

public class printclassloadername {

	public static void main(String[] args) 
	{
		//application/System classloader will load this class
		Class <printclassloadername> c=printclassloadername.class;
		System.out.println(c.getClassLoader());
		//if we print the class loader name of String,it will print null
		//bcoz in-built class which is found in rt.jar,so it is loaded by Bootsrap classloader
		System.out.println(String.class.getClassLoader());

	}

}
