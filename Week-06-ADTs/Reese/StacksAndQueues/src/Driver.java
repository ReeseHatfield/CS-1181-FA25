import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Driver {
    public static void main(String[] args){
        // Stack<String> s = new Stack<>();



        // Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new ArrayDeque<>(); // X

        q2.offer("Hello");
        q2.offer("My ");
        q2.offer("Name ");
        q2.offer("Is");
        q2.offer("Reese");

        while(!q2.isEmpty()){
            String s = q2.poll();

            System.out.println(s);
        }


        Map<String, String> map = new HashMap<>();
        map.put("Josh", "Pink");
        map.put("Reese", "Blue");
        map.put("Clarissa", "Purple");


        System.out.println(map.get("Josh"));


        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(3);
        pq.offer(5);
        pq.offer(7);
        pq.offer(9);
        
        pq.offer(4);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }


        PriorityQueue<Event> events = new PriorityQueue<>();
        events.offer(new Event(10));
        events.offer(new Event(30));
        events.offer(new Event(20));


        while(!events.isEmpty()){
            Event cur = events.poll();
            
            System.out.println(cur.time);
        }
    }
}