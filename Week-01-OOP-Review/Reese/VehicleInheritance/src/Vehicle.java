public class Vehicle {
    // fields

    private String name;


    public Vehicle(String name){
        this.name = name;
    }


    public void printName(){
        System.out.println(this.name);
    }

    public void drive() {
        System.out.println("vroom!!");
    }
}
