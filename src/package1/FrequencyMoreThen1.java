package package1;

import java.util.*;

public class FrequencyMoreThen1 {

    public static void main(String[] args) {

        String word = "AXXBCCAYBABCBAA";
        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (!map.containsKey(word.charAt(i))) {
                map.put(word.charAt(i), 1);
            } else {
                map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
            }
        }

        map.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " " + v);
            }
        });

    }
}








/*





 */