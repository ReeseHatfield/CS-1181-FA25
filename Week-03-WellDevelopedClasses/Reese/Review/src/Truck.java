public class Truck extends Automobile {

    public Truck(String name) {
        super(name);
    }

    @Override
    public void drive(int metersToDrive) {
        System.out.println("Drives with 6 cylinders");
    }

}