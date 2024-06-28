package testauto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> obj = new HashMap<String, String>();
		obj.put("Sourabha", "A");
		obj.put("Ravi", "C");
		obj.put("Sharvil", "A++");
		obj.put("Surabhi", "B");
		obj.put(null, "b");
		obj.put("Surabhi", "A");
		obj.put("SuraBHi", "B+");
		obj.put("tom", "b");
		System.out.println(obj);

		System.out.println(obj.get("Ravi"));
		System.out.println(obj.get("Sourabha"));
		System.out.println(obj.get(null));
		System.out.println(obj.size());

		HashMap<String, String[]> test = new HashMap<String, String[]>();
		String c[] = { "Bng", "mys" };

		test.put("India", c);
		String[] o = test.get("India");
		System.out.println(Arrays.toString(o));
		System.out.println(o.length);
		System.out.println(obj);

		Map<String, String> order = new LinkedHashMap<String, String>();
		order.put("Kiran", "QA");
		order.put("tom", "SDET");
		order.put("Lea", "HR");
		order.put("Nandini", null);
		order.put(null, "watchman");
		System.out.println(order);

		// Maintains the insertion order

		Map<String, String> l = new TreeMap<String, String>();
		l.put("Kiran", "QA");
		l.put("tom", "SDET");
		l.put("Lea", "HR");
		l.put("Nandini", "Dev");
		l.put("pavan", "watchman");
		l.put("2bhumi", "SDET");
		l.put("Test", null);
		System.out.println(l);

		l.forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println("***");

		for (Map.Entry<String, String> m : order.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("tom", "123");

	}

}
