import java.util.ArrayList;

public class BookList {
		
		private ArrayList<Book> bookList;
		private String listName;
		private int maxBooks;
		private int howManyBooks = bookList.size();
		
		
	public String getListName() {
		return listName;
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
	

		

