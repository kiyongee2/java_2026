package obj_arrays;

public class Book {
	private int bookNumber;
	private String bookName;
	private String author;
	
	public Book() {};  //기본 생성자 명시
	
	public Book(int bookNumber, String bookName, String author) {
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookNumber + ": " + bookName + ", " + author);
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
