package JavaSolutions;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(10);
    }
    static int n1=1, n2=2, n3=0;

    public static void fibonacci(int count){
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonacci(count-1);
        }

    }
}
