public class MaximumPointsYouCanObtainFromCards {
    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k = 3;
        MaximumPointsYouCanObtainFromCards obj = new MaximumPointsYouCanObtainFromCards();
        System.out.println(obj.maxScore(cardPoints, k));
    }
    public int maxScore(int[] cardPoints, int k) {
        int totalSum = 0;
        for (int i = 0; i < cardPoints.length; i++) {
            totalSum += cardPoints[i];
        }
        int r = cardPoints.length - k;
        int currentSum = 0;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < r; i++) {
            currentSum += cardPoints[i];
        }
        minSum = Math.min(currentSum, minSum);
        for (int i = r; i < cardPoints.length ; i++) {
            currentSum += cardPoints[i];
            currentSum -= cardPoints[i-r];
            minSum = Math.min(currentSum, minSum);
        }
        return totalSum - minSum;
    }
}
