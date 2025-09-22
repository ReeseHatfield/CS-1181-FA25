import java.util.ArrayList;
import java.util.Random;

public class BingoMachine<E>
{
    ArrayList<E> randomValues = new ArrayList<>();
    Random rng = new Random();

    public BingoMachine()
    {

    }

    public void addAll(ArrayList<? extends E> valuesToAdd)
    {
        randomValues.addAll(valuesToAdd);
    }

    public void addBingoMachineTo(ArrayList<? super E> listToAddTo)
    {
        listToAddTo.addAll(randomValues);
    }

    public void addItem(E item)
    {
        randomValues.add(item);
    }

    public E pickItem()
    {
        int ran = rng.nextInt(randomValues.size());
        return randomValues.remove(ran);
    }

    public int getNumItems()
    {
        return randomValues.size();
    }
}
