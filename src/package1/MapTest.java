package package1;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args){
        String str = "google";
        System.out.println(freq(str));
    }

    static String freq(String str){
        String result="";
        String[] arr = str.split("");
        Map<String, Integer> map = new LinkedHashMap<>();

        for(String s : arr){
            if(!map.containsKey(s)){
                map.put(s, 1);
            }else{
                map.put(s, (map.get(s)+1));
            }
        }
        map.forEach((key, value)->{
            System.out.print(key+value);
        });
        for(Map.Entry<String, Integer> each : map.entrySet()){
            result+=each.getKey() + each.getValue();
        }
        return result;
    }


}
