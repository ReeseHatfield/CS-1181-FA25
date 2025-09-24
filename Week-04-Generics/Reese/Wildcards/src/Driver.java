import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Driver {
    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
        // List<? extends Number> l1 = new ArrayList<>();



        List<? super Integer> l2 = new ArrayList<Number>();

        // l1.add(null)

        l2.add(12);



        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(5, 3, 2));

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("hello", "world"));

        // foo(strings);
        foo(ints);



        // list.add("hello");

    }

    public static void foo(List<? extends Number> list) {
        // do things
    }








        // // most
}


