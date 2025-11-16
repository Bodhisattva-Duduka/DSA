
public class MagicNumber {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(findMagicNumber(n));
    }

    static int findMagicNumber(int n) {
        int sum = 0;
        int count = 1;
        while (n != 0) {
            int and = n & 1;
            sum = sum + (and * (int) Math.pow(5, count));
            n = n >> 1;
            count++;
        }
        return sum;
    }
}
