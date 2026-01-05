public class FruitsIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        int[] fruits2 = {4,4,4,3,3,1};
        FruitsIntoBaskets obj = new FruitsIntoBaskets();
        System.out.println(obj.totalFruit(fruits));
    }
    public int totalFruit(int[] fruits) {
        int left = 0;
        int right = 0;
        int fruitCount = 0;
        int maxFruitCount = 0;
        int firstFruit = fruits[0];
        int secondFruit = -1;
        int distinctFruitCounter = 1;
        while(right<fruits.length){
            if(firstFruit != fruits[right] && distinctFruitCounter<=2){
                if(secondFruit == fruits[right]){
                    distinctFruitCounter--;
                }
                secondFruit = fruits[right];
                distinctFruitCounter++;
            }
            while(distinctFruitCounter>2){
                if(firstFruit != fruits[left]){
                    distinctFruitCounter--;
                    firstFruit = fruits[left];
                    left--;
                    fruitCount++;
                }
                left++;
                fruitCount--;
            }
            fruitCount++;
            right++;
            maxFruitCount = Math.max(fruitCount, maxFruitCount);
        }
        return maxFruitCount;
    }
}
