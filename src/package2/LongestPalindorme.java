package package2;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindorme {
    public static void main(String[] args) {
        String str = "aya yayay elle abcdefedcba";
        System.out.println(longestPalindrome(str));
    }

    public static String longestPalindrome(String Palin) {
        List<String> list = new ArrayList<>();
        String result = "";

        int len = Palin.length();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (isPalindrome(Palin.substring(j, j + i + 2)))
                    list.add(Palin.substring(j, j + i + 2));
            }
        }
        int longest = 0;
        for (String each : list) {
            if (longest < each.length()) {
                longest = each.length();
                result = each;
            }
        }
        return result;
    }
    private static boolean isPalindrome(String str) {
        int len = str.length() - 1;
        boolean pal = true;
        for (int i = 0; i <= len / 2; i++) {
            if (str.charAt(i) == str.charAt(len - i)) {

            } else {
                pal = false;
            }
        }
        return pal;
    }
}
