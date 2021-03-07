package package2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindUniqes {
    public static void main(String[] args) {
        uniques("aaabbcccdef");
    }

    private static void uniques(String str) {
        String[] arr = str.split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : arr) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        map.forEach((k, v) -> {
            if (v == 1) {
                System.out.print(k);
            }
        });
    }
}
