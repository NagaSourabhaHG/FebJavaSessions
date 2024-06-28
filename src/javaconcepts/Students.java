package javaconcepts;

public class Students {

	int age;
	char gender;
	String phonenumber;
	int rollnumber;
	String grades[];
	final static String name = "Sinchan";

	public Students(int rollnumber, String[] grades) {
		
		System.out.println("Testing");

		this.rollnumber = rollnumber;
		this.grades = grades;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public static String getName() {
		return name;
	}

	public void setGrades(String[] grades) {
		this.grades = grades;
	}

	public Students(char gender, String[] grades) {
		
		this.gender = gender;
		this.grades = grades;
	}

	public String[] getGrades()
	{
		return grades;
	}
	
	}
