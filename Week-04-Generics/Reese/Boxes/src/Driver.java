import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        // Integer i = new Integer(4);

        // ArrayList<String> list = new ArrayList<>();

        // CustomArrayList<String> customList = new CustomArrayList<>();

        Box<Integer> b1 = new Box<>(5);
        Box<String> b2 = new Box<>("Hello");

        Box<Double> b3 = new Box<>(4.5);

        System.out.println(b3.getThing());



        Pair<String, Integer> p1 = new Pair<>();
        p1.setThing1("hello");
        p1.setThing2(5);


        // add(i);
        // add(list);
    }


    // public static void add(Object o) {
    //     // do some logic

    //     if (o instanceof Integer) {
    //         // do something
    //     }
    //     else if(o instanceof ArrayList){
    //         // do somethign e
    //     }
    // }
}