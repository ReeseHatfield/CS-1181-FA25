import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputTesting
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        boolean badUserInput = true;
        int dividend = 0;

        while (badUserInput)
        {
            try
            {
                System.out.println("Enter your age:");
                int age = scnr.nextInt();
                int result = age / dividend;
                System.out.println("I made it to here!");
                badUserInput = false;
            }
            catch (InputMismatchException ime)
            {
                System.out.println("You need to enter a number!");
                scnr.nextLine();
            }
            catch (ArithmeticException ae)
            {
                dividend = 1;
                System.out.println("Caught ArithmeticException!!");
            }
            catch (Exception e)
            {
                System.out.println("Unexpected!!!!");
            }
        }
    }
}
