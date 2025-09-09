
import java.util.Arrays;


public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr
                = {
                    {2, 4, 6},
                    {8, 34, 79, 12},
                    {18, 23, 5, 7, 94},
                    {9, 23, 65, 29}
                };
        int target = 65;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    public static int[] search(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[] {-1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1};
    }
}
