public class SecondLargest {
    public static void main(String[] args) {
        // int[] arr = {10,5,10};
        int[] arr2 = {0,1,3,3,3,5,3};
        // int[] nums = {12, 35, 1, 10, 34, 1};
        SecondLargest obj = new SecondLargest();
        System.out.println(obj.getSecondLargest(arr2));
    }
    public int getSecondLargest(int[] arr) {
        int firstMax = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (firstMax <= arr[i]){
                firstMax = arr[i];
            }
        }
        int secondMax = 0;
        boolean bool = false;
        for (int i = 0; i<arr.length; i++){
            if (secondMax <= arr[i] && arr[i] != firstMax){
                secondMax = arr[i];
                bool = true;
            }   
        }
        if (bool){
            return secondMax;
        }
        else {
            return -1;
        }
    }
}