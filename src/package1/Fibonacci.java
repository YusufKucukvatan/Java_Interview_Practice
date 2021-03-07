package package1;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(10);
    }

    public static void fibonacci(int count){
        ArrayList<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);

        for(int i=2; fibo.size()<=10; i++){
            fibo.add( fibo.get(i-2) + fibo.get(i-1) );
        }

        for (int each : fibo){
            System.out.print(each + " ");
        }
    }
}
