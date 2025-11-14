import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sorting {

    public static void main(String[] args){



    }





    public static List<Integer> mergeSort(List<Integer> list) {
        
    }


    public static List<Integer> bubbleSort(List<Integer> list) {


    }







    public static void fillWithRandom(List<Integer> list){

        Random rng = new Random();

        for(int i = 0; i < 100000; i++) {
            list.add(rng.nextInt(0, 100));
        }
    }

    // O(n) merge two sorted lists
    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i = 0; 
        int j = 0; 

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }


}