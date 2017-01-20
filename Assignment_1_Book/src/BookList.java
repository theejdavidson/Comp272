import java.util.ArrayList;

public class BookList {
		
		private ArrayList<Book> bookList;
		private String listName;
		private int maxBooks;
		private int howManyBooks;
		
		public String getListName() {
			return listName;
		}
		
		//constructor taking input of list name and max books
		public BookList(ArrayList<Book> bookList, String listName, int maxBooks, int howManyBooks){
			this.bookList = bookList;
			this.listName = listName;
			this.maxBooks = maxBooks;//change constructor to create method (if statement?) for a maximum number of books on the list
			this.howManyBooks = bookList.size();
		}
	
	public void addBook(Book b) {
		bookList.add(b);
	}
	public int numberOfBooks(){
		return howManyBooks;
	}
	public boolean isOnList(){
		if(bookList.equals()){
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
	

		

