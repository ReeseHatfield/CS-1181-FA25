import java.util.*;

public class Sorting
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 9, 1, 43, 21, 6, 93, 27, 47, 75));
        System.out.println(mergeSort(nums));
    }

    public static <E extends Comparable<E>> List<E> mergeSort(List<E> items)
    {
        if (items.size() <= 1)
        {
            return items;
        }
        int half = items.size() / 2;
        List<E> firstHalf = items.subList(0, half);
        List<E> secondHalf = items.subList(half, items.size());

        firstHalf = new ArrayList<>(mergeSort(firstHalf));
        secondHalf = new ArrayList<>(mergeSort(secondHalf));

        List<E> result = new ArrayList<>();
        int totalSize = firstHalf.size() + secondHalf.size();
        E firstItem = firstHalf.removeFirst();
        E secondItem = secondHalf.removeFirst();
        boolean firstHalfDone = false;
        boolean secondHalfDone = false;

        for (int i = 0; i < totalSize; i++)
        {

            if (secondHalfDone || (!firstHalfDone && firstItem.compareTo(secondItem) < 0))
            {
                result.add(firstItem);
                firstHalfDone = firstHalf.isEmpty();
                if (!firstHalfDone)
                {
                    firstItem = firstHalf.removeFirst();
                }
            }
            else
            {
                result.add(secondItem);
                secondHalfDone = secondHalf.isEmpty();
                if (!secondHalfDone)
                {
                    secondItem = secondHalf.removeFirst();
                }
            }
        }
        return result;

    }
}
