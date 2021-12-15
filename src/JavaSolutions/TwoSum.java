package JavaSolutions;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums1 = {2,3,11,7,6,5,15,4,7};
        int target1 = 9;
        System.out.println("twoSum(nums, target) - 1 = " + Arrays.toString(twoSum(nums1, target1)));

    }

    static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
