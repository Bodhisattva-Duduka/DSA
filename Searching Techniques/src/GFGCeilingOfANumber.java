public class GFGCeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 11, 12, 19};
        int target = 5;
        System.out.println(findCeiling(arr, target));
    }
    static int findCeiling(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        if (target>=arr[arr.length-1]){
            return -1;
        }
        while(low<=high){
            int mid = (low + high)/2;
            int midValue = arr[mid];
            if(target == midValue){
                high = mid - 1;
            }
            else if(target>midValue){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low;
    }
}
