import java.util.ArrayList;
import java.util.List;

public class WorkerThread extends Thread
{
    private List<Integer> nums = new ArrayList<>();
    private int sum = 0;

    public WorkerThread(int start, int end, ArrayList<Integer> list)
    {
        nums = list.subList(start, end);
    }

    @Override
    public void run()
    {
        for (int i : nums)
        {
            sum += i;
        }
    }

    public int getSum()
    {
        return sum;
    }
}
