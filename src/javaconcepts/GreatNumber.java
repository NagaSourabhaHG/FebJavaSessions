package javaconcepts;

public class GreatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 2, c = 205, d = 20;
		/*
		 * if (a > b && a > c && a > d) { System.out.println("A is the greater number" +
		 * a);
		 * 
		 * }
		 * 
		 * else if (b > c && b > d) { System.out.println("B is the greatest number" +
		 * b); } else if (c > d) { System.out.println("C is the greatest number " + c);
		 * 
		 * } else { System.out.println("D is the greatest number  " + d); }
		 */

		int z = -1;
		if (z > 0)
			System.out.println("Given input is a positive number");
		else
			System.out.println("Given input is negative number");
		System.out.println("------------------------");

		int n = 203;
		if (n % 2 == 0)
			System.out.println("Its a even number");
		else
			System.out.println("Its a odd number");
		System.out.println("-------------------------");

		String ch = "I".toLowerCase().trim();
		switch (ch) {
		case "a":
			System.out.println("A is a vowel");
			break;
		case "e":
			System.out.println("E is a vowel");
			break;
		case "i":
			System.out.println("I is a vowel");
			break;
		case "o":
			System.out.println("O is a vowel");
			break;
		case "u":
			System.out.println("U is a vowel");
			break;
		default:
			System.out.println("Its a consonent");
			break;
		}
		System.out.println("----------------------------");
		String cho = "i".toLowerCase().trim();
		switch (cho) {
		case "qa":
			System.out.println("Selected QA environment");
			break;
		case "stage":
			System.out.println("Selected stage environment");
			break;
		case "dev":
			System.out.println("Selected dev environment");
			break;
		case "uat":
			System.out.println("Selected uat environment");
			break;
		case "prod":
			System.out.println("Selected prod environment");
			break;
		default:
			System.out.println("Please select proper environment");
			break;
		}
		System.out.println("----------------------------");
		String choj = "SUV  ".toLowerCase().trim();
		switch (choj) {
		case "mini":
			System.out.println("Selected mini");
			break;
		case "sedan":
			System.out.println("Selected sedan");
			break;
		case "suv":
			System.out.println("Selected SUV");
			break;
		case "premium":
			System.out.println("Selected Premium");
			break;
		default:
			System.out.println("Please select proper car type");
			break;
		}
		System.out.println("----------------------------");
		int sal = 10000;
		float interestrate = 6.5f;
		String loantype = "housingloan";
		switch (loantype) {
		case "carloan":
			System.out.println("CAR LOAN SANCTIONED ");
			interestrate = 6.5f;

			break;
		case "housingloan":
			if (sal > 35000) {
				System.out.println("housing loan sanctioned ");
			} else
				System.out.println("Sorry!");
			break;
		case "personalloan":
			System.out.println("Selected SUV");
			break;
		case "educationalloan":
			System.out.println("Selected Premium");
			break;
		default:
			System.out.println("Please select proper car type");

		}
		System.out.println("-------------------");
		int x = 5;
		int y = 10;

		if (x > 0 && y > 0 && x < y && x * 2 < y) {
			System.out.println("Hi");
		}

		if (x > 0 & y > 0 & x < y & x * 2 < y) {
			System.out.println("Hello");
		}

		/*
		 * switch (0) { case 0: if (a > b && a > c && a > d)
		 * System.out.println("A is greater " + a); else if (b > c && b > d) {
		 * System.out.println("B is the greatest number " + b); } else if (c > d) {
		 * System.out.println("C is the greatest number " + c); } else {
		 * System.out.println("D is the greatest number  " + d); } break; default:
		 * System.out.println("Please provide proper input");
		 * 
		 * break;
		 */
		System.out.println("-------------------");
	}
}
