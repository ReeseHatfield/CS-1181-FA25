import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle();

        // v.drive();


        // c.drive();
        
        
        Vehicle c = new Car("Hyundai");
        Vehicle t = new Truck("Chevy");
        Vehicle s = new Semi("18 wheeler");

        Vehicle v = new Vehicle();


        doThing(t);
        // doThing(c);
    }


    public static void doThing(Vehicle v){
        v.drive();
    }


}
