public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 8, 9, 12, 34, 56, 88, 102};
        int target = 88;
        System.out.println(binarySearch(arr, target)); // Output: 5
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // safer midpoint
            int midValue = arr[mid];

            if (target == midValue) {
                return mid; // found
            } else if (target > midValue) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // not found
    }
}
