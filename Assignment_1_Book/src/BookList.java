import java.util.ArrayList;

public class BookList {
		
		private ArrayList<Book> booksList;//declares Arraylist comprised of instances of Book object
		private String listName;
		private int maxBooks;
		

		
		//constructor taking input of list name and max books, constructs new arrayList
		public BookList(String newListName, int newMaxBooks){
			booksList = new ArrayList<Book>();
			listName = newListName;
			setMaxBooks(newMaxBooks);//setter for maxBooks, implemented at bottom of file
		}
	//accessor that returns the name of current list
	public String getListName() {
			return listName;
		}
	//takes an input as a book object and adds it to the list
	public void addBook(Book b) {
		booksList.add(b);
	}
	//returns number of books on a list
	public int numberOfBooks(){
		return booksList.size();
	}
	//boolean check for whether or not a book object is contained in the arraylist
	public boolean isOnList(Book a){
		boolean x = false;
		for(Book y : booksList){
			if(y.equals(a)){
				x = true;
			}
		}
		return x;
	}
	//returns a book object corresponding to author string search within the arraylist
	public Book findByAuthor(String author){
		Book x = null;
		for (int i = 0; i < booksList.size(); i++){
			if (booksList.get(i).getAuthor().equalsIgnoreCase(author))		
				x = booksList.get(i);
		}
		return x;
	}
	//toString that prints all toString methods from instances of book object on list
	public String toString() {
		String x = "";
		for (int i = 0; i < booksList.size(); i++){
			x = x + booksList.get(i).toString();
		}
		return x;
	}
	//counter that totals all pages of books within list
	public int totalPages() {
		int pageCount = 0;
		for(int i = 0; i<booksList.size(); i++){
			pageCount = pageCount + booksList.get(i).getPages();
		}
		return pageCount;
	}
	//getter and setter for maxbooks int (not needed in program per se but since the constructor calls it it should have these methods)
	public int getMaxBooks() {
		return maxBooks;
	}
	public void setMaxBooks(int maxBooks) {
		this.maxBooks = maxBooks;
	}
		
	}
	

		

