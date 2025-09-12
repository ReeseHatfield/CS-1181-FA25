public class LegalDocument extends Book implements Renewable{

    public LegalDocument(double deweyDecimal, String title) {
        super(deweyDecimal, title);
    }

    // @Override
    public void checkout(int age) {
        System.out.println("Free to checkout");
    }

    @Override
    public void renew() {
        super.daysLeftOnLoan = 14;

    }
    
}
