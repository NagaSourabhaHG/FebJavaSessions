package interfacetesting;

public class TestCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		College test = new College();
		test.reservationseats();
		System.out.println(test.noOfStudents);

		HappyCollege test1 = new HappyCollege();
		test1.universityChancellor();
		System.out.println(test1.noOfStudents);

		IBangaloreUniversity obj = new HappyCollege();
		obj.booksLanguage();
		obj.badge();
		test1.badge();
		
		Audi a = new Audi();
		System.out.println(a.color);
		
		

}

}
