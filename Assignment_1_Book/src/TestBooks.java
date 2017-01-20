import java.util.ArrayList;

public class TestBooks {

	public static void main(String args[]){
		
//Put this code at the start of your main. DO NOT CHANGE IT AT ALL
//If this code does not compile, there is a problem with your class definitions, change them instead
	Book b1;
	Book b2;
	Book b3;
	BookList myBooks;
	BookList wishList;
		
	b1 = new Book("Through the Looking Glass", "Lewis Carroll", 1871, 140);
	b2 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll", 1865, 125);
	b3 = new Book("Principia Mathematica", "Alfred North Whitehead and Bertrand Russell", 1910, 509);
		
	myBooks = new BookList("My Own Books", 100);
	wishList = new BookList("Wish List", 10);
	myBooks.addBook(b1);
	myBooks.addBook(b2);
	wishList.addBook(b3);
//End of mainStarter
	
		}
}

