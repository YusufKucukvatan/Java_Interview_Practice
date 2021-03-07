package package1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

interface StringOperation<T,E>{
    T function(E e);
}

public class RemoveDupWithStream {
    public static void main(String[] args) {
        String str="AAABBBBBCCCCCCCDDD";
        String str2="AAABBBBBCCCCCCCDDD";
        System.out.println(removeDup.function(str));
        System.out.println(unique.function(str2));

    }

    public static StringOperation<String, String> removeDup=str->{
        return Arrays.stream(str.split(""))
                     .distinct()
                     .reduce("",(x,y)->x+y);
                    //.collect(Collectors.joining()); ==> we can use collect or reduce...
    };

    public static StringOperation<String, String> unique=str->{
      String[] strArray=str.replaceAll("\\s+","").trim().split("");
      Map<String, Integer> mapping=new HashMap<>();
      for(String each : strArray){
          if(mapping.containsKey(each)){
              mapping.put(each,1);
          }else{
              mapping.put(each,mapping.get(each)+1);
          }
      }
      return mapping.entrySet().stream()
              .filter(x->x.getValue()==1)
              .map(x->x.getKey())
              .collect(Collectors.joining());
    };

}
