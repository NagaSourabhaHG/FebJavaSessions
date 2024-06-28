package testauto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Array list is a default class Its a dynamic array
		 */

		ArrayList <Object>obj = new ArrayList<Object>(Arrays.asList(1,2,3,4));
		System.out.println(obj.size());
		obj.add(200);// 0
		obj.add(678);// 1
		System.out.println(obj.size());
		
		Arrays.asList(1,2,3,4);
		
	List<Integer>b=	Arrays.asList(2,3,4,5,6);
	List<String> h=Arrays.asList("sourabha","sharvil","honey","kolal");
	ArrayList<String> strarr=new ArrayList<String>(Arrays.asList("sourabha","sharvil","honey","kolal"));
	System.out.println(strarr.size());
	System.out.println(strarr.remove(0));
	System.out.println(strarr);
	strarr.add(2, "lily");
	System.out.println(strarr);
	strarr.set(2, "Money");
	System.out.println(strarr);
	strarr.remove(2);
	System.out.println(strarr);

	//strarr.add("pingo");
	System.out.println(strarr.size());
	System.out.println(";;;");
	System.out.println(strarr.size());
	System.out.println("&&&");
	System.out.println(h);
	System.out.println(h.size());
	System.out.println(b);
	//h.add("Meena");
//	System.out.println(h.size());

		obj.add(788);// 2
		obj.add(867);// 3
		obj.add(788);// 4
		System.out.println(obj.size());
		System.out.println(obj.get(1));
		System.out.println(obj.get(4));
		obj.add(3, 788);

		obj.add('f');
		obj.add(90.7);
		
		//Integer type of arraylist
		
	ArrayList<Integer>marks=new ArrayList<Integer>();
	marks.add(77);
	marks.add(9);
	marks.add(88);
	marks.add(100);
	marks.add(100);
	marks.add(108);
	marks.add(88);
	System.out.println(marks);
	ArrayList<Double>marksi=new ArrayList<Double>();
	marksi.add(200.0);
	ArrayList<String>markso=new ArrayList<String>();
	markso.add("Chrome");
	
	markso.get(0);
	
	//Collections.sort(marks);
	Collections.swap(marks, 1, 0);
	System.out.println(marks);
	System.out.println("@@@@");

	System.out.println(marks);
	
	Collections.sort(marks, Collections.reverseOrder());
	System.out.println(marks);
	
	System.out.println("****");

	
	//you can iterate a arraylist using for loop and for each loops
	
	for(int i =0;i<marks.size();i++)
	{
		System.out.println(marks.get(i));
	}
	System.out.println("**");
	
	Collections.sort(markso);

	System.out.println(marks);
	
	
	for (Integer j:marks)
	{
		System.out.println(j);
	}
	
	System.out.println("***");
	
}


}
