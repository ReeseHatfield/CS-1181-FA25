public class RecursionPractice
{
    public static void main(String[] args)
    {
        System.out.println(reverseWord("hello"));
        System.out.println(countEven("543276"));
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
}
