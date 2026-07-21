import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {8, 3, 7, 4, 1, 0, 7, 4, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // public static void selectionSort(int[] arr) {
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         int minIndex = i;

            
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[j] < arr[minIndex]) {
    //                 minIndex = j;
    //             }
    //         }

    //         if (minIndex != i) {
    //             int temp = arr[minIndex];
    //             arr[minIndex] = arr[i];
    //             arr[i] = temp;
    //         }
    //     }
    // }


    // 8, 3, 7, 4, 1, 0, 7, 4, 2
    public static void selectionSort(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                if(arr[j] <= min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
            min = Integer.MAX_VALUE;
            minIndex = -1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
