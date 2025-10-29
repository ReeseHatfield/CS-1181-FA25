public class RecursionPractice
{
    public static void main(String[] args)
    {
        System.out.println(reverseWord("hello"));
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
}
