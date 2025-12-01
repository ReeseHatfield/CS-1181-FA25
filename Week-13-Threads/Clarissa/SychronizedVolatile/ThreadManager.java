public class ThreadManager
{
    private int[] jobs = {3, 5, 7, 11, 19, 14, 3, 9, 2};
    private int nextJob = 0;

    public int getNextJob()
    {
        int currentJob = nextJob;

        nextJob++;

        return currentJob;
    }

    public void doWork(int job, int threadID)
    {
        System.out.println("Thread #" + threadID + " has started job #" + job);
        int doJob = 500 * jobs[job];
        try
        {
            Thread.sleep(doJob);
        }
        catch (InterruptedException ie)
        {
            System.out.println("Oops!");
        }
    }

    public int getNumJobs()
    {
        return jobs.length;
    }
}
