import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Driver {



    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 6, 8, 3, 10));

        Collections.sort(list); // complexity O(n * logn)
        
        System.out.println(contains(list, 7, 0, list.size() - 1));
    }


    public static boolean contains(List<Integer> searchMe, int target, int left, int right){

        if(left > right){
            return false;
        }

        int mid = (right + left) / 2;

        if(searchMe.get(mid) == target){
            return true;
        }

        if(searchMe.get(mid) < target) {
            return contains(searchMe, target, mid + 1, right);
        }
        else {
            return contains(searchMe, target, left, mid - 1);
        }



    }

    
        
    public static int indexOfValue(List<String> searchMe, String target, int curIndex){

        System.out.println(searchMe);

        if(searchMe.isEmpty()){
            return -1;
        }

        if(target.equals(searchMe.get(0))){
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