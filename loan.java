public class Loan {
    private Book book;
    private Member member;
    private boolean returned;

    public Loan(Book book, Member member) {
        if (book == null || member == null) {
            throw new IllegalArgumentException("Book and Member cannot be null");
        }
        this.book = book;
        this.member = member;
        this.returned = false;
    }

    public void borrowBook() {
        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is already borrowed");
        }
        book.setAvailable(false);
    }

    public void returnBook() {
        if (returned) {
            throw new IllegalStateException("Book already returned");
        }
        book.setAvailable(true);
        returned = true;
    }
}
