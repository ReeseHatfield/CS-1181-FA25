public class Driver {


    public static void main(String[] args) {
        // Automobile a = new SUV("Mini Cooper");
        // // ...

        // Automobile b = new Truck("Ford");


        // foo(b);


        /*
         * 
         * Automobile a = new SUV();
         * (SUV) a.bar(); -> typ
         * 
         */


        Automobile a = new SUV("Ford");

        // cast Automobile -> SUV. Downcasting
        SUV temp = (SUV) a;
        temp.bar();
    }


    public static void foo(Automobile a){
        a.drive(15); // dynamic dispatch
    }
}