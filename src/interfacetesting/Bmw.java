package interfacetesting;

public class Bmw extends Carr {

	int speed = 230;

	public Bmw() {
		super(20);
		System.out.println("Bmw default cons");
	}

	public Bmw(int a)

	{
		super(20, 30);
		System.out.println("Bmw param cons " + a);
	}

	@Override

	public void display() {

		super.display();// calls parent class methods
		super.volume();
		int c = super.speed;
		System.out.println(c);
		System.out.println(230);
		System.out.println("BMW -display");
		super.testV();
		System.out.println(super.price);
	}

	public static void name()

	{
		Carr.testV();
	}

	public static void main(String args[]) {
		Bmw test = new Bmw();
		test.launch();
	}
}
