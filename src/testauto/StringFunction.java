package testauto;

import java.util.Arrays;

public class StringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k ="This is my java code";
		String[] j=k.split(" ");
		String str2="";
		
		System.out.println(Arrays.toString(j));
		
		for(String l:j)
		{
			str2=str2+" "+StringFunctions.stringReverse(l);
		}
		System.out.println(str2);

	}

}
