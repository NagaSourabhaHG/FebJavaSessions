package interfacetesting;

public class Carr extends Vehicle {

	int speed = 200;
	int price = 3000;

	String color = "Blue";
	public String Name;

	private int a = 10;

	protected double milage;

	public Carr()

	{
		volume();
		System.out.println("Carr default cons");
		this.display();
		Bmw test = new Bmw();
		test.display();
	}

	public Carr(int a) {
		System.out.println("Carr param cons " + a);
	}

	public Carr(int a, int b) {
		System.out.println("Carr param cons " + a + b);
	}

	public void display() {
		System.out.println(super.price);

		System.out.println("Carr- test");
	}

	public void volume() {
		System.out.println("car-volume");
	}

	public static void testV() {
		System.out.println("testVV");
	}

	void price() {
		System.out.println("Test");
	}

	protected void gear() {
		System.out.println("Gear");
	}

	public void launch() {
		System.out.println("Gear");

	}

	private void speaker() {
		System.out.println("gear");
	}

	public static void main(String[] args) {

		Car b = new Car();
	}

}
