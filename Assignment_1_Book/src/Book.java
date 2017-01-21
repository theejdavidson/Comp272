public class Book {
	
	
	private String title;
	private String author;
	private int pubYear;
	private int pageNum;
		
	
	
	//  Constructor for Book object, simply assigns all fields
	public Book(String title, String author, int pubYear, int pageNum){
		this.title = title;
		this.author = author;
		this.pubYear = pubYear;
		this.pageNum = pageNum;
	}
	
	//Getter method for returning page number
		public int getPages() {
			return pageNum;
		}
		
		//Getter method for returning author
		public String getAuthor() {
			return author;
		}
	
	//toString method
	public String toString(){
		return "Title: " + this.title + " // Author: " + getAuthor() + " // " + getPages() + " pages // Published in " + this.pubYear + "\n";
	}//toString format is edited for aesthetic and readability purposes, dual slash marks help differentiate segments of information in the output while allowing all individual book info to remain on a single line
	
	public void updateBook(int newYear, int newPages) {//updates existing book on a list with new year and number of pages
		pubYear = newYear;
		pageNum = newPages;
	}
}
