import java.util.ArrayList;

public class RecursiveMethods {
    

    public static int count11s(ArrayList<Integer> nums) {

        return count11sHelper(new ArrayList<>(nums));
    }

    private static int count11sHelper(ArrayList<Integer> nums) {

        // nbase case
        if(nums.size() == 0) {
            return 0;
        }

        // recursive step

        // we need to shrink list in some way

        Integer first = nums.get(0);



        int total11s = 0;
        if(first == 11){
            total11s = 1;
        }

        

        nums.remove(0);

        return total11s + count11sHelper(nums);
        // total11s + count11s( // rest of list)

    }
}
