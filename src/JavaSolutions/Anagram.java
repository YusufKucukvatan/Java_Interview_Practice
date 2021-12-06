package JavaSolutions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        System.out.println("isAnagram1(str1, str2) = " + isAnagram1(str1, str2));
        System.out.println("isAnagram2(str1, str2) = " + isAnagram2(str1, str2));
    }

    static boolean isAnagram1(String str1, String str2) {
        char[] ch1 = toLowerCase(str1).toCharArray();
        char[] ch2 = toLowerCase(str2).toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String ss = new String(ch1);
        String st = new String(ch2);
        return ss.equals(st);
    }

    static String toLowerCase(String str) {
        String lower = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (65 <= ch && ch <= 90) {
                ch = (char) ((ch + 32));
            }
            lower = lower + ch;
        }
        return lower;
    }


    static boolean isAnagram2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        Map<Character, Integer> map2 = new LinkedHashMap<>();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            if (!map1.containsKey(ch1[i])) {
                map1.put(ch1[i], 1);
            } else {
                map1.put(ch1[i], map1.get(ch1[i]) + 1);
            } if (!map2.containsKey(ch2[i])) {
                map2.put(ch2[i], 1);
            } else {
                map2.put(ch2[i], map2.get(ch2[i]) + 1);
            }
        }
        return map1.equals(map2);
    }
}