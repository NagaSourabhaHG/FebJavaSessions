package javaconcepts;

public class ObjTest {

	int age;
	String name;
	char grade;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjTest a = new ObjTest();
		a.age = 2;
		a.name = "sani";
		a.grade = 'S';

		ObjTest b = new ObjTest();
		b.age = 10;
		b.name = "milli";
		b.grade = 'A';

		ObjTest c = new ObjTest();
		c.age = 15;
		c.name = "Sanvi";
		c.grade = 'D';

		ObjTest d = new ObjTest();
		d.name = "silli";
		d.age = 34;
		d.grade = 'E';

		System.out.println(a.age + " " + a.name + " " + a.grade + " ");

		System.out.println(b.age + " " + b.name + " " + b.grade + " ");
		System.out.println(c.age + " " + c.name + " " + c.grade + " ");

		System.out.println(d.age + " " + d.name + " " + d.grade + " ");

		a = b;
		System.out.println(a.age + " " + a.name + " " + a.grade + " ");

		System.out.println(b.age + " " + b.name + " " + b.grade + " ");

		b = c;
		System.out.println(b.age + " " + b.name + " " + b.grade + " ");
		System.out.println(c.age + " " + c.name + " " + c.grade + " ");
		c = d;
		System.out.println(d.age + " " + d.name + " " + d.grade + " ");
		System.out.println(c.age + " " + c.name + " " + c.grade + " ");
		d = a;
		System.out.println(d.age + " " + d.name + " " + d.grade + " ");

		System.out.println(a.age + " " + a.name + " " + a.grade + " ");

	}

}
