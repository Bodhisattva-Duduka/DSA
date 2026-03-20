public class SecondLargest {
    public static void main(String[] args) {
        // int[] arr = {10,5,10};
        int[] arr2 = {10, 10, 10};
        // int[] nums = {12, 35, 1, 10, 34, 1};
        SecondLargest obj = new SecondLargest();
        System.out.println(obj.getSecondLargest(arr2));
    }
    public int getSecondLargest(int[] arr) {
        int secondMax = Integer.MAX_VALUE;
        int currDiff = 0;
        int num = 0;
        int max = arr[0];
        int curr = 0;
        for(int i = 0; i<arr.length; i++){
            curr = arr[i];
            if(curr>max){
                max = curr;
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != max){
                currDiff = max - arr[i];
                if(secondMax>currDiff){
                    secondMax = currDiff;
                    num = arr[i];
                }
            }
        }
        if(num == 0){
            return -1;
        } else {
            return num;
        }
    }
}