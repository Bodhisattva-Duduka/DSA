public class SearchInRotatedSortedArrayWithDuplicates {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 6, 7, 0, 1, 2, 4, 4};
        int target = 4;
        SearchInRotatedSortedArrayWithDuplicates obj = new SearchInRotatedSortedArrayWithDuplicates();
        System.out.println(obj.search(arr, target));
    }

    public boolean search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
            }

            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                        high = mid - 1;
                }
            }
        }
        return false;
    }
}
