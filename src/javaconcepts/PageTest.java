package javaconcepts;

public class PageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginPage test = new LoginPage();

		LoginPage test1 = new LoginPage(10);
		test.url();
		test.display_logo();
		LoginPage.display_logo();
		JavaAbstraction.display_logo();
		test.resetPassword();
		System.out.println(test1.a);

		// new JavaAbstraction();

		JavaAbstraction tes = new LoginPage();
		tes.title();
		tes.url();
		tes.pageInfo();
		
		System.out.println(JavaAbstraction.la);
		System.out.println(LoginPage.la);

	}

}
