
public class PositionOfElementInInfiniteSortedArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 90;
        int low = 0;
        int high = 1;
        while (target > arr[high]){
            low = high + 1;
            high = 2 * high;
        }
        System.out.println(binarySearch(low, high, arr, target));
    }
    static int binarySearch(int low, int high, int[] arr, int target){
        while(low<=high){
            int mid = (low + high) / 2 ;
            int midValue = arr[mid];
            if (target == midValue){
                return mid;
            }
            else if(target >= midValue){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
