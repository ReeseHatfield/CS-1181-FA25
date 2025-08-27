import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle();

        // v.drive();


        // c.drive();
        
        Drivable c = new Car("Hyundai");

        System.out.println(c.toString());


        // c.driveDistance(19);


        // Truck t = new Truck("Chevy");
        // Vehicle s = new Semi("18 wheeler");


        // t.tow(c);
        

        // Vehicle v = new Vehicle("asdfasdf");


        // doThing(t);
        // doThing(c);
    }


    public static void doThing(Drivable v){
        // DYNAMICALLY figuring out which drive method to call
        v.driveDistance(10);

    }


}
