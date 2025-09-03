import java.util.ArrayList;

public class LogList {


    private ArrayList<String> innerList = new ArrayList<>();
    

    /**
     *  Adds a log to the list
     * @param log the log to add
     */
    public void addLog(String log){
        innerList.add(log);
    }

    /**
     * Prints every other log
     */
    public void printEveryOther(){
        for(int i = 0; i < innerList.size(); i += 2){
            System.out.println(innerList.get(i));
        }
    }
}
