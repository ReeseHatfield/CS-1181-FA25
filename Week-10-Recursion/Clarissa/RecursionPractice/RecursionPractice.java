import java.util.ArrayList;
import java.util.List;

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
        System.out.println(permute("pencil"));
        combinations(4);
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

    public static ArrayList<String> permute(String word) {
        ArrayList<String> pList = new ArrayList<>();
        if (word.isEmpty()) {
            return null;
        } else if (word.length() == 1) {
            pList.add(word);
            return pList;
        } else {
            for (int i = 0; i < word.length(); i++) {
                // String letter = word.substring(i, i + 1);
                char letter = word.charAt(i);
                String remaining = word.substring(0, i) + word.substring(i + 1);

                ArrayList<String> permutes = permute(remaining);
                for (String p : permutes) {
                    String reconstructed = letter + p;
                    pList.add(reconstructed);
                }
            }
            return pList;
        }
    }

    public static void combinations(int num)
    {
        findCombinations(1, num, 0, new ArrayList<>());
    }

    public static void findCombinations(int currVal, int sumNum, int currentSum, List<Integer> combination)
    {
        if (currentSum == sumNum)
        {
            System.out.println(combination);
            return;
        }

        if (currentSum > sumNum || currVal > sumNum) {
            return;
        }

        // Include currVal in the current combination
        combination.add(currVal);
        findCombinations(currVal, sumNum, currentSum + currVal, combination);

        // Backtrack and remove the currVal from the combination
        combination.removeLast();
        findCombinations(currVal + 1, sumNum, currentSum, combination);
    }
}
