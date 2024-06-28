package interfacetesting;

public class TestZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiniZoo test = new MiniZoo();
		test.givePaddy();
		test.givefood();
		System.out.println("*****");
		System.out.println(test.a);
		System.out.println(Homnivorus.a);
		System.out.println("********");

		TinyPetShop t = new MiniZoo();

		// System.out.println(test.a);
		System.out.println(test.Name);
		System.out.println(Homnivorus.MIN_TIME);

		System.out.println("&&&&");

		ICows o = new MiniZoo();

		o.eatGrass();
		o.drinkWater();
		o.goWalk();
		o.sayHello();
		o.giveMilk();
		o.giveMilkBikis();
		o.calebreeding(6, 9);
		o.givePaddy();
		o.givePaddy();
		System.out.println("&&&&");
		System.out.println(ICows.name);
		System.out.println(ICows.MIN_TIME);
		System.out.println(Homnivorus.z);

		System.out.println(test.a);

		Homnivorus.printsound();
		test.sayHello();
		System.out.println(IElephant.color);
		System.out.println(ICows.MIN_TIME);
		System.out.println(IElephant.color);
		IElephant h = new MiniZoo();
		ICows o2 = new MiniZoo();

		IElephant e = (IElephant) o2;// Interface type casting
		e.eatSugarcane();
		o2.drinkWater();
		Homnivorus h4 = (Homnivorus) o2;
		h4.calebreeding(9, 9);
	

	}

}
