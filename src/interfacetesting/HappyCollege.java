package interfacetesting;

public class HappyCollege extends College implements IBangaloreUniversity, IMysoreUniversity, ITumkurUniversity {

	@Override
	// from Iuniversity
	public void universityLogo() {
		System.out.println("IUniversity -test");

	}

//Iuniversity
	@Override
	public void universityChancellor() {
		// TODO Auto-generated method stub
		System.out.println("Iuniversity-chancell");

	}

//Iuniversity
	@Override
	public void universtityPassingMarks() {
		// TODO Auto-generated method stub
		System.out.println("IUniversity -passing marks ");

	}

//tumkur univeristy
	@Override
	public void noOfSupplimentary() {
		// TODO Auto-generated method stub
		System.out.println("IUniverity-suppli");

	}

//mysore
	@Override
	public void noOfSubjects() {
		// TODO Auto-generated method stub
		System.out.println("IMysore -noofsub");

	}

//bangalore
	@Override
	public void booksToRefer() {
		// TODO Auto-generated method stub
		System.out.println("IBangalore-books to refer");

	}

//bangalore
	@Override
	public void booksLanguage() {
		// TODO Auto-generated method stub
		System.out.println("IBangalore-books language");

	}
	public void badge()
	{
		System.out.println("Happy Colleg -blade");
	}
	
}
