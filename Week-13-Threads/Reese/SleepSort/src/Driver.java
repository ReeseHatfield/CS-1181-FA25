import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {

        ArrayList<Integer> unsorted = new ArrayList<>(
            Arrays.asList(568, 4, 1, 8, 567, 6, 9)
        );



        ArrayList<Sleeper> sleepers = new ArrayList<>();
        for(Integer i: unsorted){
            Sleeper s = new Sleeper(i);
            sleepers.add(s);
            s.start();
        }

        for(Sleeper s: sleepers){
            try {
                s.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }




        System.out.println(Sleeper.sortedList);
    }
}