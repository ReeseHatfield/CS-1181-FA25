import java.util.*;

public class LinkedListDriver
{
    public static void main(String[] args)
    {
        LinkedList<String> labTAs = new LinkedList<>();
        System.out.println(labTAs);
        labTAs.add("Greg");
        labTAs.add("Subiksha");
        labTAs.add("Blake");
        labTAs.add("Matthew");
        System.out.println(labTAs);
        System.out.println(labTAs.get(3));
        labTAs.replace(3, "Shepard");
        System.out.println(labTAs);

        Stack<String> discardPile = new Stack<>();

        discardPile.push("Ace of Diamonds");
        discardPile.push("10 of Spades");
        discardPile.push("9 of Hearts");
        System.out.println(discardPile);
        System.out.println(discardPile.pop());
        System.out.println(discardPile);
        System.out.println(discardPile.peek());
        System.out.println(discardPile);

        Queue<String> customerOrder = new ArrayDeque<>();
        customerOrder.offer("Bob");
        customerOrder.offer("Karen");
        customerOrder.offer("Tom");
        customerOrder.offer("Kayleigh");
        System.out.println(customerOrder);
        System.out.println(customerOrder.poll());
        System.out.println(customerOrder);
        System.out.println(customerOrder.peek());
        System.out.println(customerOrder);
        System.out.println();
        System.out.println();

        Queue<Stack<String>> dirtyDishes = new ArrayDeque<>();

        Stack<String> tableOneDishes = new Stack<>();
        tableOneDishes.push("plate");
        tableOneDishes.push("bowl");
        tableOneDishes.push("cup");
        dirtyDishes.offer(tableOneDishes);

        Stack<String> tableTwoDishes = new Stack<>();
        tableTwoDishes.push("plate");
        tableTwoDishes.push("plate");
        tableTwoDishes.push("plate");
        tableTwoDishes.push("spoon");
        dirtyDishes.offer(tableTwoDishes);

        Stack<String> tableThreeDishes = new Stack<>();
        tableThreeDishes.push("bowl");
        tableThreeDishes.push("silverware");
        tableThreeDishes.push("wine glass");
        dirtyDishes.offer(tableThreeDishes);

        System.out.println(dirtyDishes.peek().pop());
        System.out.println(dirtyDishes);
        dirtyDishes.poll();
        System.out.println(dirtyDishes.peek().peek());
        System.out.println(dirtyDishes);

        System.out.println();
        System.out.println();

        PriorityQueue<Customer> customerPriority = new PriorityQueue<>();
        Customer c1 = new Customer(false, "Bob");
        Customer c2 = new Customer(false, "Annie");
        Customer c3 = new Customer(true, "Zane");
        Customer c4 = new Customer(true, "Charlie");
        customerPriority.add(c1);
        customerPriority.add(c2);
        customerPriority.add(c3);
        customerPriority.add(c4);
        System.out.println(customerPriority.poll());
        System.out.println(customerPriority);
        System.out.println(customerPriority.poll());
        System.out.println(customerPriority);

        System.out.println();
        System.out.println();

        Map<String, Double> studentCreditHours = new TreeMap<>();

        studentCreditHours.put("Clarissa", 16.0);
        studentCreditHours.put("Subiksha", 15.0);
        studentCreditHours.put("Blake", 13.0);
        System.out.println(studentCreditHours);
        System.out.println(studentCreditHours.keySet());
        System.out.println(studentCreditHours.values());
        studentCreditHours.put("Greg", 13.0);
        System.out.println(studentCreditHours.values());
        studentCreditHours.put("Clarissa", 17.0);
        System.out.println(studentCreditHours);
        System.out.println(studentCreditHours.get("Greg"));

        System.out.println();
        System.out.println();

        Set<Boolean> isPresent = new TreeSet<>();
        isPresent.add(true);
        isPresent.add(false);
        isPresent.add(true);
        System.out.println(isPresent);
    }
}
