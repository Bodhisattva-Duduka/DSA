
public class Leetcode1343 {

    public static void main(String[] args) {
        int[] arr = {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int threshold = 5;
        Leetcode1343 obj = new Leetcode1343();
        System.out.println(obj.numOfSubarrays(arr, k, threshold));
    }

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int average = 0;
        int count = 0;
        int window = 0;
        for (int i = 0; i < k; i++) {
            window += arr[i];
        }
        average = (int) window / k;
        if (average >= threshold) {
            count++;
        }
        for (int i = k; i < arr.length; i++) {
            window += arr[i];
            window -= arr[i - k];
            average = (int) window / k;
            if (average >= threshold) {
                count++;
            }
        }
        return count;
    }
}
