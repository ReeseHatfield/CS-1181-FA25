import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ThreadSearch {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        

        ArrayList<Integer> list = readListFromFile();


        System.out.println("starting search");

        int numThreads = 5;
        int target = 11412140;

        ArrayList<Searcher> threads = new ArrayList<>();
        for(int i = 0; i < numThreads; i++){
            int portionSize = list.size() / numThreads;

            int start = i * portionSize;
            int end = start + portionSize;

            if(i == numThreads - 1){
                end = list.size();
            }

            System.out.println("looking at thread "  + i);
            System.out.println(start);
            System.out.println(end);


            List<Integer> portion = list.subList(start, end);

            threads.add(new Searcher(portion, target));

        }

        for(Searcher s: threads){
            s.start();
        }


        for(Searcher s: threads) {
            s.join();
        }

        System.out.println("program finished");







        
        // long start = System.currentTimeMillis();
        // System.out.println(list.indexOf(1234567));
        // long end = System.currentTimeMillis();


        // System.out.println("Took " + ((end - start) / 1000.0) + " seconds");
    }


    public static void writeRandomList(int size) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        try (PrintWriter pw = new PrintWriter(new File("nums.txt"))) {

            for (Integer num : list) {
                pw.print(num);
                pw.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Integer> readListFromFile() throws FileNotFoundException {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner scnr = new Scanner(new File("nums.txt"));
        for (String s = scnr.nextLine(); scnr.hasNextLine(); s = scnr.nextLine()) {
            list.add(Integer.parseInt(s));
        }
        scnr.close();

        return list;
    }
}
