import java.util.ArrayList;
import java.util.Random;

public class ThreadDriver
{
    public static void main(String[] args) throws InterruptedException
    {
        Random rng = new Random(1);
        ArrayList<Integer> numsToSum = new ArrayList<>();
        ArrayList<WorkerThread> threads = new ArrayList<>();
        int numThreads = 4;

        for (int i = 0; i < 999999999; i++)
        {
            numsToSum.add(rng.nextInt(-50, 50));
        }
        System.out.println("List created!");

        long startTime = System.currentTimeMillis();
        int startIndex = 0;
        int chunk = numsToSum.size() / numThreads;
        int endIndex = chunk;
        for (int i = 0; i < numThreads; i++)
        {
            WorkerThread temp = new WorkerThread(startIndex, endIndex, numsToSum);
            temp.start();
            temp.join();
            threads.add(temp);

            startIndex = endIndex;
            endIndex = endIndex + chunk;
            if (i == numThreads - 2)
            {
                endIndex = numsToSum.size();
            }
            System.out.println("Thread #" + i + " created!");
        }

        int totalSum = 0;
        for (WorkerThread t : threads)
        {
            totalSum += t.getSum();
        }
        System.out.println(totalSum);

        long endTime = System.currentTimeMillis();
        System.out.println("Summing took " + (endTime - startTime) + "ms");
    }
}
