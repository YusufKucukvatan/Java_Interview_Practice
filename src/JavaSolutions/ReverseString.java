package JavaSolutions;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String str="abcdef";
        System.out.println(reverse1(str));
    }

    private static String reverse1(String str) {
        String reverse="";
        for (int i=str.length()-1; i>=0; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }

    private static String reverse2(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static String reverse3(String str) {
        return Arrays.stream(str.split("")).reduce("",(x,y)->y+x);
    }
}
