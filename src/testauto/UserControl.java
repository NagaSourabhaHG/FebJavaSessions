package testauto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UserControl {

	public static String userControlAccess(String role)

	{
		Map<String, String> test = new HashMap<String, String>();
		test.put("admin", "admin:admin");
		test.put("seller", "seller@gmail.com:seller@123");

		return test.get(role);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cred = userControlAccess("admin");
		System.out.println(cred);
		String[] ans = cred.split(":");
		String username =ans[0];
		String password=ans[1];
		System.out.println("Username and Password are  "+username +" "+password);
		System.out.println(Arrays.toString(ans));
		Map<String, String> test = new HashMap<String, String>();
		test.put("admin", "admin:admin");
		test.put("seller", "seller@gmail.com:seller@123");


		
		String [] k= {"apple","bat","cat"};
		System.out.println(Arrays.toString(k));
		
		//Way to iterate hashmap
		for (Map.Entry<String, String> e:test.entrySet())
		{
			System.out.println(e.getKey() +e.getValue());
		}
		

	}

}
