package testauto;

public class Fortis extends Hospital {
	
	@Override 
	
	public void treatPatient()
	{
		System.out.println("Fortis hospital treat patient ");
	}
	@Override
	public void dischargePatient()
	{
		System.out.println("Fortis Discharge the Patient");
	}
	
	public void  prescribeMedication()
	{
		System.out.println("Medicines description only available for fortis");
	}

}
