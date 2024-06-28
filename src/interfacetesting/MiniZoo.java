package interfacetesting;

public class MiniZoo extends TinyPetShop implements Homnivorus, ICows, IElephant {

	String Name = "Homni";
	
	int a=99;

	// Coming from Homnivorus

	@Override
	public void eatGrass() {
		System.out.println("Eat Grass");

	}

	// Coming from Homnivorus

	@Override
	public void drinkWater() {
		System.out.println("Drink water ");

	}
	// Coming from Homnivorus

	@Override
	public void goWalk() {
		System.out.println("Go walk");

	}

//Coming from elephant 
	@Override
	public void eatSugarcane() {
		System.out.println("SUGARCANE");

	}

//Coming from elephant
	@Override
	public void runInJungle() {
		System.out.println("JUNGLE");

	}

	// Coming from cow

	@Override
	public void giveMilkBikis() {
		System.out.println("MILK BIKIS");
	}

//Coming from elephant
	@Override
	public void giveMilk() {
		// TODO Auto-generated method stub

	}

//Coming from cow 
	@Override
	public void giveMilkBikis(String a) {
		// TODO Auto-generated method stub

	}
	

//Own method 
	public static void printsorund() {
		System.out.println("hello");
	}

	@Override
	public void sayHello() {
		System.out.println("hfjfj");
	}
	@Override

	public void givePaddy() {
		System.out.println("MINIZOO-Test ");
	}

}
