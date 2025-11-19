import java.util.ArrayList;

public class IntroToThreads {
    public static void main(String[] args) throws InterruptedException {
        
        int numThreads = 9999;

        // create threads
        ArrayList<CustomThread> threads = new ArrayList<>();
        for(int i = 1; i <= numThreads; i ++){
            threads.add(new CustomThread(i));
        }

        // start threads 
        for(CustomThread ct: threads) {
            ct.start();
        }
        
        // join threads
        for(CustomThread ct: threads) {
            ct.join();
        }

        // putting it all together
        int value = 0;
        for(CustomThread ct: threads) {
            value += ct.sumMe;
        }



        System.out.println("Finished main: " + value);
    }
}