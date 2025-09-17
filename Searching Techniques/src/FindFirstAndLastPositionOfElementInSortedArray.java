import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray{
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        FindFirstAndLastPositionOfElementInSortedArray obj = new FindFirstAndLastPositionOfElementInSortedArray();

        System.out.println(Arrays.toString(obj.searchRange(nums, target)));
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[] {-1,-1};
        }
        int low = 0;
        int high = nums.length - 1;
        
        // finding least index
        
        boolean bool = true;
        while(low<=high){
            int mid = (low + high)/2;
            int midValue = nums[mid];
            if (target == midValue){
                high = mid - 1;
                bool = false;
            }
            else if (target>midValue){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if(bool){
            return new int[] {-1,-1};
        }
        int lowest = low;
        
        // finding max index

        int newLow = 0;
        int newHigh = nums.length - 1;
        while(newLow<=newHigh){
            int mid = (newLow + newHigh)/2;
            int midValue = nums[mid];
            if (target == midValue){
                newLow = mid + 1;
                bool = false;
            }
            else if (target>midValue){
                newLow = mid + 1;
            }
            else if (target<midValue){
                newHigh = mid - 1;
            }
        }
        int highest = newHigh;
        return new int[] {lowest,highest};
    }
}