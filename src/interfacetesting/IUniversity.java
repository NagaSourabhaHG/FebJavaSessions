package interfacetesting;

public interface IUniversity {

	
	public void universityLogo();
	public void universityChancellor();
	public void universtityPassingMarks();
	
	default void badge()
	{
		System.out.println("Iuniversity -blade");
	}
	
	
}
