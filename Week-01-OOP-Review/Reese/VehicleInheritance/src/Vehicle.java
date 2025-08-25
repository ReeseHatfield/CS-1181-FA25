public abstract class Vehicle {
    // fields

    private String name;

    // // caused stuff to break last week
    public Vehicle(String name){
        this.name = name;
    }


    public void printName(){
        System.out.println(this.name);
    }

    public abstract void drive();
}
