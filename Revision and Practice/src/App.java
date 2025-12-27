
public class App {

    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println(findNumberWithEvenNoOfDigits(arr));
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
}
