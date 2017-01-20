import java.util.ArrayList;

public class BookList {
		
		//private ArrayList<Book> bookList;
		private String listName;
		private int maxBooks;
		

		
		//constructor taking input of list name and max books
		public BookList(String listName, int maxBooks){
			//this.bookList = bookList;
			this.listName = listName;
			this.maxBooks = maxBooks;//change constructor to create method (if statement?) for a maximum number of books on the list
		}
	//accessor that returns the name of current list
	public String getListName() {
			return listName;
		}
	public void addBook(Book b) {
		BookList.add(b);
	}
	public int numberOfBooks(){
		return bookList.size();
	}
	public boolean isOnList(Book a){
		if(bookList.contains(a)){
			return true;
		}
		return false;
	}
	public String findByAuthor(){
		
	}
	public String toString() {
		return 
	}
	public int totalPages(int pageNum) {
		
	}
	

		

