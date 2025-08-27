public class Car extends Vehicle implements Drivable, FourWheeledThing {
    public Car(String name) {
        super(name);
    }


    @Override
    public void drive() {
        System.out.println("....vroom...");
    }


    @Override
    public void driveDistance(int meters) {
        for(int i = 0; i < meters; i++){
            drive();
        }

    }


    @Override
    public void doThingWithFourWheels() {
        // empty
    }

}
