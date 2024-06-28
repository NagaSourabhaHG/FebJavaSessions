package testauto;

/*
 * @author Sourabha 
 */

public class TestConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String v = "200A";
		System.out.println(v + 10);
		v = v.replace("A", "");
		int a = Integer.parseInt(v);
		System.out.println(a);

		String b = "12.33";
		double f = Double.parseDouble(b);
		System.out.println(f);

		String h = "123";
		Short.parseShort(h);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);

		String k = "true";
		boolean p = Boolean.parseBoolean(k);
		System.out.println(p);
		
		if(p)
		{
			System.out.println("Sharvil");
		}
		
		int j=8;
	System.out.println(	String.valueOf(8)+9);
	
	StringBuilder hn=new StringBuilder("Bangalore");
	System.out.println(hn.reverse());

	}

}
