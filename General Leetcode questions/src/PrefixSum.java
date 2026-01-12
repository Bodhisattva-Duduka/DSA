import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        PrefixSum obj = new PrefixSum();
        // System.out.println(Arrays.toString(obj.prefixSumArray(arr)));
        obj.prefixMaxAndPrefixMin(arr);
    }
    long[] prefixSumArray(int[] arr){
        long[] P = new long[arr.length + 1];
        P[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            P[i + 1] = P[i] + arr[i];
        }
        return P;
    }
    void prefixMaxAndPrefixMin(int[] arr){
        int[] prefixMax = new int[arr.length];
        int[] prefixMin = new int[arr.length];
        prefixMax[0] = arr[0];
        prefixMin[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            prefixMax[i] = Math.max(prefixMax[i-1], arr[i]);
            prefixMin[i] = Math.min(prefixMin[i - 1], arr[i]);
        }
        System.out.println(Arrays.toString(prefixMax));
        System.out.println(Arrays.toString(prefixMin));
    }
}
