import java.util.ArrayList;
import java.util.Random;

public class ThreadDriver
{
    public static void main(String[] args) throws InterruptedException
    {
        Random rng = new Random(1);
        ArrayList<Integer> numsToSum = new ArrayList<>();
        ArrayList<WorkerThread> sumThreads = new ArrayList<>();
        ArrayList<ListCreationThread> createThreads = new ArrayList<>();
        int numRandomNums = 99999999;
        int numCreatingThreads = 4;
        int numSummingThreads = 1;

        long startTime = System.currentTimeMillis();

        int block = numRandomNums / numCreatingThreads;
        int remainder = numRandomNums % numCreatingThreads;
        for (int i = 0; i < numCreatingThreads; i++)
        {
            ListCreationThread lct = new ListCreationThread(block, 1);
            if (i == (numCreatingThreads - 1))
            {
                lct = new ListCreationThread(block + remainder, 1);
            }
            lct.start();
            createThreads.add(lct);
            System.out.println("Creation thread #" + i + " created!");
        }

        for (ListCreationThread lct : createThreads)
        {
            lct.join();
        }

        for (ListCreationThread lct : createThreads)
        {
            numsToSum.addAll(lct.getGeneratedNums());
        }

        long endTime = System.currentTimeMillis();
        System.out.println("List creation took " + (endTime - startTime) + "ms");
        System.out.println("List created!");

        startTime = System.currentTimeMillis();
        int startIndex = 0;
        int chunk = numsToSum.size() / numSummingThreads;
        int endIndex = chunk;
        for (int i = 0; i < numSummingThreads; i++)
        {
            WorkerThread temp = new WorkerThread(startIndex, endIndex, numsToSum);
            temp.start();
            sumThreads.add(temp);

            startIndex = endIndex;
            endIndex = endIndex + chunk;
            if (i == numSummingThreads - 2)
            {
                endIndex = numsToSum.size();
            }
            System.out.println("Thread #" + i + " created!");
        }

        for (WorkerThread t : sumThreads)
        {
            t.join();
        }

        int totalSum = 0;
        for (WorkerThread t : sumThreads)
        {
            totalSum += t.getSum();
        }
        System.out.println(totalSum);

        endTime = System.currentTimeMillis();
        System.out.println("Summing took " + (endTime - startTime) + "ms");
    }
}
