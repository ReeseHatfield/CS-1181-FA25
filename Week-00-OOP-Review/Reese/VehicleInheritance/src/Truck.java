public class Truck extends Vehicle {
    


    public Truck(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("VROOOOM!!");
    }



    public void tow(Car other){
        System.out.println("I am towing the other car");
    }

}
