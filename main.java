public class public class Main {
    public static void main(String[] args) {
        Book book = new Book("B001", "Java Programming");
        Member member = new Member("M001", "Sisay");

        Loan loan = new Loan(book, member);

        loan.borrowBook();
        loan.returnBook();
        loan.checkDueDate();
    }
}
