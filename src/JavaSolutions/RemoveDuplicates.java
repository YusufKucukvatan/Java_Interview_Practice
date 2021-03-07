package JavaSolutions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(remove("google"));
    }

    private static String remove(String str) {
        String remove="";
        for(int i=0; i<str.length(); i++){
            if(!remove.contains(""+str.charAt(i))){
                remove+=str.charAt(i);
            }
        }
        return remove;
    }
}
