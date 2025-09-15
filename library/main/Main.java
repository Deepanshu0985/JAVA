package library.main;

import library.system.IDGenerator;
import library.books.Book;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        // Generate book IDs automatically
        int bookId1 = IDGenerator.nextBookIsbn();
        int bookId2 = IDGenerator.nextBookIsbn();

        // Create 2 books
        Book javaBook = new Book(bookId1, "Java OOP", "James Gosling", 1995, false, 3);
        Book pythonBook = new Book(bookId2, "Python Basics", "Guido van Rossum", 2000, false, 2);

        System.out.println("=== Books in library ===");
        System.out.println(javaBook);
        System.out.println(pythonBook);

        // Issue one copy of the Java book
        javaBook.issueOneCopy();
        System.out.println("\nAfter issuing one Java book:");
        System.out.println(javaBook);

        // Create an issue record for this book (memberId = 101)
        Book.IssueRecord record = javaBook.new IssueRecord(
                101,
                LocalDate.now(),                // issue today
                LocalDate.now().plusDays(7)     // due in 7 days
        );

        System.out.println("\n=== Issue record ===");
        System.out.println(record);

        // Simulate a late return (returned after 10 days)
        record.markReturned(LocalDate.now().plusDays(10));
        System.out.println("\nAfter return:");
        System.out.println("Overdue days: " + record.overdueDays());
        System.out.println("Fine (5/day): " + record.fineAmount(5));
        System.out.println(record);
    }
}
