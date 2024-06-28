package javaconcepts;

public class Person {
	
	/*
	 * @Sourabha 
	 * Basically on invoking the parameterized constructor the local variables 
	 * in the constructor will be intialized ,in case if u want to intialize global variable u need make use of
	 * this keyword i.e, this.gc=lc 
	 * 
	 * Constructor will have same name as class and also doesnot have return type and it return anything 
	 * 
	 * we can have multiple constructors in the class and we can differentiate with help of parameters 
	 * 
	 * can we call other method or constructor within same class?
	 * 
	 */

	String name;
	int age;
	char gender;
	double height;

	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public static void main(String[] args) {
		Person obj = new Person("Rahul", 24, 'M', 157.23);
		System.out.println("Name is :"+obj.name +"  "+"Age is :"+" "+obj.age +" "+"Gender is : "+ obj.gender+ " " + "Height is : "+ obj.height);
		Person obj2 = new Person("Sanvi", 23, 'F', 134.44);
		System.out.println(obj2.name + obj2.age + obj2.gender + obj2.height);
	}

}
