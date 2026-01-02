import java.util.Arrays;

public class FrequencyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 3};
        int k = 3;
        FrequencyArray obj = new FrequencyArray();
        System.out.println(Arrays.toString(obj.FrequencyArrayWithWindow(arr, k)));
    }
    public boolean[] FrequencyArrayWithWindow(int[] arr, int k){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }            
        }
        int[] freq = new int[max + 1];
        boolean[] bool = new boolean[arr.length];
        int windowSum = 0;
        int duplicateCounter = 0;
        for (int i = 0; i<k; i++){
            windowSum = windowSum + arr[i];
            freq[arr[i]]++;
            if(freq[arr[i]] > 1){
                duplicateCounter++;
            }
            if (duplicateCounter == 0){
                bool[i] = true;
            }
        }

        for(int i = k; i<arr.length; i++){
            windowSum = windowSum + arr[i];
            windowSum = windowSum - arr[i - k];
            freq[arr[i]]++;
            freq[arr[i - k]]--;
            if(freq[arr[i]] > 1){
                duplicateCounter++;
            }
            if(freq[arr[i - k]] == 1){
                duplicateCounter--;
            }
            if(duplicateCounter == 0){
                bool[i] = true;
            }
            else{
                bool[i] = false;
            }
        }
        return bool;
    }
}
