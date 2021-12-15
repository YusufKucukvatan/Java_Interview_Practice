package JavaSolutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class IdRank {
    /*
    Write a method which return only three IDs from a map object which has greatest three values.
      input:
        map.put(1,14);
        map.put(2,10);
        map.put(3,11);
        map.put(4,10);
        map.put(5,12);
        map.put(10,11);
      output:
        [1,3,5] or [1,5,10]
    */
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,14);
        map.put(2,10);
        map.put(3,11);
        map.put(4,10);
        map.put(5,12);
        map.put(10,11);
        map.put(9,15);
        map.put(8,11);
        map.put(7,15);
        map.put(6,13);
        map.put(11,14);
        map.put(12,20);
        System.out.println("update(map) = " + threeGreatestId(map));

    }
    static Set<Integer> threeGreatestId(Map<Integer, Integer> map){
        // remove duplicates and sort them by using TreeSet
        Set<Integer> rankSet = new TreeSet<>(map.values());
        // add unique values to list and reverse the with Collections.sort()
        List<Integer> reversedRankList = new ArrayList<>(rankSet);
        Collections.reverse(reversedRankList);

        Set<Integer> result = new HashSet<>();
        Set<Integer> check = new HashSet<>();

        for (Map.Entry<Integer, Integer> each : map.entrySet()){
            int id = each.getKey();
            int rank = each.getValue();

            // !check.contains(rank) -> in order to prevent storing duplicate values into result
            // result.size() < 3 -> to return only three values
            if (!check.contains(rank) && result.size() < 3 && (rank == reversedRankList.get(0) || rank == reversedRankList.get(1) || rank == reversedRankList.get(2))){
                result.add(id);
            }

            // add rank for the next iteration to check if it is duplicate or not
            check.add(rank);
        }

        return result;
    }
}
