package javaconcepts;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 6; i++) {
			System.out.println("I am a Batman");
		}
		System.out.println("-----------------");

		for (int i = 1; i < 10; i++) {
			System.out.println("I am a Batman " + i);
		}

		System.out.println("---------------");
		int a = 10;// 11//10//9
		while (a > 0)// 11<0//10<0
		{
			System.out.println(a);// 11//10
			a--;
		}
		System.out.println("*****************");

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("&&&&&&&&&&&&&");
		int i = 10;// i=10
		do {
			System.out.println(i);// 10
			i--;// 9
		} while (i <= 0);

		System.out.println("******");
		int j = 0;
		while (j < 10) {
			System.out.println("Hello world");
			j++;
		}

		for (int k = 1; k <= 100; k++) {
			int multipleoffive = 5 * k;
			System.out.println(multipleoffive);
		}

		for (char ch='Z';ch<'A';ch--)
		{

			System.out.println(ch );
		}
		System.out.println("^^^^^^^^^^^^^");
		
		
		char chc = 'Z';
		
		while (chc <='A') {
			System.out.println(chc);
			chc--;
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&");
		int k = 2;

		while (k < 100) {

			if (k % 2 == 0)
				System.out.println(k);
			k++;
		}
	}

}