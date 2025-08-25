public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("....vroom...");
    }

}
