public class FindFirstandLastPositionofElementinSortedArray {
  public static void main(String[] args) {
    int[] nums = {2,2};
    int target = 3;
    FindFirstandLastPositionofElementinSortedArray obj = new FindFirstandLastPositionofElementinSortedArray();
    System.out.println(obj.searchRange(nums, target));
  }
  public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0){
            return new int[] {-1, -1};
        }
        if(nums.length == 1){
            if(nums[0] == target){
                return new int[] {0, 0};
            } else if(nums[0] != target){
                return new int[] {-1, -1};
            }
        }
        int left = 0;
        int right = 0;

        int low = 0;
        int high = nums.length - 1;
        while(low<=high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                high = mid - 1;
            } else if(nums[mid]>target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if(low == nums.length){
            left = -1;
        } else if(nums[low] == target){
            left = low;
        } else {
            left = -1;
        }

        low = 0;
        high = nums.length - 1;
        while(low<=high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                low = mid + 1;
            } else if(nums[mid]>target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if(high == -1){
            right = -1;
        } else if(nums[high] == target){
            right = high;
        } else {
            right = -1;
        }
        
        return new int[] {left, right};
    }
}
