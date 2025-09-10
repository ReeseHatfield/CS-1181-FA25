public class NonFictionBook extends Book implements Renewable{

    public NonFictionBook(double deweyDecimal, String title) {
        super(deweyDecimal, title);
    }


    // @Override
    public void checkout(int age){
        System.out.println("Regardless of age, book cost 10 dollars to checkout");
    }


    @Override
    public void renew() {
        super.daysLeftOnLoan = 7;
    }
    
}
