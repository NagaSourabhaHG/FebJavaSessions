package testauto;

public class NumberTest {
	private static int totalNoOfStudents;

	public NumberTest() {

		totalNoOfStudents++;

		Chaitanya test = new Chaitanya();
		test.booksPrefered();
	}

	public NumberTest(int a, char b) {

		totalNoOfStudents++;
		testSum();

	}

	public NumberTest(String a) {
		totalNoOfStudents++;
	}

	public void testSum() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberTest a = new NumberTest();
		NumberTest r = new NumberTest(12, 'a');

		NumberTest d = new NumberTest("abc");

		System.out.println("Total number of objects created is " + NumberTest.totalNoOfStudents);

	}

}
