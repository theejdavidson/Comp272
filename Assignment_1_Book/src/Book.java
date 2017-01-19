public class Book {
	
	
	private String title;
	private String author;
	private int pubYear;
	private int pageNum;
		
	public int getPages() {
		return pageNum;
	}
	public String toString(){
		return "The number of pages is: " + this.pageNum +" The ";//update after booklist
	}
	public void updateBook {
		this.pubYear = pubYear;
		this.pageNum = pageNum;
	}
}

