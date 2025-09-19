import java.util.ArrayList;
import java.util.Collections;

public class Driver {
    public static void main(String[] args) {

        // Integer i = new Integer(4);

        // ArrayList<String> list = new ArrayList<>();

        // CustomArrayList<String> customList = new CustomArrayList<>();

        Box<Double> b1 = new Box<>(5.6);
        Box<Double> b2 = new Box<>(54.3);
        Box<Double> b3 = new Box<>(0.0);
        Box<Double> b4 = new Box<>(7.8);

        ArrayList<Box<Double>> list = new ArrayList<>();
        
        
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        
        Collections.sort(list);
        System.out.println(list);



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