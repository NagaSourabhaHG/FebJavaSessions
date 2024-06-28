package javaconcepts;

import java.util.Arrays;

public class FunctionsA {
//Return type depends on the logic of the method 
	public int addNumbers(int a, int b) {

		int sum = a + b;

		return sum;

	}

	public float diffOfNumbers(int a, int b) {
		float diff = a - b;
		return diff;
	}

	public int productOfNumbers(int a, int b) {
		int mul = a * b;
		return mul;
	}

	public float divOfNumbers(int a, int b) {
		float div = a * b;
		return div;
	}

	public double prodOfNumbers(int a, int b) {
		double prod = a * b;
		return prod;
	}

	public double circumferenceOfCircle(int r) {
		double circumference = 2 * Math.PI * r;

		return circumference;

	}

	public double AreaeOfCircle(int r) {
		double area = 2 * Math.PI * Math.pow(r, r);

		return area;
	}

	public void maxOfThreeNumbers(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("A is greater");
		} else if (b > c) {
			System.out.println("B is greater");
		} else {
			System.out.println("C is greater");
		}
	}

	public void minOfThreeNumbers(int a, int b, int c) {
		if (a < b && a < c)
			System.out.println("A is lesser");
		else if (b < c)
			System.out.println("B is lesser");
		else
			System.out.println("C is lesser");
	}

	public boolean evenoROdd(int n) {

		if (n % 2 == 0) {
			System.out.println("Its a even number");
			return true;
		} else
			System.out.println("Its a odd number");

		return false;

	}

	public boolean rightToVote(int age) {
		boolean flagA;

		if (age >= 18) {
			System.out.println("Eligible to vote");
			flagA = true;
		} else {
			System.out.println("Not Eligble !!!!");
			flagA = false;

		}
		return flagA;
	}

	public void printTheGrade(int number) {

		if (number > 90 && number < 100)
			System.out.println("AA grade");
		else if (number >= 80 && number <= 90)
			System.out.println("AB grade");
		else if (number > 70 && number <= 80)
			System.out.println("BB grade");
		else if (number > 60 && number <= 70)
			System.out.println("BC grade");
		else if (number > 50 && number <= 60)
			System.out.println("CD grade");
		else if (number > 40 && number <= 50)
			System.out.println("DD grade");
		else if (number < 40 && number > 0)
			System.out.println("FAIL!!!!");
		else
			System.out.println("Please enter proper marks ");
	}

	public int printTheFactorial(int fact) {
		int number = 1;
		for (int i = 1; i <= fact; i++) {
			if (fact > 1) {
				number = number * i;
			}

		}
		return number;
	}

	public boolean compareStrings(String str1, String str2) {
		boolean flag;

		if (str1.equals(str2)) {
			System.out.println("Strings are equal");
			flag = true;
		} else {
			System.out.println("Strings are not equal");
			flag = false;
		}
		return flag;
	}

	public double calculateAverage(double[] numbers)

	{
		double sumofarray = 0.0;
		double average;
		for (int i = 0; i < numbers.length; i++) {

			sumofarray = sumofarray + numbers[i];
		}
		average = sumofarray / numbers.length;
		return average;

	}

	public String concatenateStrings(String[] strings) {
		String concatedstring = "";
		for (int i = 0; i < strings.length; i++) {
			concatedstring = concatedstring + " " + strings[i];
		}
		return concatedstring;
	}

	public void printHello() {
		System.out.println("Hello world");
	}

	public Object[] reverseArray(Object[] array) {

		int length = array.length;

		Object reverseArray[] = new Object[length];

		int count = 0;

		for (int i = length - 1; i >= 0; i--) {
			reverseArray[count] = array[i];
			count++;
		}
		return reverseArray;
	}

	public void printArrayWithFactor(int factor, int[] array)

	{
		for (int i = 0; i < array.length; i++) {
			int results;
			System.out.println(results = factor * array[i]);
		}

	}

	public void printStatusMessage(String message, boolean isSuccess) {
		if (isSuccess) {
			System.out.println("Success" + message);
		} else {
			System.out.println("Failure" + message);
		}
	}

	public static String[] printReverseStringArray(String[] strings) {

		int length = strings.length;

		String reversedstring[] = new String[length];

		int count = 0;

		for (int i = strings.length - 1; i >= 0; i--) {

			reversedstring[count] = strings[i];
			count++;

		}
		return reversedstring;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionsA method = new FunctionsA();
		int d = method.addNumbers(3, 6);
		if (d != 0) {
			System.out.println("super");
		}
		double t = method.prodOfNumbers(7, 7);

		method.circumferenceOfCircle(5);
		double f = method.circumferenceOfCircle(5);
		System.out.println("Circumference of the Circle  " + f);

		double z = method.AreaeOfCircle(8);
		System.out.println("Area of the Circle  " + z);
		method.maxOfThreeNumbers(88, 898, 88);
		method.minOfThreeNumbers(88, 90, 9);
		boolean value = method.evenoROdd(8095);
		System.out.println("Flag is set to " + value);
		boolean flagA = method.rightToVote(16);
		System.out.println(flagA);
		method.printTheGrade(38);
		System.out.println(method.printTheFactorial(0));
		method.printHello();
		boolean h = method.compareStrings("sourabha", "sourabha");
		System.out.println(h);

		double z1[] = { 23.44, 35.6, 35.88, 78.9, 90.99, 89, 89.00 };
		double summy = method.calculateAverage(z1);
		System.out.println(summy);

		String a1[] = { "Apple", "Ball", "Cat" };
		String j = method.concatenateStrings(a1);
		System.out.println(j);

		int a[] = { 1, 2, 3, 4 };

		method.printArrayWithFactor(5, a);

		Object s[] = { 13, "PP", 89 };
		method.reverseArray(s);
		method.printStatusMessage("pass", true);

		String test[] = { "cat", "Apple", "Sinchan" };

		method.printReverseStringArray(test);

		Object originalarray[] = { 1, 2, 3, 4, 5 };
		FunctionsA u = new FunctionsA();
		Object reverseArray[] = u.reverseArray(originalarray);
		for (Object y : reverseArray) {
			System.out.println(y);
		}
		System.out.println("%%%%%%%");

		String[] OriginalString = { "Apple", "Bat", "Cat", "Dog" };
		String[] newStringarray = printReverseStringArray(OriginalString);
		System.out.println(Arrays.toString(newStringarray));

		boolean r = method.evenoROdd(4);
		System.out.println(r);

	}
}