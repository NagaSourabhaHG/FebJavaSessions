package javaconcepts;

public class Rectangle {

	int length;
	int width;

	private Rectangle() {

	}

	public Rectangle(int length, int width) {
		
		this.length = length;
		this.width = width;

	}

	public void calculateArea(int length, int width) {
		int area = length * width;
		System.out.println(area);
	}

	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		System.out.println("Value of length is  " + obj.length + "Value of width  " + obj.width);
		obj.calculateArea(obj.length, obj.width);
		Rectangle obj2 = new Rectangle(6,8);
		System.out.println("Value of length is " +obj2.length +"Value of the width "+ obj2.width);
		obj.calculateArea(obj2.length, obj2.width);
		
		
	}
}
