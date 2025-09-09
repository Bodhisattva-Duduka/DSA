
import java.util.Arrays;

public class SearchingInRange {

    public static void main(String[] args) {
        int[] arr = {2, 4, 21, 90, 1, 6, 36, 88, 3};
        int target = 90;
        int minboundary = 0;
        int maxboundary = 5;

        int index = search(arr, target, minboundary, maxboundary);

        System.out.println(Arrays.toString(arr));
        if (index != -1) {
            System.out.println("Index found at " + index);
        } else {
            System.out.println("Target not found in given range");
        }
    }

    public static int search(int[] arr, int target, int minboundary, int maxboundary) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // ensure boundaries are valid
        if (minboundary < 0) {
            minboundary = 0;
        }
        if (maxboundary >= arr.length) {
            maxboundary = arr.length - 1;
        }

        for (int index = minboundary; index <= maxboundary; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
