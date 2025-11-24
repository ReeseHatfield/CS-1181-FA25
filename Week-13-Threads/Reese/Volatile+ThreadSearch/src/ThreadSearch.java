import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ThreadSearch {
    public static void main(String[] args) throws FileNotFoundException {
        

        writeRandomList(20_000_000);


        long start = System.currentTimeMillis();
        ArrayList<Integer> list = readListFromFile();

        System.out.println(list.indexOf(123456));

        long end = System.currentTimeMillis();


        System.out.println("Took " + ((end - start) / 1000.0) + " seconds");
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
