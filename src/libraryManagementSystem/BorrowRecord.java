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
	
	
}
