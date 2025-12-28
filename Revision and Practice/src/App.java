import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        int[] nums = {5,7,7,8,8,8,8,8,8,8,8,10};
        int[] arr2 = {5, 3, 4, 2, 1};
        int[] nums2 = {4,3,2,7,8,2,3,1};
        App obj = new App();
        System.out.println((obj.findDisappearedNumbers(nums2)));
        cyclicSort(arr2);
        // System.out.println(Arrays.toString(arr2));
        // System.out.println(Arrays.toString(findRange(nums, 8)));
        // System.out.println(findNumberWithEvenNoOfDigits(arr));
    }

    // leetcode 1295

    public static int findNumberWithEvenNoOfDigits(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int noOfDigits = (int) Math.log(arr[i]) + 1;
            if (noOfDigits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static char findSmallestLetterGreaterThanTarget(char[] arr, char target){
        int low = 0;
        int high = arr.length - 1;
        if (target>=arr[arr.length - 1]){
            return arr[0];
        }
        while(low<=high){
            int mid = (low + high)/2;
            if (target == arr[mid]){
                low = mid + 1;
            }
            else if (target>arr[mid]){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return arr[low];
    }

    // {5,7,7,8,8,8,8,8,8,8,10}
    //  0 1 2 3 4 5 6 7 8 9 10
    public static int[] findRange(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int lowerIndex ;
        int higherIndex ;
        // find lower index
        boolean bool = true;
        while(low<=high){
            int mid = (low + high) / 2;
            if (target == arr[mid]){
                high = mid - 1;
                bool = false;
            }
            else if (target>arr[mid]){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if (bool){
            return new int[] {-1,-1};
        }
        lowerIndex = low;
        // find higher index
        low = 0;
        high = arr.length - 1;
        while(low<=high){
            int mid = (low + high) / 2;
            if (target == arr[mid]){
                low = mid + 1;
            }
            else if (target>arr[mid]){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        higherIndex = high;
        return new int[] {lowerIndex, higherIndex};
    }

    public static int searchInRotatedArray(int[] arr, int target){
        int pivot = findPivot(arr);
        if (pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target){
            return pivot;
        }
        if (arr[0]<=pivot){
            return binarySearch(arr, target, 0, pivot - 1);
        }
        return binarySearch(arr, target, pivot+1, arr.length-1);
    }

    public static int findPivot(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        while(low<=high){
            int mid = (low + high)/2;
            if(mid<high && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(low<mid && arr[mid-1]>arr[mid]){
                return mid - 1;
            }
            if(arr[low]<arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int low , int high){

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

    public static void cyclicSort(int[] arr){
        int i = 0;
        int correct ;
        while(i<arr.length){
            correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    
    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    // leetcode 448
    
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap2(nums, i, correct);
            } else {
                i++;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            int value = j + 1;
            if (nums[j] != value) {
                arr.add(value);
            }
        }
        return arr;
    }

    static void swap2(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
