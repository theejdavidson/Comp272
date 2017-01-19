public class Book {
	
	
	private String title;
	private String author;
	private int pubYear;
	private int pageNum;
		
	//Getter method for returning page number
	public int getPages() {
		return pageNum;
	}
	
	//  Constructor for Book object, simply assigns all fields
	public Book(String title, String author, int pubYear, int pageNum){
		this.title = title;
		this.author = author;
		this.pubYear = pubYear;
		this.pageNum = pageNum;
	}
	
	//toString method
	public String toString(){
		return "The title of the book is: " + this.title + " author: " + this.author + " Number of pages: " + getPages() +" Year of publishing: " + this.pubYear;
	}
	public void updateBook(int newPages, int newYear) {
		pubYear = newYear;
		pageNum = newPages;
	}
}
