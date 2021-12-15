package JavaSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args)
    {
        // https://leetcode.com/problems/add-two-numbers/
        List<Integer> list1 = Arrays.asList(2,4,3);
        List<Integer> list2 = Arrays.asList(5,6,4);
        System.out.println("addTwoNumbers(list1, list2) = " + addTwoNumbers(list1, list2));
    }

    static List addTwoNumbers(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int sum1 =0;
        int sum2 =0;
        int sum;

        for (int i = list1.size()-1; i >= 0; i--) {
            sum1 *= 10;
            sum1 += list1.get(i);
        }

        for (int i = list2.size()-1; i >= 0; i--) {
            sum2 *= 10;
            sum2 += list2.get(i);
        }

        sum = sum1 + sum2;

        int lastDigit;
        while (sum>0) {
            lastDigit = sum % 10;
            result.add(lastDigit);
            sum = (sum - lastDigit) / 10;
        }
        return result;
    }
}
