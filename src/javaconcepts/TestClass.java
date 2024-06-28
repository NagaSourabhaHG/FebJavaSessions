package javaconcepts;

public class TestClass {

	int a;
	int b;// This can be accessed without intialized

	public int add(int a, int b) {
		int n;
		int sum = a + b;
	//	sum=n*1;
	//	System.out.println(n);
		return sum;
	}//Variables inside methods are treated as local variables and on accessing them u need to intialize before doing any cal
	


	public int sub(int a, int b) {
		int n;
		int sub = a - b;
		return sub;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;

		// System.out.println(a);//This gives error as local variable is not intialized

	}

}
