package javaconcepts;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int x = 5;
	        int y = 10;

	        if (x > 0 && y > 0 && x < y && x * 2 < y) {
	            System.out.println("Hi");
	        }
	        
	        if (x > 0 & y > 0 & x < y & x * 2 < y) {
	            System.out.println("Hello");
	        }
	        
	        boolean a = false;
	        boolean b = false;
	        
	        boolean result = a && b;
	        System.out.println(result);
	        
	        boolean resultVal = a & b;
	        System.out.println(resultVal);
	    
	}

}
