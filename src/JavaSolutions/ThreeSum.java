package JavaSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        // https://leetcode.com/problems/3sum/
        int[] arr = {-1,0,1,2,-1,-4,0};
        System.out.println("threeSum(arr) = " + threeSum(arr));
    }

    private static List threeSum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == 0) {
                        System.out.println(arr[i] + " * " + arr[j] + " * " + arr[k]);
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        result.add(list);
                    }
                }
            }
        }
        return result;
    }

}
