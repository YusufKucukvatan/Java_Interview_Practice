package JavaSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }

    static int n1=1, n2=2, n3=0;
    static ArrayList<Integer> fiboList = new ArrayList<>(Arrays.asList(n1,n2));

    public static ArrayList<Integer> fibonacci(int count){
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            fiboList.add(n3);
            fibonacci(count-1);
        }
        return fiboList;
    }
}
