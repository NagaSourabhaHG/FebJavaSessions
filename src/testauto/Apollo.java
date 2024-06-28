package testauto;

public class Apollo extends Hospital {

	@Override

	public void treatPatient() {
		System.out.println("APOLLO TREAT PATIENT");
	}

	@Override
	public void dischargePatient() {
		System.out.println("Discharge the patient APOLLO");
	}
		
		public void performSurgery()
		{
			System.out.println("Perfoming surgery available only in apollo");
		}
	}

