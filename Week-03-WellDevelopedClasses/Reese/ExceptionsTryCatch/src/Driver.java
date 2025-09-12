import java.io.IOException;
import java.lang.reflect.Executable;

public class Driver {
    public static void main(String[] args) {

        fooBar();
        // try {

        // }catch (CarCrashException cce){
        //     System.out.println("oopsies");
        //     System.out.println(cce.getMessage());
        // }
        // System.out.println("ASKDasjdf");
        
    }


    public static void doThing(){
        try {
            // do something


            int i = 123 / 0;
        }
        catch(ClassCastException cce){
            System.out.println("You did a bad cast");
        }
        catch(ArithmeticException ae){
            System.out.println("You tried to divide by 0");
            System.out.println(ae.getMessage());
            return;
        }
        catch(Exception e) {
            System.out.println("oopsies"); 
            e.printStackTrace();
        }
        finally {

            System.out.println("Finally has ran");
        }
    }


    public static void fooBar(){
        
        try {
            divide(4, 0);
        } catch (CarCrashException e) {
            System.out.println("Calling the fire department!");
        }

        // try{
        // } catch(Exception e) {
        //     System.out.println("You tried to divide by 0");
        // }

    }

    public static int divide(int n, int d) throws CarCrashException {


        if(d == 0){
            // cause exception

            throw new CarCrashException("dividing by 0 caused a 4 car pile up");
        }


        return n / d;
    }
}