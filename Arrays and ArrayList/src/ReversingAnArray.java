
import java.util.Arrays;



public class ReversingAnArray {
    public static void main(String[] args) {
        int [] arr = {3,6,2,8,3,7,9,32};
        reverseArray(arr);
    }
    public static void reverseArray(int [] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
