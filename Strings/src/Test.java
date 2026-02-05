import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {3,-2,1,1};
        Test obj = new Test();
        System.out.println(Arrays.toString(obj.constructTransformedArray(nums)));
    }
    public int[] constructTransformedArray(int[] nums) {
        int arr[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                int a=nums[i]+i;
                if(a>=nums.length){
                    arr[j]=nums[a%nums.length];
                    j++;
                }else{
                    arr[j]=nums[a];
                    j++;
                }
            }else if(nums[i]<0){
                int a=nums[i]+i;
                if(a<0){
                    arr[j]=nums[nums.length-a];
                    j++;
                }
                arr[j] = nums[a];
                j++;
            }else{
                arr[j]=nums[i];
                j++;
            }
        }
        return arr;
    }
}
