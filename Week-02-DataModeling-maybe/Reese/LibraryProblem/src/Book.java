public abstract class Book {
    

    private double deweyDecimal;
    private String title;
    public int daysLeftOnLoan;
    
    public Book(double deweyDecimal, String title){
        this.deweyDecimal = deweyDecimal;
        this.title = title;
        this.daysLeftOnLoan = 14;
    }

    public abstract void checkout(int age);//{
    //     // print the cost
    //     // 0 -> if youre under =12
    //     // 10 -> if youre above 12
    // }
}