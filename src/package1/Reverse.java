package package1;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        String str="abcdef";
        System.out.println(reverse1(str));
        System.out.println(reverse2(str));
        System.out.println(reverse3(str));
        System.out.println();
    }

    private static String reverse3(String str) {
        String reverse="";
        for (int i=str.length()-1; i>=0; i--) {
            reverse+=str.substring(i,i+1);
        }
        return reverse;
    }

    private static String reverse2(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static String reverse1(String str) {
        return Arrays.stream(str.split("")).reduce("",(x,y)->y+x);
    }
}
