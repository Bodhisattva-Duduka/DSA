import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        WaveArray obj = new WaveArray();
        obj.sortInWave(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void sortInWave(int arr[]) {
        if(arr.length<=1){
            return;
        }
        
        int first = 0;
        int second = 1;
        while(second<arr.length){
            swap(arr, first, second);
            first = first + 2;
            second = second + 2;
            System.out.println(Arrays.toString(arr));
        }
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}