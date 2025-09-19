import java.util.Collections;
import java.util.Random;

public class GenericLotteryExample
{
    public static void main(String[] args)
    {
        LotteryMachine<Integer> lm = new LotteryMachine<>();

        Random rng = new Random();

        for (int i = 0; i < 50; i++)
        {
            int value = rng.nextInt(1000);
            lm.addItem(value);
        }

        System.out.println("The winner is: " + lm.pickItem() + "!!!");

//        LotteryMachine<String> lm2 = new LotteryMachine<>();
//
//        for (int i = 0; i < 50; i++)
//        {
//            String blah = "";
//            for (int j = 0; j < 5; j++)
//            {
//                char letter = (char) (rng.nextInt(25) + 97);
//                blah = blah + letter;
//            }
//            lm2.addItem(blah);
//        }
//
//        System.out.println("The winner is: " + lm2.pickItem().toUpperCase() + "!!!");
//
//        lm.orderMachine();
//        lm2.orderMachine();

        //LotteryMachine<Blah> lm3 = new LotteryMachine<>();

    }

//    public static void orderMachine(LotteryMachine lm)
//    {
//        Collections.sort(randomValues);
//        System.out.println(randomValues);
//    }
}
