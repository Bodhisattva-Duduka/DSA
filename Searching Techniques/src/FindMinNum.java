
public class FindMinNum {

    public static void main(String[] args) {
        int[] arr = {20, 4, 6, 100, 3, 346, 89};
        int minNum = findMin(arr);
        System.out.println(minNum);
    }

    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int currentMin = arr[0];

        for (int index = 0; index < arr.length; index++) {
            if (currentMin > arr[index]) {
                currentMin = arr[index];
            }
        }
        return currentMin;
    }
}
