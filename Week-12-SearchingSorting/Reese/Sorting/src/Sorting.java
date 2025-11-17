import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sorting {

    public static void main(String[] args){

        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
        //     6, 5, 10, 9, 1 , 12, 7
        // ));

        ArrayList<Integer> list = new ArrayList<>();
        fillWithRandom(list);

        System.out.println("unsort: " + list);

        // list = (ArrayList<Integer>) bubbleSort(list);
        list = (ArrayList<Integer>) mergeSort(list);
        System.out.println("sorted: " + list);


    }





    public static List<Integer> mergeSort(List<Integer> list) {
        
        if(list.size() <= 1){
            return list;
        }

        int mid = list.size() / 2;
        List<Integer> left = new ArrayList<>(list.subList(0, mid));
        List<Integer> right = new ArrayList<>(list.subList(mid, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);


        return merge(left, right);

    }


    public static List<Integer> bubbleSort(List<Integer> list) {
        List<Integer> copy = new ArrayList<>(list);

        for(int i = 0; i < copy.size(); i++) {


            // inner loop, moves the greatest value to the top
            for(int j = 0; j < copy.size() - 1; j++){

                if(copy.get(j)  > copy.get(j + 1)){
                    Collections.swap(copy, j, j + 1);
                }
            }
        }


        return copy;

    }







    public static void fillWithRandom(List<Integer> list){

        Random rng = new Random();

        for(int i = 0; i < 100_000; i++) {
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