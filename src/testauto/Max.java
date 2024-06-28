package testauto;

public class Max extends Hospital {

	@Override

	public void treatPatient() {
		System.out.println("treat patient for max");
	}

	public void dischargePatient() {
		System.out.println("Discharge patient for MAX");
	}

	public void conductTest() {
		System.out.println("Conducting test only in MAX");
	}
}
