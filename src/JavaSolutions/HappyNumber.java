package JavaSolutions;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        // https://leetcode.com/problems/happy-number/
        int num = 239;
        System.out.println("isHappy = " + isHappy(num));
    }

    static boolean isHappy(int num) {
        Set<Integer> set = new HashSet<>();
        while (!set.contains(num)) {
            set.add(num);
            int sum = 0;
            while (num > 0) {
                sum += (num%10) * (num%10);
                num /= 10;
            }
            System.out.println("Sum is: " + sum);
            if (sum == 1) {
                return true;
            } else {
                num = sum;
            }
        }
        return false;
    }
}
