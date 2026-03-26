public class Leetcode74 {
    public static void main(String[] args) {
        int[][] matrix = {{1}};
        int target = 1;
        Leetcode74 obj = new Leetcode74();
        System.out.println(obj.searchMatrix(matrix,target));
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i<matrix.length; i++){
            if(matrix[i][0]<= target && matrix[i][matrix[0].length - 1]>=target){
                int[] mat = matrix[i];
                boolean bool = binarySearch(mat, target);
                return bool;
            }
        }
        return false;
    }
    public boolean binarySearch(int[] matrix, int target){
        int left = 0;
        int right = matrix.length - 1;
        while(left<=right){
            int mid = (left + right)/2;
            if(matrix[mid] == target){
                return true;
            } else if (target>=matrix[mid]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
