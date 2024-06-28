package javaconcepts;

public class ThrowKeyword {

	public static void main(String[] args) {

		String browser = "opera".toLowerCase().trim();

		String driver = null;
		{

			switch (browser) {
			case "chrome":
				System.out.println("Chrome selected ");
				break;
			case "Firefox":
				System.out.println("Firefox is selected");
				break;
			default:

				System.out.println("Please selected the proper browser");
				// break;
				throw new MyCustomException("Not a valid browser exception");
			}
		}

//	driver.get("launch amazon");

	}
}