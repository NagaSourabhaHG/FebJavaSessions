package javaconcepts;

public class Car {
	
	String make;
	String model;
	int year;
	
	public Car(String make, String model ,int year)
	{
		this.make=make;
		this.model=model;
		this.year=year;
		
	}
	
	public Car (String make ,int year)
	{
		
		
	}
	
	
	public Car(int year, String make )
	{
		
	}
 /*public Car ()
 {
	 
 }*/
 
 public static void main (String[] args)
 {
	//Car obj= new Car();
	Car obj2=new Car("test","haundai",1996);
	Car obj3= new Car("test1","audi",1995);
	
//	System.out.println(obj.make+ obj.model+obj.year);
	System.out.println(obj2.make+obj2.model+obj2.year);
	System.out.println(obj3.make+obj3.model+obj3.year);
 }
 
 }
