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

    // Borrow a book
    public void borrowBook() {
        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is already borrowed");
        }
        book.setAvailable(false);
        System.out.println("Book borrowed successfully.");
    }

    // Return a book
    public void returnBook() {
        if (returned) {
            throw new IllegalStateException("Book has already been returned");
        }
        book.setAvailable(true);
        returned = true;
        System.out.println("Book returned successfully.");
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public boolean isReturned() {
        return returned;
    }
}

}