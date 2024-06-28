package testauto;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "100";
		System.out.println(s + 20);// 10020

		// Static method
		int i = (Integer.parseInt(s));
		System.out.println(i + 20);

		double h = Double.parseDouble(s);
		System.out.println(h);

	}

}
