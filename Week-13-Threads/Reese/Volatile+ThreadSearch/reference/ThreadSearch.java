import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ThreadSearch {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        int size = 10_000_000;
        int numThread = 10;
        int target = 123456; 

        writeRandomList(size);
        ArrayList<Integer> searchMe = readListFromFile();

        ArrayList<Thread> threads = new ArrayList<>();
        int chunkSize = searchMe.size() / numThread;

        for (int i = 0; i < numThread; i++) {
            int start = i * chunkSize;
            int end = start + chunkSize;
            

            if (i == numThread - 1) {
                Thread t = new Thread(() -> searchChunk(searchMe, start, searchMe.size(), target));
                threads.add(t);
                t.start();
            }
            else {
                Thread t = new Thread(() -> searchChunk(searchMe, start, end, target));
                threads.add(t);
                t.start();
            }

        }

        for (Thread t : threads) {
            t.join();
        }
    }

    public static void searchChunk(ArrayList<Integer> list, int start, int end, int target) {
        for (int i = start; i < end; i++) {

            if (list.get(i) == target) {

                System.out.println("Found target " + target + " at index " + i);

            }
        }
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

