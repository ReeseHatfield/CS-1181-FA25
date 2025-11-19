import java.util.ArrayList;

public class Sleeper extends Thread {

    private int value;

    public static ArrayList<Integer> sortedList = new ArrayList<>();

    public Sleeper(int value){
        this.value = value;
    }


    @Override
    public void run(){

        try {
            Thread.sleep(value * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Sleeper.sortedList.add(this.value);


    }
}
