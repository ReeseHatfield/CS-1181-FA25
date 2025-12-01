public class ThreadManagerDriver
{
    public static final int NUM_THREADS = 4;
    public static void main(String[] args) throws InterruptedException
    {
        ThreadManager tm = new ThreadManager();
        ThreadWorker[] workers = new ThreadWorker[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++)
        {
            workers[i] = new ThreadWorker(tm, i);
            workers[i].start();
        }

        for (int i = 0; i < NUM_THREADS; i++)
        {
            workers[i].join();
        }
    }
}
