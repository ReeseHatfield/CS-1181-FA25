import java.util.ArrayList;
import java.util.Collections;

public class Driver {
    public static void main(String[] args) {
        // Book b1 = new FictionBook(56.7, "Great Expectations");

        // bar((FictionBook) b1);
        // // Book b2 = new NonFictionBook(123.3, "Learning Java the book");

        // // FictionBook b4 = new Book(45.0 "sdfasdf");
        // // b2.checkout(13);

        
        // Book b3 = new LegalDocument(12.5, "Declation of Independence");

        // Comparable temp = (Comparable) b3;

        // foo(temp);


        Book b1 = new FictionBook(4.0, "Farenheight 451");
        Book b2 = new FictionBook(1.0, "Great Expectation");
        Book b3 = new FictionBook(2.0, "Twilight");
        Book b4 = new FictionBook(5.0, "The Hobit");

        ArrayList<Book> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);

        Collections.sort(list, (book1, book2) -> {
            return book1.title.compareTo(book2.title);
        });

        
        System.out.println(list);



        // class RenewableBook implements Renewable {

        //     @Override
        //     public void renew() {

        //         System.out.println("I am renewing the book");
        //     }
            
            
        // }

        // doThingWithInterface(new RenewableBook());

        // doThingWithInterface(new Renewable(){

        //     @Override
        //     public void renew() {
        //         System.out.println("I am renewing the book again...");
        //     }
            
        // });


        // // () - > { }
        // doThingWithInterface(() -> {
        //     System.out.println("I am doing this from a lambda");
        // });


    
    }

    // public static void bar(FictionBook b) {
    //     System.out.println(b.daysLeftOnLoan);
    // }

    public static void doThingWithInterface(Renewable r){
        r.renew();
        System.out.println("book was renewed");
    }

}