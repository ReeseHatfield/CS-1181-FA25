public class ThreadWorker extends Thread
{
    private ThreadManager boss;
    private int threadID = 0;

    public ThreadWorker(ThreadManager tm, int id)
    {
        boss = tm;
        threadID = id;
    }

    @Override
    public void run()
    {
        int job = boss.getNextJob();

        while (job < boss.getNumJobs())
        {
            boss.doWork(job, threadID);
            job = boss.getNextJob();
        }
    }
}
