package interfacetesting;

public class Car {

	String color = "Blue";
	public String Name;

	private int a = 10;
	protected double milage;

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
