import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Driver {
    public static void main(String[] args) {


        // Set<String> s = new HashSet<>();
        // s.add("Reese");
        // s.add("Josh");
        // s.add("Clarissa");

        // s.add("Reese");



        // System.out.println(s);




        List<String> l1 = new ArrayList<>(Arrays.asList(
            "Reese",
            "Clarissa",
            "Josh"
        ));

        List<Integer> l2 = new ArrayList<>(Arrays.asList(1,2,3));



        printList(l1);
        printList(l2);


        // sortList(l1);

    }
    public static void printList(List<?> list){
        System.out.println(list);
    }

    public static void sortList(List<? extends Number> list){

        // I want to consume data -> extends

        // list.add(4);


        // pretend I am doing sorting here

    }


    public static void addSomeElementsToList(List<? super Number> list){

        // I want to supply /produce data -> super
        list.add(new Integer(1));

    }
}