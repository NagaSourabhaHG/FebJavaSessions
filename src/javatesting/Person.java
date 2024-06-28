package javatesting;

public class Person {
	
	private  String name;
	private int age ;
	private char gender;
	
	public String getName()
	{
		return name ;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public void  setAge(int age )
	{
		this.age=age;
		
	}

	public void setName(String name )
	{
		this.name=name;
	}
	
	public void setGender(char gender)
	{
		this.gender=gender ;
	}
	
	public void printInfo()
	{
	  System.out.println(this.age+" "+this.name+" "+this.gender);
	}
}
