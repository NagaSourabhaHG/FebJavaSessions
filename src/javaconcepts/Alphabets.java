package javaconcepts;

public class Alphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'Z';
		while (ch > 'A') {
			System.out.println(ch);
			ch--;
		}

		for (char ch1 = 'Z'; ch1 >= 'A'; ch1--) {
			System.out.println(ch1);
		}

		for (float f = 1.0f; f <= 10.0; f++) {
			System.out.println(f);
		}

		for (int b = 1; b < 100; b++) {
			if (b % 9 == 0)
				System.out.println(b);
		}

		String browser = "IE    ".toLowerCase().trim();

		if (browser .equals("chrome")) {
			System.out.println("Switch to chrome");
		} else if (browser.equals( "Firefox")) {
			System.out.println("switch to firefox");
		} else if (browser.equals("ie") ) {
			System.out.println("IE browser");
		} else {
			System.out.println("select the proper one ");
		}
	}
}