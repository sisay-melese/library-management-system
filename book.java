public class Book {
    private String bookId;
    private String title;
    private boolean available;

    public Book(String bookId, String title) {
        if (bookId == null || title == null) {
            throw new IllegalArgumentException("Book ID and title cannot be null");
        }
        this.bookId = bookId;
        this.title = title;
        this.available = true;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
