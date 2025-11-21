public class Driver {
    

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();


        Runnable task = () -> {
            for(int i = 0; i < 100_000; i++){
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);

        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        
        System.out.println(counter.getValue());

        for(char c = 'a'; c < 'z'; c++){
            System.out.println(c);
        }

    }
}
