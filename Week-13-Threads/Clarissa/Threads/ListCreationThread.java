import java.util.ArrayList;
import java.util.Random;

public class ListCreationThread extends Thread
{
    private int numsToGenerate = 0;
    private int seed = 0;

    private ArrayList<Integer> generatedNums = new ArrayList<>();

    public ListCreationThread(int size, int seed)
    {
        numsToGenerate = size;
        this.seed = seed;
    }

    @Override
    public void run()
    {
        Random rng = new Random(seed);

        for (int i = 0; i < numsToGenerate; i++)
        {
            generatedNums.add(rng.nextInt(-50, 50));
        }
    }

    public ArrayList<Integer> getGeneratedNums()
    {
        return generatedNums;
    }
}
