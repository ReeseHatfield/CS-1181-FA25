import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Driver {
    public static void main(String[] args) {
        // List<String> l1 = new ArrayList<>();

        // List<String> l2 = new LinkedList<>();
        

        CustomLinkedList<String> customList = new CustomLinkedList<>();

        customList.add("Hello");
        customList.add("World");
        customList.add("Thing1");
        customList.add("Thing2");
        customList.add("Thing3");
        customList.add("Thing4");
        customList.add("Thing5");
        customList.add("Thing6");

        System.out.println(customList.get(4));



        

        // Node<String> n1 = new Node<String>("CEG 2350");
        // Node<String> n2 = new Node<String>("CS 1150");
        // Node<String> n3 = new Node<String>("CS 1181");
        
        // n1.setNext(n2);
        // n2.setNext(n3);
        // n3.setNext(null);


        // System.out.println(n1.getNext().getNext());

    }
}