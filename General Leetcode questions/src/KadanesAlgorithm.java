
import java.util.Arrays;

public class KadanesAlgorithm {

    public static void main(String[] args) {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
        KadanesAlgorithm obj = new KadanesAlgorithm();
        System.out.println(obj.kadanesAlgo(nums));
        System.out.println(Arrays.toString(obj.kadanesAlgoForIndices(nums)));
    }

    public int kadanesAlgo(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > max) {
                max = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return max;
    }

    public int[] kadanesAlgoForIndices(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for (int i = 0; i < nums.length; i++) {
            if (currentSum == 0) {
                start = i; // new candidate subarray would start here
            }
            currentSum += nums[i];

            if (currentSum > max) {
                max = currentSum;
                ansStart = start;
                ansEnd = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return new int[]{ansStart, ansEnd};
    }
}
