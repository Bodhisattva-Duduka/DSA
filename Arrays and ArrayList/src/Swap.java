import java.util.Arrays;
public class Swap {

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 8, 91, 0};

        System.out.println(Arrays.toString(arr));
        swapNumbers(arr, 2, 3);
        System.out.println(Arrays.toString(arr));
    }

    public static void swapNumbers(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
