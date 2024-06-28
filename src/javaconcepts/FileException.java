package javaconcepts;

public class FileException {

	public void m1() {
		System.out.println("test");
		try {
			m2();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("Happy");
	}

	public void m2() throws ArithmeticException {

		int d = 8 / 0;

	}

	public void m3() {
		System.out.println("minni");
	}

	public static void main(String[] args) {
		
		
	FileException test=	new FileException();
	test.m1();

	}
}