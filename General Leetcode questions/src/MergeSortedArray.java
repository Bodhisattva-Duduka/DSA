import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        int m = 1;
        int n = 1;
        MergeSortedArray obj = new MergeSortedArray();
        System.out.println(Arrays.toString(obj.merge(nums1, m, nums2, n)));
    }
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if (n==0){
            return nums1;
        }
        if (m==0){
            for (int i = 0; i<nums1.length; i++){
                nums1[i] = nums2[i];
            }
            return nums1;
        }
        int[] arr = new int[nums1.length];
        int firstPointer = 0;
        int secondPointer = 0;
        int i = 0;
        while(firstPointer<m && secondPointer<n){
            if (nums1[firstPointer] < nums2[secondPointer]){
                arr[i] = nums1[firstPointer];
                i++;
                firstPointer++;
            }
            else {
                arr[i] = nums2[secondPointer];
                i++;
                secondPointer++;
            }
        }
        while(secondPointer<n && i<nums1.length){
            arr[i] = nums2[secondPointer];
            i++;
            secondPointer++;
        }
        while(firstPointer<m && i<nums1.length){
            arr[i] = nums1[firstPointer];
            i++;
            firstPointer++;
        }
        for (int j = 0; j<arr.length; j++){
            nums1[j] = arr[j];
        }
        return nums1;
    }
}
