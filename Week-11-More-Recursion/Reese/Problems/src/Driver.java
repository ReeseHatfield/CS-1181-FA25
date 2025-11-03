import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        

        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 11, 4, 11, 11, 1, 11));


        // System.out.println(RecursiveMethods.count11s(list));

        // System.out.println(list);


        LinkedList list = new LinkedList();

        System.out.println("list before");
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        list.print();
        System.out.println();


        System.out.println("List after:");

        list.addAtIndex("Hello", 6);
        list.print();


    }


}