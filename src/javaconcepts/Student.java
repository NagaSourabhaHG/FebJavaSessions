package javaconcepts;

public class Student {
	String Name;
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student();
		Student obj1 = new Student();
		int totalnumber = 0;

		obj.Name = "Priya";
		obj.age = 15;
		totalnumber++;
		System.out.println("Name of the Student is  " + obj.Name + " " + "Age is  " + obj.age + " "
				+ "Total number of students  " + totalnumber);

		obj1.Name = "Vinay";
		obj1.age = 29;
		totalnumber++;
		System.out.println("Name of the Student is  " + obj1.Name + " " + "Age is  " + obj1.age + " "
				+ "Total number of students  " + totalnumber);

		obj.age = 19;

		System.out.println("Name of the Student is  " + obj.Name + " " + "Age is  " + obj.age + " "
				+ "Total number of students  " + totalnumber);
		Student obj2 = new Student();
		obj2.Name="Madhura";
		obj2.age=25;
		totalnumber++;
		System.out.println("Name is : "+obj2.Name+" "+ "Age is :"+"  "+obj.age);
		System.out.println(totalnumber);
		
	}

}
