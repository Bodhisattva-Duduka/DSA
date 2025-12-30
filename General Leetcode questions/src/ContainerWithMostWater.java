public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater obj = new ContainerWithMostWater();
        System.out.println(obj.maxArea(height));
    }
    public int maxArea(int[] height) {
        int area = 0;
        int maxArea = 0;
        int widthOfContainer = 0;
        int heightOfContainer = 0;
        int left = 0;
        int right = height.length - 1;
        while(left<=right){
            widthOfContainer = right - left;
            heightOfContainer = Math.min(height[left], height[right]);
            area = widthOfContainer * heightOfContainer;
            if(area>maxArea){
                maxArea = area;
            }
            if (height[left]<height[right]){
                left++;
            }
            else if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return maxArea;
    }
}
