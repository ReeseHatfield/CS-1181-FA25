public abstract class Book implements Comparable<Book> {
    

    private double deweyDecimal;
    public String title;
    public int daysLeftOnLoan;
    
    public Book(double deweyDecimal, String title){
        this.deweyDecimal = deweyDecimal;
        this.title = title;
        this.daysLeftOnLoan = 14;
    }

    public abstract void checkout(int age);//{



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
        return this.title;
    }

}