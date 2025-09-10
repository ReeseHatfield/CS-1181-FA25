public class Book implements Comparable<Book> {
    

    private double deweyDecimal;
    public String title;
    public int daysLeftOnLoan;
    
    public Book(double deweyDecimal, String title){
        this.deweyDecimal = deweyDecimal;
        this.title = title;
        this.daysLeftOnLoan = 14;
    }

    // book b1 = new Book()
    // book b2 = new Book(b1)
    public Book(Book other){
        this.deweyDecimal = other.deweyDecimal;
        this.title = other.title;
        this.daysLeftOnLoan = other.daysLeftOnLoan;
    }

    public void setDDNumber(double newNumber){
        this.deweyDecimal = newNumber;
    }

    // public abstract void checkout(int age);//{



    public int compareTo(Book other) {
        if(this.deweyDecimal > other.deweyDecimal){
            return -1;
        }
        else if (this.deweyDecimal < other.deweyDecimal){
            return +1;
        }
        else {
            return 0;
        }
    }


    public String toString(){
        return this.title + ": " + this.deweyDecimal;
    }

}