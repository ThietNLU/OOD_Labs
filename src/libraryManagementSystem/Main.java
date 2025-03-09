package libraryManagementSystem;

import java.time.LocalDate;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book("B001", "Clean Code", "Robert C. Martin", "Programming", 2008, 5, 5));
		books.add(new Book("B002", "The Pragmatic Programmer", "Andrew Hunt", "Programming", 1999, 4, 4));
		books.add(new Book("B003", "Introduction to Algorithms", "Thomas H. Cormen", "Algorithms", 2009, 6, 6));
		books.add(new Book("B004", "Design Patterns", "Erich Gamma", "Software Engineering", 1994, 3, 3));
		books.add(new Book("B005", "Artificial Intelligence: A Modern Approach", "Stuart Russell", "AI", 2020, 7, 7));
		books.add(new Book("B006", "The Art of Computer Programming", "Donald Knuth", "Mathematics", 1997, 2, 2));
		books.add(new Book("B007", "Refactoring", "Martin Fowler", "Software Engineering", 1999, 5, 5));
		books.add(new Book("B008", "Database System Concepts", "Abraham Silberschatz", "Databases", 2019, 4, 4));
		books.add(new Book("B009", "Computer Networking", "James F. Kurose", "Networking", 2021, 6, 6));
		books.add(new Book("B010", "Deep Learning", "Ian Goodfellow", "Machine Learning", 2016, 3, 3));
		
		List<BorrowRecord> borrowRecords = new ArrayList<>();

		borrowRecords.add(new BorrowRecord("R001", "B001", LocalDate.of(2024, 3, 1), LocalDate.of(2024, 3, 15), true));
		borrowRecords.add(new BorrowRecord("R002", "B003", LocalDate.of(2024, 2, 20), LocalDate.of(2024, 3, 5), false));
		borrowRecords.add(new BorrowRecord("R003", "B002", LocalDate.of(2024, 3, 5), LocalDate.of(2024, 3, 19), true));
		borrowRecords.add(new BorrowRecord("R004", "B005", LocalDate.of(2024, 2, 25), LocalDate.of(2024, 3, 10), false));
		borrowRecords.add(new BorrowRecord("R005", "B004", LocalDate.of(2024, 3, 10), LocalDate.of(2024, 3, 24), true));
		borrowRecords.add(new BorrowRecord("R006", "B006", LocalDate.of(2024, 2, 28), LocalDate.of(2024, 3, 14), false));
		borrowRecords.add(new BorrowRecord("R007", "B007", LocalDate.of(2024, 3, 8), LocalDate.of(2024, 3, 22), true));
		borrowRecords.add(new BorrowRecord("R008", "B008", LocalDate.of(2024, 3, 2), LocalDate.of(2024, 3, 16), true));
		borrowRecords.add(new BorrowRecord("R009", "B009", LocalDate.of(2024, 2, 26), LocalDate.of(2024, 3, 12), false));
		borrowRecords.add(new BorrowRecord("R010", "B010", LocalDate.of(2024, 3, 4), LocalDate.of(2024, 3, 18), true));

		List<Reader> readers = new ArrayList<>();

		readers.add(new Reader("R001", "Nguyễn Văn A", "0987654321", "nguyenvana@example.com", "Hà Nội"));
		readers.add(new Reader("R002", "Trần Thị B", "0978123456", "tranthib@example.com", "TP.HCM"));
		readers.add(new Reader("R003", "Lê Văn C", "0967123456", "levanc@example.com", "Đà Nẵng"));
		readers.add(new Reader("R004", "Phạm Thị D", "0956123456", "phamthid@example.com", "Hải Phòng"));
		readers.add(new Reader("R005", "Hoàng Văn E", "0945123456", "hoangvane@example.com", "Cần Thơ"));
		readers.add(new Reader("R006", "Đặng Thị F", "0934123456", "dangthif@example.com", "Huế"));
		readers.add(new Reader("R007", "Bùi Văn G", "0923123456", "buivang@example.com", "Nha Trang"));
		readers.add(new Reader("R008", "Võ Thị H", "0912123456", "vothih@example.com", "Quảng Ninh"));
		readers.add(new Reader("R009", "Ngô Văn I", "0901123456", "ngovania@example.com", "Vinh"));
		readers.add(new Reader("R010", "Dương Thị K", "0890123456", "duongthik@example.com", "Bình Dương"));
		
		LibraryManagementSystem lms = new LibraryManagementSystem();
		lms.addBook(books.get(0));

	}
	

}
