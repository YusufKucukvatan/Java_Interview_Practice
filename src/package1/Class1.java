package package1;

import java.util.ArrayList;
import java.util.List;

public class Class1 {
    public static void main(String[] args) {
     
        System.out.println(betterCompression("z5000z1000g20")); //a13b7c56d4
    }

    public static String betterCompression(String s){
        String result="";
        char[] arr=s.toCharArray();
        List<Object> list = new ArrayList<>();
        String tempString;
        for(int i=0; i<arr.length; i++){
            if (Character.isLetter(arr[i])){
                list.add(arr[i]);
                tempString="";
                for (int j=i+1; j<arr.length; j++){
                    if(Character.isDigit(arr[j])){
                        tempString+=arr[j];
                    }else {
                        break;
                    }
                }
                list.add(Integer.parseInt(tempString));
            }
            else {
                continue;
            }
        }
        List<Object> list2 = new ArrayList<>();
        int tempNum = 0;
        for (int i=0; i<list.size()-2; i+=2){
            for (int j=i+2; j<list.size(); j+=2){
                if(list.get(i).equals(list.get(j))){
                    tempNum=(Integer)list.get(i+1)+(Integer)list.get(j+1);
                    list2.add(list.get(i));
                    list2.add(tempNum);
                }
            }
        }
        for (int i=0; i<list.size(); i+=2){
            if (!list2.contains(list.get(i))){
                list2.add(list.get(i));
                list2.add(list.get(i+1));
            }
        }
        for (int i=0; i<list2.size()-2; i+=2){
            for (int j=i+2; j<list2.size(); j+=2){
                if ((list2.get(i).toString().compareTo(list2.get(j).toString())>0)){
                    Object temp1=list2.get(i);
                    Object temp2=list2.get(i+1);
                    list2.set(i,list2.get(j));
                    list2.set(i+1,list2.get(j+1));
                    list2.set(j,temp1);
                    list2.set(j,temp2);
                }
            }
        }
        for (int i=0; i<list2.size();i++) {
            result += list2.get(i);
        }
        return result;
    }
}
