import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class TimeDemo {

    public static void main(String[] args) {


        Stack<String> s = new Stack<>();
        s.push("Hello");
        s.push("My");
        s.push("Name");
        s.push("Is");
        s.push("Reese");

        // System.out.println(s.pop());
        // System.out.println(s.pop());

        while(!s.isEmpty()){
            String current = s.pop();

            System.out.println(current);
        }

        



        // int numInsertions = 500_000;
        
        
        // double timeTakenLinkedList = timeInsertAtBegining(new LinkedList<String>(), numInsertions);
        // System.out.println("LinkedList took " + timeTakenLinkedList + " for " + numInsertions + " insertions");
        
        // double timeTakenArrayList = timeInsertAtBegining(new ArrayList<String>(), numInsertions);
        // System.out.println("ArrayList took " + timeTakenArrayList + " for " + numInsertions + " insertions");

        
    }


    public static double timeInsertAtBegining(List<String> l, int numInsertions){

        long startTime = System.currentTimeMillis();
        Random rng = new Random();


        for(int i = 0; i < numInsertions; i++){
            // int index = rng.nextInt(0, Math.max(l.size(), 1));

            int index = 0;
            l.add(index, "inserted at index " + index); // prevent string pool caching I think?
        }

        long endTime = System.currentTimeMillis();


        return (startTime - endTime) / 1000.0;

    }
}