package interfacetesting;

public interface Homnivorus {
	
	int a=100;
	
	int MIN_TIME=9;//only public static final 
	int z=10;

	public void eatGrass();//abstract method 

	public void drinkWater();

	public void goWalk();
	
	//Can we overidden

	default int calebreeding(int a, int b) {
		return a + b;
	}

	//Cannot be overiden 
	public static void printsound() {
		System.out.println("hello");
	}

	//Can we overiden 
	default void sayHello()
	{
		System.out.println("hello");
	}
}
