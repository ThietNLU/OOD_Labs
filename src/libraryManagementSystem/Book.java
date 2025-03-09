package libraryManagementSystem;

public class Book {
	private String bookId;
	private String title;
	private String author;
	private String category;
	private int publishYear;
	private int totalBook;
	private int availableBook;
	
	public Book(String bookId, String title, String author, String category, int publishYear, int totalBook,
			int availableBook) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.publishYear = publishYear;
		this.totalBook = totalBook;
		this.availableBook = availableBook;
	}
	
	
	

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public int getTotalBook() {
		return totalBook;
	}

	public void setTotalBook(int totalBook) {
		this.totalBook = totalBook;
	}

	public int getAvailableBook() {
		return availableBook;
	}

	public void setAvailableBook(int availableBook) {
		this.availableBook = availableBook;
	}
	
	
	
	
	
}
