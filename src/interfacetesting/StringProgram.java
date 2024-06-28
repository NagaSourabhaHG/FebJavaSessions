package interfacetesting;

import java.util.Arrays;

public class StringProgram {

	public String[] reverseWordInString(String[] array)

	{
		int arraysize = array.length;
		String arraynew[] = new String[arraysize];
		int j = 0;
		for (int i = array.length - 1; i >= 0; i--) {

			arraynew[j] = array[i];
			j++;
		}
		return arraynew;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringProgram t = new StringProgram();

		String a[] = { "bat", "cat","dog" };
		String newz[] = t.reverseWordInString(a);

		for (String m : newz) {
			System.out.println(m);
			
		}
		System.out.println(Arrays.toString(newz));
		
	

	}

}
