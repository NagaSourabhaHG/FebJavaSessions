package testauto;

public interface IAICTE {
	
	public void  joiningFees();
	
	default void Syallabus()
	{
		System.out.println("AICTE-Syallabus");
	}
	
	public void degreeCertificate();
	
	public void corrections();
	
	public void referredTextbooks();
	
}
