
public class RotationCountInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        RotationCountInRotatedSortedArray obj = new RotationCountInRotatedSortedArray();
        System.out.println(obj.findKRotation(arr));
    }

    public int findKRotation(int arr[]) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    public int findPivot(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > low && arr[mid - 1] > arr[mid]) {
                return mid - 1;
            }
            if (arr[low] > arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
