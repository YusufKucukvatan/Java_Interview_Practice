package JavaSolutions;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4, 5, -3};
        int target = 1;
        System.out.println("threeSumClosest(nums, target) = " + threeSumClosest(nums, target));
    }
    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        // {-4, -3, -1, 1, 2, 5}
        int finalDiff =  Integer.MAX_VALUE;
        int result = 0;

        if(nums.length < 3) return result;

        for(int i = 0; i < nums.length; i++) {
            int head = i + 1;
            int tail = nums.length - 1;

            while (head < tail)
            {
                int sum = nums[i] + nums[head] + nums[tail];

                int tempDiff = sum - target;
                tempDiff = (tempDiff < 0) ? -tempDiff : tempDiff;

                if (tempDiff == 0) return target;
                if (tempDiff < finalDiff) {
                    finalDiff = tempDiff;
                    result = sum;
                }
                if (sum > target) tail--;
                if (sum < target) head++;
            }

//            skip the next same elements in the array
//            while(nums[i+1] == nums[i] && i < nums.length-1){
//                i++;
//            }
        }
        return result;
    }
}
