package javaconcepts;

public class Employeee {

	/*
	 * @author Sourabha
	 */

	int age;
	char gender;
	String DOB;
	double salary;

	// Default constructor

	/*
	 * public Employeee() { System.out.println("TEST"); }
	 */

	public Employeee(char gender) {
		System.out.println(gender);
		
		this.gender=gender;

	}

	public Employeee(char gender, double salary, int age) {
		
		System.out.println("PEACOCK");
		
		this.age=age;
		System.out.println(this.age);
		
		

	}

	public Employeee(int age, char gender, String dOB) {
		System.out.println("testing");
		System.out.println(age +" "+ gender +" "+ dOB);
		age =age;
		System.out.println(age);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeee test = new Employeee('M');
		test.age=90;
		System.out.println(test.age);
		
		 test =new Employeee('M',34.9,89);
		System.out.println(test.age);
		
		
		
		

	}

}
