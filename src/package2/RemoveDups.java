package package2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDups {
    public static void main(String[] args) {
        System.out.println(remove1("kucukvatan"));
        System.out.println(remove2("kucukvatan"));
    }

    private static String remove1(String str) {
        String remove="";
        for(int i=0; i<str.length(); i++){
            if(!remove.contains(str.substring(i,i+1))){
                remove+=str.substring(i,i+1);
            }
        }
        return remove;
    }

    private static String remove2(String str) {
        return Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
    }
}
