package JavaSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayThreeSubset
{
    public static void main(String[] args) {
        // Divide array to subsets which has a total of target value
        int[] arr1 = {1, 2, 4, 2, 3, 4};
        int[] arr2 = {0, 6, 3, 1, 2, 4, 5, 7, 7};
        int target1 = 4;
        int target2 = 7;
        System.out.println("divideArray(arr2, 7) = " + divideArray(arr1, target1));

    }

    static List<List<Integer>> divideArray(int[] arr, int target) {
        List<List<Integer>> finalList = new ArrayList();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int each : arr) {
            list.add(each);
            sum+=each;
        }

        if (sum % target != 0) {
            return null;
        }
        Collections.sort(list);

        int head = 0;
        int tail = list.size() - 1;

        while (head < tail) {
            List<Integer> subList = new ArrayList<>();
            if (list.get(tail) == target) {
                subList.add(list.get(tail));
                finalList.add(subList);
                tail--;
            } else {
                if ((list.get(tail) + list.get(head)) == target) {
                    subList.add(list.get(head));
                    subList.add(list.get(tail));
                    finalList.add(subList);
                    head++;
                    tail--;
                } else {
                    head++;
                }
            }
        }
        return finalList;
    }
}