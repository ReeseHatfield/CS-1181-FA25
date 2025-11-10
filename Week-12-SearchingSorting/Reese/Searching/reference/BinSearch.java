import java.util.List;

public class BinSearch{

    public static int binarySearch(List<Integer> list, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (list.get(mid) == target) {
            return mid;

        } else if (list.get(mid) > target) {
            return binarySearch(list, target, left, mid - 1);
        } else {
            return binarySearch(list, target, mid + 1, right);
        }
    }
}