package JavaSolutions;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicatesMap {
    public static void main(String[] args) {
        String str = "aaabbbcccabcdef";
        freq(str);
    }

    private static void freq(String str) {
        String[] arr = str.split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : arr) {
            if(!map.containsKey(s)){
                map.put(s,1);
            }else {
                map.put(s,map.get(s)+1);
            }
        }
        map.forEach((word, frequency) -> {
            System.out.print(word);
        });
    }
}
