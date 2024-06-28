package javaconcepts;

import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 }; // a 0 1 2 3 4 5 6 7
		int a[] = new int[7];
		int j = 0;
		for (int i = 0; i <= p.length-1; i++) {// i=0,i<7 0<8
			if (p[i] != 22)

			{
				a[j] = p[i];
				
				System.out.println(a[j]);
				// System.out.println(j);

				 
				 
				// System.out.println(a[j]);
				// j++;

				
			}

			//System.out.println(j);
			// System.out.println(a[j]);//where u print it matters 
			 

		}

		// System.out.println(p.length - 1);
		// lower index 0
		// higher index 7
		/*
		 * int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 }; int[] a = new int[p.length - 1]; int
		 * j = 0; for (int i = 0; i < p.length; i++) { if (p[i] != 22) { a[j] = p[i];
		 * 
		 * j++;
		 * 
		 * } }
		 * 
		 * System.out.println(Arrays.toString(a));
		 */

	}

}
