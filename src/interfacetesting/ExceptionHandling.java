package interfacetesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
	
	String name;

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		// try will just throw the exception
		// catch block will catch the exception
		ExceptionHandling y=	new ExceptionHandling();
		y=null;

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		// Exception handling
		try {

			int i = 9 / 0;//unchecked exception
			y.name="tom";//unchecked exception
			System.out.println("o");
		} catch (ArithmeticException s) {
			System.out.println("AE is coming");
			s.printStackTrace();
		}
		catch (RuntimeException s) {
			System.out.println("nullpointer is coming");
			s.printStackTrace();
		}
		catch (Exception s) {
			System.out.println("AE is coming");
			s.printStackTrace();
		}


		System.out.println("Bye");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream test=	new FileInputStream("c");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String data =null;
		if (data==null)
		{
			throw new RuntimeException("Data cannot be found");
		}
		
		

	}
}
