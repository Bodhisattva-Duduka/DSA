import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        // int[] arr = {5,4,1,2,3};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i = 0;
        while(i<arr.length){

            int correctIndex = arr[i] - 1;
            if(arr[correctIndex] != arr[i]){
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
    }
}
