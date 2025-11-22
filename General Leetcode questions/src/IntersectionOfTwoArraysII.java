
import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArraysII {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        IntersectionOfTwoArraysII obj = new IntersectionOfTwoArraysII();
        System.out.println(Arrays.toString(obj.intersect(nums1, nums2)));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int firstPointer = 0;
        int secondPointer = 0;
        while (firstPointer < nums1.length && secondPointer < nums2.length) {
            if (nums1[firstPointer] == nums2[secondPointer]) {
                list.add(nums1[firstPointer]);
                firstPointer++;
                secondPointer++;
            }
            else if (nums1[firstPointer] < nums2[secondPointer]) {
                firstPointer++;
            } else {
                secondPointer++;
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
