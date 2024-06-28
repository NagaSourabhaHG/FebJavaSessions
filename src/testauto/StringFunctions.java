package testauto;

import java.util.Arrays;

public class StringFunctions {

	// Assignment 1

	public boolean stringEquality(String str1, String str2) {
		if (str1.equals(str2)) {

			return true;
		} else
			return false;

	}

	// Assignment 2 -Didnot get even after doing trim
	// Assignment 3- Printing first and last character

	public void stringFirstAndLastCharacter(String z) {
		{
			System.out.println(z.charAt(0));
			System.out.println(z.charAt(z.length() - 1));
		}
	}

	public boolean stringContent(String str1, String str2) {
		if (str1.contains(str2))
			return true;
		else
			return false;
	}

	public static String stringReverse(String str1) {

		String str2 = "";

		if (str1 == null)
			throw new RuntimeException("String is null pass proper string" + str1);

		if (str1.isEmpty() || str1.isBlank())
			return str1;

		if (str1.length() == 1)
			return str1;

		{
			for (int i = str1.length() - 1; i >= 0; i--) {

				str2 = str2 + str1.charAt(i);

			}
			return str2;

		}
	}

	public char stringIndexOfMethod(String str1, int number) {

		char j = ' ';

		if (number <= str1.length() - 1) {

			j = str1.charAt(number);

		}

		else {

			System.out.println("Not a valid number " + -1);
		}
		return j;

	}

	public String convertFirstToUppercase(String str) {

		String str2 = "";
		String str3 = "";
		{
			String str1[] = str.split("_");
			for (String e : str1) {
				str2 = str2 + " "
						+ e.replaceAll(String.valueOf(e.charAt(0)), String.valueOf(e.charAt(0)).toUpperCase());
				str3 = StringFunctions.stringReverse(str2);

			}
			return str3;

		}
	}

	public String reverseStringWord(String str) {

		String str2 = "";

		String str1[] = stringSplitMethod(str, "_");

		for (String e : str1) {
			str2 = str2 + stringReverse(e);
		}

		return str2;

	}

	public String[] stringSplitMethod(String str, String c) {

		int length = str.length();

		String str1[] = new String[length];

		{
			for (int i = 0; i < str.length() - 1; i++) {
				str1 = str.split(c);
			}

			return str1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello this is my java code and i am so ice happy";
		System.out.println(s.length());

		System.out.println("li " + 0);
		System.out.println("hi " + (s.length() - 1));

		// CharAt gives the character present on passing index
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(7));

		System.out.println(s.charAt(8));
		try {
			System.out.println(s.charAt(-1));
			System.out.println(s.charAt(38));
		} catch (StringIndexOutOfBoundsException e) {
			// e.printStackTrace();
		}
		// indexof gives the index present on passing the character or string method
		// available for both

		System.out.println(s.indexOf('t'));
		System.out.println(s.indexOf('i'));
		// System.out.println(s.indexOf('j'));
		System.out.println(s.indexOf('i', 3));
		System.out.println(s.indexOf('i', 6));
		System.out.println(s.indexOf('i', s.indexOf('i') + 1));
		int z = s.indexOf('i', s.indexOf('i') + 1);
		System.out.println("z " + z);
		System.out.println(s.indexOf('i', z + 1));
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf('i', 0));

		int q = s.indexOf('i', (z) + 1);
		System.out.println(s.indexOf('i', q + 1));
		String message = "welcome admin";
		if (message.indexOf("admin") == 8) {
			System.out.println("User is available");
		} else
			System.out.println("not available");
		// lowecase
		// uppercase

		String j = "selenium automation";
		System.out.println(j.toUpperCase());
		System.out.println(j);
		String p = "SOURABHA";
		System.out.println(p.toLowerCase());
		// trim

		String username = "   test automation       ";
		System.out.println(username.trim());
		// replaceall
		String DOB = "01-01-1990";
		System.out.println(DOB.replaceAll("-", "/"));
		String se = "I love testing Icecream ";
		System.out.println(se.replace("love", "enjoy"));
		System.out.println(se.replace('l', 't'));
		System.out.println(se.replaceFirst("I", "J"));
		System.out.println("automation".replaceAll("n", "o"));

		// contains

		String n = "Welcome admin";
		System.out.println((n.contains("Welcome")));

		// equals
		String t1 = "Hello Selenium   ";
		String t2 = "Hello Selenium";
		System.out.println(t1.equals(t2));
		System.out.println(t1.trim().equalsIgnoreCase("hello Selenium"));

		// split
		// split method gives string array as output
		String lang = "JAVA_PYTHON_RUBY_C++";
		String n1[] = lang.split("_");
		System.out.println(n1[0]);
		System.out.println(Arrays.toString(n1));

		String u = "xXTestingXxXSeleniumXXxXAutomationxXxJavaX";
		String result[] = u.split("xX");
		System.out.println(Arrays.toString(result));

		String u1 = "aatestingaaaaXXzing";
		String h[] = u1.split("aa");
		System.out.println(Arrays.toString(h));

		String empname = "Tom,Jerry,dora";
		String[] p1 = empname.split(",");
		System.out.println(Arrays.toString(p1));

		// \single slash to consider "" as normal

		String up = "I love \"Java\" coding";
		System.out.println(up);

		String xpath = "//input[@id=\"Firstname\"]";
		System.out.println(xpath);

		String x = "//input[@id=\"Firstname\"]";
		System.out.println(xpath);

		String j1 = "//input[@id=\"First\\name\"]";
		System.out.println(j1);

		String l = "       Hello      Everyone       ";

		System.out.println("Assignments");
		System.out.println("*****");
		System.out.println(l.trim());

		StringFunctions h2 = new StringFunctions();
		String str1 = "hello";
		String str2 = "hello";
		boolean result1 = h2.stringEquality("hello", "Helolo");
		System.out.println(result1);
		String s3 = "My Name is NagaSourabha";
		h2.stringFirstAndLastCharacter(s3);
		String s4 = "Hometour";
		String s5 = "tour";
		boolean m = h2.stringContent(s4, s5);
		System.out.println(m);
		String h3 = h2.stringReverse("Sourabha");
		// System.out.println(h3);

		char h7 = h2.stringIndexOfMethod("Sourabha", 0);
		System.out.println(h7);
		String lang1 = "this is my java code";
		String[] e1 = h2.stringSplitMethod(lang1, " ");
		System.out.println(Arrays.toString(e1));
		String d3 = h2.stringReverse("j");
		System.out.println(d3);
		System.out.println(d3.length());
		System.out.println("****");
		String h6 = h2.convertFirstToUppercase(lang1);
		System.out.println(h6);
		String e4 = h2.reverseStringWord(lang1);
		System.out.println(e4);
		String jg = "";
		System.out.println(jg.length());

	}

}
