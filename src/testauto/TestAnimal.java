package testauto;

public class TestAnimal {

	/*
	 * you cannot access sibling methods
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog test = new Dog();
		Snake test1 = new Snake();
		Bird test2 = new Bird();

		test.giveBirth();
		System.out.println(test.age);

		Reptile tes = new Reptile();
		test.giveBirth();
		tes.giveBirth();
		Animal o = new Dog();
		
	
		

	}

}
