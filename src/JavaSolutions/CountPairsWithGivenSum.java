package JavaSolutions;

import java.util.Arrays;

public class CountPairsWithGivenSum
{
    public static void main(String[] args) {
        // Return number of possibilities which two elements has sum of target
        // 2+7=9, 5+4=9 -> return 2
        int[] nums1 = {2,7,11,5,15,4};
        int target1 = 9;
        int[] nums2 = {1,5,7,-1,5};
        int target2 = 6;
        int[] nums3 = {10,12,10,15,-1,7,6,5,4,2,1,1,1};
        int target3 = 11;
        System.out.println("twoSum(nums, target) - 1 = " + twoSum(nums1, target1));
        System.out.println("twoSum(nums, target) - 2 = " + twoSum(nums2, target2));
        System.out.println("twoSum(nums, target) - 3 = " + twoSum(nums3, target3));
    }

    static int twoSum(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }
}
