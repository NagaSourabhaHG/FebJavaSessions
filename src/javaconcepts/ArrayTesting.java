package javaconcepts;

import java.util.Arrays;

public class ArrayTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object n[] = { "Rahul", 29, "RCB", 1998, 'M', 173.99 };
		Object z[] = { "Ganesh", 30, "CSK", 1977, 'M', 166.45 };
		Object j[] = { "Dhoni", 42, "CSK", 15 - 06 - 1967, 'M', 158.99 };

		for (Object f : n) {
			System.out.println(f);
		}

		System.out.println(Arrays.toString(n));

		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		for (int p = 0; p < n.length; p++) {
			System.out.println(z[p]);
		}

		int[] A = { 0, 2, 4, 1, 3 };
		for (int i = 0; i < A.length; i++) {
			A[i] = A[(A[i] + 3) % A.length];// A[0]=A[(A[0]+3)%5]=[(0+3)%5]=3%5 =0
			// a[0]=a[3]=1; a[1]=a[5%5]=>a[1]=a[0]=1= A[1]=A[(A[i]+3)%5=5%5=1

		}
		System.out.println(A[1]);
		System.out.println(3 / 5);
		
		//Declaration of Array literal 

		int u[] = { 1, 3, 4, 5, 22, 56, 89, 90 };
		//Printing using for loop 

		for (int i = 0; i < u.length; i++) {
			System.out.println(u[i]);
		}
		int s = 0;
		//Printing using while loop 
		while (s < u.length) {
			System.out.println(u[s]);
			s++;
		}
		//Printing using do loop 
		int d = 0;
		do {
			System.out.println(u[d]);
			d++;
		} while (d < u.length);
		//Printing using for each 
		for (int h:u)
			System.out.println(h);
		System.out.println(Arrays.toString(u));
	}

}
