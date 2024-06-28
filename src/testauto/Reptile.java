package testauto;

public class Reptile extends Mammal  {
	
	String scalePattern;
	
	final int age=10;
	
	public void crawl()
	{
		System.out.println("Crawling");
	}
	
	@Override
	public final void giveBirth()
	{
		System.out.println("tttt");
	}

}
