package javaconcepts;

public class AsciiCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c + " " + "ASCII value is " + (int) c);
			int a[] = new int[10];
			System.out.println(a.length);
			a[0] = 2;
			a[1] = 3;
			a[2] = 88;
			a[3] = 100;
			a[4] = 900;
			for (int b : a)
				System.out.println(b);
			System.out.println("-----");
			System.out.println(a[1]);
			System.out.println("-----");
			int i = 11;
			i = i++ + ++i;
			System.out.println(i);
			// 11+13=24
			System.out.println("_____");
			int d = 11, b = 22, e;
			e = d + b + d++ + b++ + ++d + ++b;
			System.out.println(e);

			int g = 1, f = 2;

			System.out.println(--f - ++g + ++f - --g);

			int l = 19, m = 29, n = 0;

			int o = l-- - m-- - n--;

			System.out.println("l=" + l);

			System.out.println("m=" + m);

			System.out.println("n=" + n);
			System.out.println(o);
			// int p = 11;

			// int p = --(b++);// Example of invalid argument
			int q = 0, r = 0;

			int s = --q * --r * q-- * r--;

			System.out.println(s);
			System.out.println(q);
			System.out.println(r);
			char ch = 'A';

			System.out.println(ch++);
			int h = 200;
			float w = (float) h;
			float z = 900.77f;

			float floatvalue = 1000.0f;
			int z1 = (int) floatvalue;
			System.out.println(z1);
			int intvaluep=90;
			 short shortValue = (short)intvaluep;
			 System.out.print(shortValue);

			double doubleValue = 42.0;

			//float floatValue = (float) doubleValue; // explicit cast from double to float
System.out.println(shortValue);


int z2=1000;
byte f2=(byte)z2;
System.out.println(f2);

		}

	}

}
