import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

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
    }
}
