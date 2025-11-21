public class StaticCache {
    volatile static int i;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->{
            for(int  i = 0; i < 100_000; i ++){
                StaticCache.i += 1;
            }
        });

        t1.start();


        Thread t2 = new Thread(() ->{
            for(int i = 0; i < 100_000; i ++){
                StaticCache.i += 1;
            }
        });

        t2.start();


        t1.join();
        t2.join();


        System.out.println(i);

    }
}
