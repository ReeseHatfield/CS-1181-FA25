import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LotteryMachine <E extends Comparable<E>>
{
    ArrayList<E> randomValues = new ArrayList<>();
    Random rng = new Random();

    public LotteryMachine()
    {

    }

//    public void addAll(ArrayList<E> valuesToAdd)
//    {
//        randomValues.addAll(valuesToAdd);
//    }

    public void addItem(E item)
    {
        randomValues.add(item);
    }

    public E pickItem()
    {
        int ran = rng.nextInt(randomValues.size());
        return randomValues.remove(ran);
    }

    public void orderMachine()
    {
        Collections.sort(randomValues);
        System.out.println(randomValues);
    }
}
