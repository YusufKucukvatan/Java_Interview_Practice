package package3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FreqSimple {
    public static void main(String[] args) {
        String str = "google";
        frequency(str);
    }

    private static void frequency(String str) {
        String[] arr = str.split("");
        Map<String, Integer> map = new HashMap<>();

        for (String each : arr) {
            if(!map.containsKey(each)){
                map.put(each,1);
            }
            else{
                map.put(each, map.get(each)+1);
            }
        }
        for (Map.Entry each : map.entrySet()) {
            System.out.println(each.getKey()+" : "+each.getValue());
        }


    }
}
