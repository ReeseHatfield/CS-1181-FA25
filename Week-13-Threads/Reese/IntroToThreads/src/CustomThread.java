import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CustomThread extends Thread {


    private int id;

    public int sumMe;

    public CustomThread(int id){
        this.id = id;
    }

    @Override
    public void run(){
        System.out.println("Hello from " + this.id);
        try {
            Thread.sleep(1000);

            File f = new File("file-" + id + ".txt");
            PrintWriter pw = new PrintWriter(f);

            pw.write("Hello" + id);
            pw.close();
            

        } catch (InterruptedException | FileNotFoundException e) {}

        this.sumMe = id * 2;
    }
    
}
