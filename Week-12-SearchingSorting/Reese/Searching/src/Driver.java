import java.util.List;

public class Driver {


    public static void main(String[] args) {
        
    }

    
    
    public static int indexOfValue(List<String> searchMe, String target, int curIndex){

        System.out.println(searchMe);

        if(searchMe.isEmpty()){
            return -1;
        }

        if(target.equals(searchMe.get(0)){
            return curIndex;
        }

        return indexOfValue(searchMe.subList(1, searchMe.size()), target,  curIndex  + 1);

    }

    public static int indexOfValue(List<String> searchMe, String target){




        
        if(searchMe.isEmpty()){
            return -1;
        }

        if(searchMe.getLast().equals(target)){
            return searchMe.size() - 1;
        }

        searchMe.removeLast();
        
        return indexOfValue(searchMe, target);

    }
}