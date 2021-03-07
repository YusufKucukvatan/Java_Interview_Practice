package package2;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] nums={4,1,6,2,8,5};
        System.out.println(Arrays.toString(sorted(nums)));

    }

    private static int[] sorted(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int temp=0;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]<nums[i]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}
