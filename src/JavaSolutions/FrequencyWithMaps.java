package JavaSolutions;

import java.util.*;

public class FrequencyWithMaps {
    public static void main(String[] args) {
        String str = "google";
        freq(str);
    }

    static void freq(String str){
        String[] arr=str.split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : arr) {
            if(!map.containsKey(s)){
                map.put(s,1);
            }else {
                map.put(s,map.get(s)+1);
            }
        }
        for (Map.Entry<String, Integer> each : map.entrySet()){
            System.out.println(each.getKey() + " occures " + each.getValue() + " times...");
        }
        map.forEach((k,v)->{
            System.out.println(k + " occures " + v + " times...");
        });
    }
}
