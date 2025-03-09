package libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LibraryManagementSystem {
	private List<Book> books;
	private List<Reader> readers;
	private List<BorrowRecord> borrowRecords;
	
	public LibraryManagementSystem() {
		books = new ArrayList<>();
		readers = new ArrayList<>();
		borrowRecords = new ArrayList<>();
	}
	
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println(book.toString());
	}
	
	
	
	
	
}
