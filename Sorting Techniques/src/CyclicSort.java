import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8};
        // int[] arr = {5,4,1,2,3};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr){
        int i = 0;
        while(i<arr.length){

            int correctIndex = arr[i] - 1;

            if(arr[i] > 0 && arr[i] <= arr.length && arr[i]>0 && arr[correctIndex] != arr[i]){
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }
        int f = 1;
        for(int j = 0; j<arr.length; j++){
            if(arr[j]>0 && arr[j] == f){
                f++;
            } else {
                System.out.println(f);
                break;
            }
        }
        System.out.println(f);
    }
}
