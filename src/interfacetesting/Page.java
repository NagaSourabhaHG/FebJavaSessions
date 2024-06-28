package interfacetesting;

public class Page {

	// One constructor calling another
	// this keyword used for intializing global variables with local variable
	// variables ,
//used in getter and setter ,builder pattern [method returning this],constructor calling

	// recursive construtor invocation page
	String name;
	String title;

	public Page() {
		this("Sourabha", "Sharvil");
		System.out.println("Default constructor");

	}

	public Page(String name, String title) {

		System.out.println("Parameterized ");
		System.out.println(name);
		System.out.println(title);
	}

	public Page(String name)

	{
		this();
		System.out.println("Single paramterized");
	}
}
