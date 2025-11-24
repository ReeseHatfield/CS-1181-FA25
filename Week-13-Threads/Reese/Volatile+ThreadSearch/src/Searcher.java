import java.util.ArrayList;
import java.util.List;
import java.util.stream.Gatherer.Integrator;

public class Searcher extends Thread {
    
    private List<Integer> searchMe;
    private int target;

    private static volatile boolean isFound = false;

    public Searcher(List<Integer> searchMe, int target){
        this.searchMe = searchMe;
        this.target = target;
    }


    @Override
    public void run(){

        for(int i = 0; i < this.searchMe.size() && !Searcher.isFound; i ++) {
            if(this.searchMe.get(i) == this.target){
                System.out.println("Found on thread " + this.getName());

                Searcher.isFound = true;
            }
        }
    }
}
