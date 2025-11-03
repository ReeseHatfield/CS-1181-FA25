import java.util.ArrayList;

public class RecursionPractice
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(-8);
        nums.add(10);
        nums.add(3);
        System.out.println(reverseWord("hello"));
        System.out.println(countEven("543276"));
        System.out.println(findMax(nums));
    }

    public static String reverseWord(String word)
    {
        if (word.length() <= 1 || word == null)
        {
            return word;
        }
        else
        {
            int lastIndex = word.length() - 1;
            String wordMinusLast = word.substring(0, lastIndex);
            return word.charAt(lastIndex) + reverseWord(wordMinusLast);
        }
    }

    public static int countEven(String num)
    {
        if (num.isEmpty())
        {
            return 0;
        }
        int firstNum = Integer.parseInt(num.substring(0, 1));
        if (firstNum % 2 == 0)
        {
            return 1 + countEven(num.substring(1));
        }
        return countEven(num.substring(1));
    }

    public static <E extends Comparable<E>> E findMax(ArrayList<E> input)
    {
        // method should find and return the "max" value from the input
        // (recursively)

        if (input.isEmpty())
        {
            return null;
        }
        else if (input.size() == 1)
        {
            return input.getFirst();
        }

        E firstValue = input.removeFirst();
        E max = findMax(input);

        if (firstValue.compareTo(max) > 0)
        {
            return firstValue;
        }
        return max;
    }
}
