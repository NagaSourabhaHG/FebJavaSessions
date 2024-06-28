package interfacetesting;

public interface ICows extends Homnivorus {

	String name = "Nandini";

	public void giveMilk();

	public void giveMilkBikis();

	public void giveMilkBikis(String a);

	default void givePaddy() {
		System.out.println("ICOW-Test ");
	}

}
