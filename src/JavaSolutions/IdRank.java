package JavaSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class IdRank {
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
        System.out.println("update(map) = " + update(map));

    }
    static Set<Integer> update(Map<Integer, Integer> map){
        Set<Integer> rankSet = new TreeSet<>(map.values());
        List<Integer> rankList = new ArrayList<>(rankSet);
        Collections.reverse(rankList);

        Set<Integer> result = new HashSet<>();
        Set<Integer> check = new HashSet<>();

        for (Map.Entry<Integer, Integer> each : map.entrySet()){
            int id = each.getKey();
            int rank = each.getValue();
            if (!check.contains(rank) && result.size() < 3 && (rank == rankList.get(0) || rank == rankList.get(1) || rank == rankList.get(2))){
                result.add(id);
            }
            check.add(rank);
        }
        return result;
    }
}
