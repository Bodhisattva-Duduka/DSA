
public class PeakIndexInAMountainArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 2, 0};
        PeakIndexInAMountainArray obj = new PeakIndexInAMountainArray();
        System.out.println(obj.peakIndexInMountainArray(arr));
    }

    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}