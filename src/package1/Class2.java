package package1;

import java.util.*;

public class Class2 {
    public static void main(String[] args) {

        String str= "xyusufxx";
        int comp = str.substring(0,1).compareTo(str.substring(str.length()-1));
        if(comp==0){
            str=str.substring(1,str.length()-1);
        }
        System.out.println(str);

        String password = "Cne4G1z5y9a";
        String [] letters= password.split("[0-9]");
        System.out.println(Arrays.toString(letters));
        for (String each : letters){
            System.out.print(each);
        }
        System.out.println(" ");

        String[] nums = password.split("[A-z]");
        for (String each : nums){
            System.out.print(each);
        }
        System.out.println(" ");
        for (int i=0; i<password.length(); i++){
            if(password.substring(i,i+1).matches("[a-z]")){
                System.out.print(password.charAt(i));
            }
        }

        System.out.println(" ");

        List list = new ArrayList(Arrays.asList(1,2,3,4,5));
        List list2 = new ArrayList(Arrays.asList("Java",null,"Python",null, "Ruby"));
        System.out.println(list.contains(list2.get(3)));

        String str1 = "yusuf321";
        StringBuilder build = new StringBuilder(str1);
        build.reverse();
        System.out.println("build-1:"+build);
        build.deleteCharAt(0);
        build.setCharAt(0,'A');
        System.out.println("build-2:"+build);

//        String str = "I am yusuf happy and why not and why are you not happy and you should be";
//
//        Map<String, Integer> map = new TreeMap<>();
//        for (String each : str.split(" ")) {
//            if (!map.containsKey(each)){
//                map.put(each, 1);
//            }else{
//                map.put(each,map.get(each)+1);
//            }
//        }
//
//        map.forEach((key,value)->{
//                System.out.println(key+value);
//        });
////        System.out.println(map);
////        System.out.println(map.keySet());
////        String result="";
////        for (int i=0; i<str.length(); i++){
////            if(!result.contains(str.substring(i,i+1))){
////                result+=str.charAt(i);
////            }
////        }
////        System.out.println(result);
//

    }
}
