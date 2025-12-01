public class MoreThreadsDriver
{
    public static void main(String[] args)
    {
        Runnable r1 = () -> {
            for (int i = 0; i < 15; i++)
            {
                try
                {
                    Thread.sleep(2000);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        };

        Thread t1 = new Thread(r1, "Thread 1");
        t1.start();
        Thread t2 = new Thread(r1, "Thread 2");
        t2.start();
    }
}
