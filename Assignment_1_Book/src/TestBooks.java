public class TestBooks {
//Number of hours worked: 6
//Book- 1,2,3,4
//BookList- 1,2,3,4,5,6,7,8
//TestBooks- 1,2,3,4,5,6,7,8
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
	//prints subject line, list titles and respective toStrings with blank lines for separation
	System.out.println("Current Lists of Books With List Contents: ");
	System.out.println(myBooks.getListName() + ": \n" + myBooks.toString());
	System.out.println();
	System.out.println(wishList.getListName() + ": \n" + wishList.toString());
	System.out.println();
	//Adds 2 new books to My Books list and 2 new books to wish list
	Book b4 = new Book("A Confederacy of Dunces", "John Kennedy Toole", 1980, 405);
	Book b5 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979, 250);
	Book b6 = new Book("Asterios Polyp", "David Mazzucchelli", 2009, 344);
	Book b7 = new Book("Slaughterhouse-Five", "Kurt Vonnegut", 1969, 215);
	
	myBooks.addBook(b4);
	myBooks.addBook(b5);
	wishList.addBook(b6);
	wishList.addBook(b7);

	b1.updateBook(2017, 152);//updates both Lewis Carroll books with new dates and page numbers
	b2.updateBook(1997, 30026);
	
	boolean x = myBooks.isOnList(b2);//booleans to check if Alice in Wonderland (b2) is on either list
	boolean y = wishList.isOnList(b2);
	if (x == true){
		System.out.println("Alice in Wonderland is on " + myBooks.getListName() + " and has " + b2.getPages() + " pages");
		}
	else{
		System.out.println("Alice in Wonderland is not on " + myBooks.getListName());
		}
	
	if (y == true){
		System.out.println("Alice in Wonderland is on " + wishList.getListName() + " and has " + b2.getPages() + " pages");
		}
	else{
		System.out.println("Alice in Wonderland is not on " + wishList.getListName());
		}
	//Above if statements print the results of boolean check on Alice in Wonderland's list presence
	//Checks to see if any book by Edsger Dijkstra is on wishlist and prints results
	if (wishList.findByAuthor("Edsger Dijkstra") != null){
		System.out.println("A book by Edsger Dijkstra is on " + wishList.getListName());
	}
	else{
		System.out.println("There are no books by Edsger Dijikstra on " + wishList.getListName());
	}
	//prints updated version of both my books and wishlist, with additional books in each list specified above in file
	System.out.println();
	System.out.println("Updated Book Lists: ");
	System.out.println(myBooks.getListName() + ": \n" + "Number of books: " + myBooks.numberOfBooks() + "\n" + myBooks.toString());
	System.out.println();
	System.out.println(wishList.getListName() + ": \n" + "Number of books: " + wishList.numberOfBooks() + "\n" + wishList.toString());
	System.out.println();

		}
}

