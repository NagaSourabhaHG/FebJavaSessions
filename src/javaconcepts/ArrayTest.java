package javaconcepts;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];
		a[0]=5;
		a[1]=9;
		a[2]=10;
		a[3]=8;
		a[4]=76;
		a[3]=7;
		System.out.println(a[3]);
		
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		
		}
		System.out.println("*******");
		
		for (int z:a)
			System.out.println(z);
		System.out.println("-----------");
		
		System.out.println(Arrays.toString(a));
		
		String s[]= {"Hello","Bye"};
		s[3]="Hello";
		System.out.println(s);
		
		
	}

}
