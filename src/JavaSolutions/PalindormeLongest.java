package JavaSolutions;

import java.util.ArrayList;
import java.util.List;

public class PalindormeLongest {
    public static void main(String[] args) {
        // https://leetcode.com/problems/longest-palindromic-substring/
        String str = "radax";
        System.out.println(longestPalindrome(str));
    }

    /*
    * r -> result = r
    * a
    * d
    * a
    * x
    * ra
    * ad
    * da
    * ax
    * rad
    * ada -> result = ada
    * dax
    * rada
    * adax
    * radax
    * */

    public static String longestPalindrome(String str) {
        if (isPalindrome(str)) {
            return str;
        }
        String result = "";
        int longest = 0;
        int l = str.length();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l-i; j++) {
                int head = j;
                int tail = j+i+1;
                String word = str.substring(head, tail);
                System.out.println(word);
                if (isPalindrome(word) && word.length()>longest) {
                    result = word;
                }
            }
        }
        return result;
    }

    private static boolean isPalindrome(String str) {
        int head=0;
        int tail=str.length()-1;
        while (head<tail) {
            if (str.charAt(head) != str.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
}
