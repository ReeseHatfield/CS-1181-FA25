public class FictionBook extends Book {

    public FictionBook(double deweyDecimal, String title) {
        super(deweyDecimal, title);
    }


    @Override
    public void checkout(int age){
        if(age <= 12){
            System.out.println("This book was free to checkout");
        }
        else {
            System.out.println("This book cost you 10 dollars to checkout");
        }
    }

    
}
