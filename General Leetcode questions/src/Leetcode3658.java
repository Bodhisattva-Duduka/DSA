public class Leetcode3658 {
  public static void main(String[] args) {
        Leetcode3658 obj = new Leetcode3658();
        System.out.println(obj.gcdOfOddEvenSums(4));
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 1; i<= 2*n; i++){
            if(i % 2 == 0){
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        return findGCD(sumEven, sumOdd);
    }
    public int findGCD(int n1, int n2){
        while(n1 != 0 && n2 != 0){
            if(n1>n2){
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        if(n1 == 0){
            return n2;
        } else {
            return n1;
        }
    } 
}