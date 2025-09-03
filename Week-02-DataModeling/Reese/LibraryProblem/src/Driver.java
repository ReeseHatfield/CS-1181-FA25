public class Driver {
    public static void main(String[] args) {
        Book b1 = new FictionBook(56.7, "Great Expectations");
        Book b2 = new NonFictionBook(123.3, "Learning Java the book");


        b2.checkout(13);
    }
}