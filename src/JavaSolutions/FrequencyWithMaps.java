package JavaSolutions;

import java.util.*;

public class FrequencyWithMaps {
    public static void main(String[] args) {
        String str = "google";
        System.out.println(freq(str));
    }

    static String freq(String str){
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
            if(each.getValue()==1){
                return each.getKey();
            }
        }
        return "There is no unique char in string";
    }
}
