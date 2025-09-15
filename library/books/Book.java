package library.books;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Represents a book and its inventory state.
 */
public class Book {
    private final int isbn;
    private String title;
    private String author;
    private int year;
    private boolean isReferenceOnly;
    private int totalCopies;
    private int availableCopies;

    // --- Constructor ---
    public Book(int isbn, String title, String author, int year, boolean isReferenceOnly, int totalCopies) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.isReferenceOnly = isReferenceOnly;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    // --- Getters & Setters ---
    public int getIsbn() { return isbn; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public boolean isReferenceOnly() { return isReferenceOnly; }
    public void setReferenceOnly(boolean referenceOnly) { isReferenceOnly = referenceOnly; }

    public int getTotalCopies() { return totalCopies; }
    public int getAvailableCopies() { return availableCopies; }

    // --- Inventory operations ---
    public void addCopies(int n) {
        if (n <= 0) throw new IllegalArgumentException("Copies must be positive");
        totalCopies += n;
        availableCopies += n;
    }

    public void removeCopies(int n) {
        if (n <= 0) throw new IllegalArgumentException("Copies must be positive");
        int issued = totalCopies - availableCopies;
        if (totalCopies - n < issued) {
            throw new IllegalArgumentException("Cannot remove copies: some are already issued");
        }
        totalCopies -= n;
        availableCopies = Math.max(0, availableCopies - n);
    }

    public boolean issueOneCopy() {
        if (!isAvailable()) return false;
        availableCopies--;
        return true;
    }

    public void returnOneCopy() {
        if (availableCopies < totalCopies) availableCopies++;
    }

    public boolean isAvailable() {
        return !isReferenceOnly && availableCopies > 0;
    }

    public String summary() {
        return String.format("%s (ISBN: %d) by %s [%d] - Available: %d/%d%s",
                title, isbn, author, year,
                availableCopies, totalCopies,
                isReferenceOnly ? " [REFERENCE]" : "");
    }

    @Override
    public String toString() {
        return summary();
    }

    // --- Inner Class: IssueRecord ---
    public class IssueRecord {
        private final int memberId;
        private final LocalDate issueDate;
        private final LocalDate dueDate;
        private LocalDate returnDate; // null if not yet returned

        public IssueRecord(int memberId, LocalDate issueDate, LocalDate dueDate) {
            this.memberId = memberId;
            this.issueDate = issueDate;
            this.dueDate = dueDate;
            this.returnDate = null;
        }

        public int getMemberId() { return memberId; }
        public LocalDate getIssueDate() { return issueDate; }
        public LocalDate getDueDate() { return dueDate; }
        public LocalDate getReturnDate() { return returnDate; }

        public void markReturned(LocalDate returnDate) {
            this.returnDate = returnDate;
        }

        public int overdueDays() {
            LocalDate compareDate = (returnDate == null) ? LocalDate.now() : returnDate;
            long days = ChronoUnit.DAYS.between(dueDate, compareDate);
            return (int) Math.max(0, days);
        }

        public double fineAmount(double perDayRate) {
            return overdueDays() * perDayRate;
        }

        @Override
        public String toString() {
            return String.format("IssueRecord{memberId=%d, issue=%s, due=%s, return=%s, overdue=%d days}",
                    memberId, issueDate, dueDate,
                    (returnDate == null ? "NOT RETURNED" : returnDate.toString()),
                    overdueDays());
        }
    }
}
