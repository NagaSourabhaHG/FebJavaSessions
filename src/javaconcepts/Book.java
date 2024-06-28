package javaconcepts;

public class Book {
	
	//Instance variables/non static variables 
	String title;
	String author;
	int pageCount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalbooks = 0;
		Book obj = new Book();
		obj.title = "Tinkle";
		obj.author = "Sharvil";
		obj.pageCount = 100;
		totalbooks++;

		Book obj2 = new Book();
		obj2.title = "Friends";
		obj2.author = "Sourabha";
		obj2.pageCount = 200;
		totalbooks++;

		Book obj3 = new Book();
		obj3.title = "Peppa pig";
		obj3.author = "Anvitha";
		obj3.pageCount = 900;
		totalbooks++;

		System.out.println(obj.title + obj.author + obj.pageCount);
		System.out.println(obj2.title + obj2.author + obj.pageCount);
		System.out.println(obj3.title + obj3.author + obj.pageCount);
		System.out.println(totalbooks);

	}

}
