package javaconcepts;

public class LoginPage extends JavaAbstraction {
	
	
	int a=20;
	public static int la =80;


	public LoginPage() {
		System.out.println("child page");
	}

	public LoginPage(int s) {
		System.out.println("child 2 ");

	}

	@Override
	public void title() {
		System.out.println("TITLE");

	}

	@Override
	public void url() {
		System.out.println("URL");

	}

	public void resetPassword() {
		System.out.println("RESET");
	}
}
