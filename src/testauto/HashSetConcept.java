package testauto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set<String> browser = new HashSet<String>();
		// Set<String> browser = new LinkedHashSet<String>();

		Set<String> browser = new TreeSet<String>();

		browser.add("Chrome");
		browser.add("Sourabha");
		browser.add("firefox");
		browser.add("IE");
		System.out.println(browser);

		for (String e : browser) {
			System.out.println(e);
		}
		System.out.println("*****");
		Iterator<String> it = browser.iterator();
		while (it.hasNext()) {
			String br = it.next();
			System.out.println(br);
		}

		// Set to list
		List<String> browserlist = new ArrayList<String>(browser);
		System.out.println(browserlist.get(0));
		System.out.println(browserlist.get(1));

		System.out.println(browser.contains("Chrome"));

	}

}
