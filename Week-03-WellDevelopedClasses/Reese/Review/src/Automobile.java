public abstract class Automobile extends Object{

    private String name;

    private Item i;

    public final String classID = "1234";


    public Automobile(Automobile other) {
        this.name = other.name;
        this.i = new Item(other.i);
    }
    
    public Automobile(String name){

        this.name = name;

        this.i = new Item("Thing", 1);
    };

    public abstract void drive(int metersToDrive);
}