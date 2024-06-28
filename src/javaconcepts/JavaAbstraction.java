package javaconcepts;

public abstract class JavaAbstraction {
	
	int a=10;
	
	public static int la =30;

	public JavaAbstraction() {
		System.out.println("Parent class");
	}

	public JavaAbstraction(int a) {

	}

	public abstract void title();

	public abstract void url();

	public final static void display_logo() {
		System.out.println("LOGO");
	}

	public void pageInfo() {
		System.out.println("Page info");
	}

}
