package books;

public class book {
	private String publisher = " ";
	private int year = 0;
	private String author = " ";
	public static int numberOfBooks = 0;
	
	public book(String publisher, int year, String author) {
		//super();
		this.publisher = publisher;
		this.year = year;
		this.author = author;
		numberOfBooks ++;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
