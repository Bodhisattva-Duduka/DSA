import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        PrefixSum obj = new PrefixSum();
        System.out.println(Arrays.toString(obj.prefixSumArray(arr)));
    }
    long[] prefixSumArray(int[] arr){
        long[] P = new long[arr.length + 1];
        P[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            P[i + 1] = P[i] + arr[i];
        }
        return P;
    }
}
