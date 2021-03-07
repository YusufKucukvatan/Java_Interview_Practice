package package1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String str = "google";
        System.out.println(freq(str));
        System.out.println(freq2(str));
    }
    //FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
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
    static String freq2(String str){
        int count;
        for (int i = 0; i < str.length(); i++) {
            count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (count == 1) {
                return str.substring(i, i + 1);
            }
        }
        return "There is no unique char in string";
    }
}
