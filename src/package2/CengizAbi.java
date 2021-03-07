package package2;

import java.util.LinkedHashMap;
import java.util.Map;

public class CengizAbi {
    public static void main(String[] args) {
        String str1 = "Yu1s3uf5";
        System.out.println(removeDigits(str1));

        String str2 = "if it is hot I will go to swimming pool tomorrow if it not I will stay home";
        freq(str2);

    }

    private static void freq(String str) {

        String[] arr = str.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String s : arr) {
            if(!map.containsKey(s)){
                map.put(s,1);
            }else {
                map.put(s,map.get(s)+1);
            }
        }

        map.forEach((number, frequency) -> {
            System.out.println(number + " - " + frequency);
        });

    }

    private static String removeDigits(String str) {
        String letters = "";
        for (String s : str.split("[0-9]")) {
            letters += s;
        }
        return letters;
    }
}
