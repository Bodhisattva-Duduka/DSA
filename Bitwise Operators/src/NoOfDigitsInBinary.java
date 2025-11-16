public class NoOfDigitsInBinary {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(findDigits(n));
    }
    static int findDigits(int n){
        int b = 2;
        return (int) ((Math.log(n) / Math.log(b)) + 1);
    }
}
