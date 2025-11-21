import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) throws InterruptedException {

    //     ArrayList<Integer> unsorted = new ArrayList<>(
    //         Arrays.asList(568, 4, 1, 8, 567, 6, 9)
    //     );



    //     ArrayList<Sleeper> sleepers = new ArrayList<>();
    //     for(Integer i: unsorted){
    //         Sleeper s = new Sleeper(i);
    //         sleepers.add(s);
    //         s.start();
    //     }

    //     for(Sleeper s: sleepers){
    //         try {
    //             s.join();
    //         } catch (InterruptedException e) {
    //             e.printStackTrace();
    //         }
    //     }




    //     System.out.println(Sleeper.sortedList);
    // }


        CustomThread t1 = new CustomThread(1000, "one");
        t1.start();


        CustomThread t2 = new CustomThread(2000, "two");
        t2.start();

        CustomThread t3 = new CustomThread(5000," three");
        t3.start();

        
        
        t1.join();
        t2.join();
        t3.join();
        


        System.out.println("total: " + CustomThread.result);
    }
}