package JavaSolutions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindUniquesWithMap {
    public static void main(String[] args) {
        System.out.println(uniques("aaabcccdef"));
    }

    private static List<String> uniques(String str) {
        List<String> result = new ArrayList<>();
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
                result.add(k);
            }
        });
        return result;
    }
}
