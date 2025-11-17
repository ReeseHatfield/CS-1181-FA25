import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Searching
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>(Arrays.asList
                ("Bob", "Fred", "Jane", "Tom", "Sarah", "Tim", "Alice", "Carl", "Zayne"));
        Collections.sort(names);
        System.out.println(names);
        System.out.println(binarySearch(names, "Sarah"));
    }

    public static <E extends Comparable<E>> int binarySearch(List<E> input, E value)
    {
        if (input.isEmpty())
        {
            return -1;
        }
        else if (input.size() == 1)
        {
            if (input.getFirst().equals(value))
            {
                return 0;
            }
            return -1;
        }
        int pivot = input.size() / 2;
        if (value.compareTo(input.get(pivot)) < 0)
        {
            return binarySearch(input.subList(0, pivot), value);
        }
        else if (value.compareTo(input.get(pivot)) > 0)
        {
            int index = binarySearch(input.subList(pivot, input.size()), value);
            if (index == -1)
            {
                return index;
            }
            return pivot + index;
        }
        return pivot;
    }
}
