import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 4, 12, 1, 7, 2, 3, 6, 3, 1};
        counting(arr);
    }

    public static void counting(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int[] countArr = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }
        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i] != 0) {
                ans[j] = i;
                countArr[i]--;
                j++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
