
public class MaxNumberInArray {

    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 37, 23337, 3, 83, 357};
        int maxNum = findMaxNumber(arr);
        System.out.println("max number is " + maxNum);
    }

    public static int findMaxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
