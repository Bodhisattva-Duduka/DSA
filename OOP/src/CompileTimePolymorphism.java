public class CompileTimePolymorphism {
    int sum(int a, int b){
        return a + b;
    }

    double sum(double a, double b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        CompileTimePolymorphism obj = new CompileTimePolymorphism();
        System.out.println(obj.sum(4,6,2));
    }
}
