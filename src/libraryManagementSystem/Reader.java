package libraryManagementSystem;

import java.util.*;

public class Reader {
	private String readerId;
	private String fullName;
	private String numberPhone;
	private String email;
	private String address;
	private List<BorrowRecord> borrowRecord;
	
	public Reader(String readerId, String fullName, String numberPhone, String email, String address) {
		this.readerId = readerId;
		this.fullName = fullName;
		this.numberPhone = numberPhone;
		this.email = email;
		this.address = address;
		this.borrowRecord = new ArrayList<BorrowRecord>();
	}

	@Override
	public String toString() {
	    List<String> bookIds = borrowRecord.stream().map(BorrowRecord::getBookId).toList();

	    return String.format("Reader{id='%s', name='%s', phone='%s', email='%s', address='%s', borrowedBooks=%s}",
	            readerId, fullName, numberPhone, email, address, bookIds);
	}

	
	
}
