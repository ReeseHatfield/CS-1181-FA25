import java.sql.Array;
import java.util.*;

public class GenericLotteryExample
{
    public static void main(String[] args)
    {
        Random rng = new Random();

        // upper bounded method parameter example
        BingoMachine<Number> bm = new BingoMachine<>();
        bm.addAll(new ArrayList<Double>());
        bm.addAll(new ArrayList<Integer>());
        bm.addAll(new ArrayList<Number>());

        // lower bounded method parameter
        ArrayList<Object> things = new ArrayList<>();
        bm.addBingoMachineTo(things);

        for (int i = 0; i < 50; i++)
        {
            int value = rng.nextInt(1000);
            bm.addItem(value);
        }
        System.out.println("The winner is: " + bm.pickItem() + "!!!");

        LotteryMachine<String> lm2 = new LotteryMachine<>();
        for (int i = 0; i < 50; i++)
        {
            String blah = "";
            for (int j = 0; j < 5; j++)
            {
                char letter = (char) (rng.nextInt(25) + 97);
                blah = blah + letter;
            }
            lm2.addItem(blah);
        }
        System.out.println("The winner is: " + lm2.pickItem().toUpperCase() + "!!!");
        lm2.orderMachine();

        BingoMachine<Blah> bm2 = new BingoMachine<>();
        BingoMachine<String> bm3 = new BingoMachine<>();
        bm3.addItem("fhj");
        bm3.addItem("ajhbds");
        bm3.addItem("gmkw");

        GenericLotteryExample.<String>orderMachine(bm3);

    }

    public static <T extends Comparable<T>> void orderMachine(BingoMachine<T> bm)
    {
        ArrayList<T> items = new ArrayList<>();

        for (int i = 0; i < bm.getNumItems(); i++)
        {
            items.add(bm.pickItem());
        }
        Collections.sort(items);
        System.out.println(items);
    }
}
