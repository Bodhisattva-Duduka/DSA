
public class CeilingOfANumber {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 8, 9, 12, 34, 56, 88, 102};
        int target = 101;
        System.out.println(findCeiling(arr, target));
    }

    public static int findCeiling(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            int midValue = arr[mid];

            if (target == midValue) {
                return mid;
            } else if (target > midValue) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
