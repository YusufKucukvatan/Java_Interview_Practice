package JavaSolutions;

import java.util.ArrayList;
import java.util.List;

public class PalindormeLongest {
    public static void main(String[] args) {
        String str = "aya yayay elle ey_edip_adanada_pide_ye";
        System.out.println(longestPalindrome(str));
        System.out.println(isPalindrome("adada"));
    }

    public static String longestPalindrome(String str) {
        List<String> list = new ArrayList<>();
        String result = "";

        int len = str.length();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-1-i; j++) {
                if (isPalindrome(str.substring(j, j + i + 2)))
                    list.add(str.substring(j, j + i + 2));
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
        int last = str.length() - 1;
        for (int i = 0; i <= last / 2; i++) {
            if (!(str.charAt(i) == str.charAt(last - i))) {
                return false;
            }
        }
        return true;
    }
}
