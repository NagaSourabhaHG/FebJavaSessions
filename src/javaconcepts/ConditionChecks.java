package javaconcepts;

public class ConditionChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "chroME    ".toLowerCase().trim();

		switch (browser) {
		case "chrome":
			System.out.println("Selected browser type is " + browser);
			break;

		case "firebox":

			System.out.println("Selected browser type is " + browser);

			break;
		case "ie":
			System.out.println("Selected browser type is " + browser);
			break;
		case "safari":
			System.out.println("Selected browser type is " + browser);
			break;
		default:
			System.out.println("Please provide the proper input");

		}

		String browser1 = "chrome";
		String browser2="ChRome".toLowerCase().trim();

		if (browser1==browser2) {
			System.out.println("Switch to chrome");
		}
		/*
		else if (browser1 == "Firefox") {
			System.out.println("switch to firefox");
		} else if (browser1 == "ie") {
			System.out.println("IE browser");
		} else {
			System.out.println("select the proper one ");
		}
		System.out.println("***********");*/

	}

}
