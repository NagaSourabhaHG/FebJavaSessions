package javaconcepts;

public class TestM {

	public boolean comparetwoString(String a, String j[]) {

		boolean flag;
		for (String g : j) {
			g.equalsIgnoreCase(a);
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v = new Vehicle();
		v.Mechanics();
		v.Knematics();

		AutoMobiles m = new AutoMobiles();
		m.speed();

		String b[] = { "L", "M", "AS" };
		TestM n = new TestM();
		boolean q = n.comparetwoString("L", b);
		System.out.println(q);

	}

}
