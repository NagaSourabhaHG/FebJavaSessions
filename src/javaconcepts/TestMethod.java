package javaconcepts;

import java.util.Arrays;

public class TestMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String h[]= {"A","B","C"};
	

		
	Students obj=	new Students(12,h);
	
	System.out.println(obj.rollnumber);
	
	String b[]=obj.getGrades();
	System.out.println(Arrays.toString(b));
	

	}

}
