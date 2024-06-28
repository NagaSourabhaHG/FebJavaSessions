package javaconcepts;

public class Employee {
	String name;

	int age;

	double salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double totalsalary = 0;

		Employee obj = new Employee();
		obj.name = "Anvitha";
		obj.age = 10;
		obj.salary = 2000;
		totalsalary++;

		Employee obj1 = new Employee();
		obj1.name = "Bingo";
		obj1.age = 27;
		obj1.salary = 200000;
		totalsalary++;

		Employee obj2 = new Employee();
		obj2.name = "Charitha";
		obj2.age = 16;
		obj2.salary = 30000;
		totalsalary++;
		
		System.out.println(obj.name + obj.age + obj.salary);
		System.out.println(obj1.name + obj1.age + obj1.salary);
		System.out.println(obj2.name + obj2.age + obj2.salary);
		System.out.println(totalsalary);
	//	double r = obj.salary + obj1.salary + obj2.salary+ obj4.salary;
		//System.out.println("Total Salary " + r);
		
		obj1.salary=500000;
		System.out.println(obj1.salary);
		
		Employee obj4 = new Employee();
		obj4.name = "Sanvi";
		obj4.age = 17;
		obj4.salary = 300000;
		totalsalary++;
		System.out.println(obj4.name + obj4.age + obj4.salary);
		System.out.println(totalsalary);
		double r = obj.salary + obj1.salary + obj2.salary+ obj4.salary;
		System.out.println("Total Salary " + r);



	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
