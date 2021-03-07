package package2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstSingleChar {
    public static void main(String[] args) {
        System.out.println(function("google"));

    }

    static String function(String str){

        Map<String, Integer> map = new LinkedHashMap<>();
        for(String s : str.split("")){
            if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s, (map.get(s)+1));
            }
        }
        for(Map.Entry<String, Integer> each : map.entrySet()){
            if(each.getValue()==1){
                return each.getKey();
            }
        }
        return "There is no unique character";
    }
}



















