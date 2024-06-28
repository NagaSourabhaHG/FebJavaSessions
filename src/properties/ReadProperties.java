package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public final static String CONFIG_FILE_PATH = "./src/properties/config.properties";
	public static Properties prop;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream ip = new FileInputStream(CONFIG_FILE_PATH);

			prop = new Properties();

			prop.load(ip);
		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String bb = prop.getProperty("browser");
		System.out.println(bb);

		prop.setProperty("browser", "IE");
		String b = prop.getProperty("browser");
		System.out.println(b);
		System.out.println(prop.size());

		

	}

}
