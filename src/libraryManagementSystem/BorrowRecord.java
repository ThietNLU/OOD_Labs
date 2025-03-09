package libraryManagementSystem;

import java.time.LocalDate;

public class BorrowRecord {
	private String readerId;
	private String bookId;
	private LocalDate borrowDate;
	private LocalDate dueDate;
	private boolean status;
	
	public BorrowRecord(String readerId, String bookId, LocalDate borrowDate, LocalDate dueDate, boolean status) {
		this.readerId = readerId;
		this.bookId = bookId;
		this.borrowDate = borrowDate;
		this.dueDate = dueDate;
		this.status = status;
	}

	@Override
	public String toString() {
	    return String.format("BorrowRecord{readerId='%s', bookId='%s', borrowDate=%s, dueDate=%s, status=%b}", 
	            readerId, bookId, borrowDate, dueDate, status);
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	
}
