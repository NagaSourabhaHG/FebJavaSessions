package javaconcepts;

public class JavaAddition {

	public static void main(String[] args) {
		// byte a = 74;
		// double s=(int)500000000;
		 /*
		  * say for example you are converting 500 to byte internally 
		  * 500 -(total no of byte range) 500 -256 this occurs until it comes 
		  * under byte range 
		  */
		// System.out.println("value of b is "+ s);
		// int i = 11;
		// i = i++ + ++i;
		// System.out.println(i);
		// int a=11;
		// int b=22;
		// int j = i++ - --i + ++i - i--;
		// System.out.println(j);
		// int i=1, j=2, k=3;

		// int i=1, j=2, k=3;

		/*
		 * int i=1, j=2, k=3;
		 * 
		 * int m = i-- - j-- - k--;
		 * 
		 * 
		 * System.out.println("i="+i); System.out.println("j="+j);
		 * System.out.println("k="+k);
		 * 
		 * System.out.println("m="+m); int a=1, b=2;
		 * 
		 * System.out.println(--b - ++a + ++b - --a);
		 */

		int m = 0, n = 0;

		int p = --m * --n * n-- * m--;

		System.out.println(p);
		int a = 1;

		a = a++ + ++a * --a - a--;

		System.out.println(a);
		
		int ch = 'A';

		

		System.out.println(++ch);
		System.out.println(12.7);
		

	}

}
