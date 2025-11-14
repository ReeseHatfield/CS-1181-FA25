import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sorting {

    public static void main(String[] args){


        // ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
        //     6, 5, 1, 4, 8, 9, 2
        // ));

        // System.out.println("Original ArrayList: " + numbers);

        // bubbleSort(numbers);

        // System.out.println("Sorted ArrayList: " + numbers);

        // Collections.shuffle(numbers);
        // System.out.println(numbers);

        // numbers = (ArrayList<Integer>) mergeSort(numbers);
        // System.out.println(numbers);


        ArrayList<Integer> list = new ArrayList<>();
        fillWithRandom(list);
        System.out.println(list);

        System.out.println(mergeSort(list));


    }

    public static void fillWithRandom(List<Integer> list){

        Random rng = new Random();

        for(int i = 0; i < 100000; i++) {
            list.add(rng.nextInt(0, 100));
        }
    }




    public static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        int middle = list.size() / 2;
        List<Integer> left = new ArrayList<>(list.subList(0, middle));
        List<Integer> right = new ArrayList<>(list.subList(middle, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }


    public static List<Integer> bubbleSort(List<Integer> list) {

        List<Integer> copy = new ArrayList<Integer>(list);

        for (int i = 0; i < copy.size(); i++) {
            for (int j = 0; j < copy.size() - 1; j++) {

                if (copy.get(j) > copy.get(j + 1)) {
                    Collections.swap(copy, j, j + 1);
                }
            }
        }

        return copy;

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