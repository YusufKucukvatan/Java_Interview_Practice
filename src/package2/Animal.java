package package2;

import java.util.Arrays;

public class Animal {
    public static void main(String[] args) {
        animal(144);
        int[] nums={3,4,5,6,7,8};
        System.out.println(Arrays.toString(substract(nums,6)));
        String str="(2+((3-1)/8))";
        System.out.println(parantesis(str));

    }

    private static boolean parantesis(String str) {
        int left=0;
        int right=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='('){
                left++;
            }
            if(str.charAt(i)==')'){
                right++;
            }
        }
        if (left==right){
            return true;
        } else {
          return false;
        }
    }

    static void animal(int n){
        if(n%32==0){
            System.out.println("ANIMAL");
        }else if (n%16==0){
            System.out.println("ANIM");
        }else if(n%8==0){
            System.out.println("AN");
        }

    }

    static int[] substract(int[] nums, int n){
        for (int i=0; i<nums.length; i++) {
            nums[i]-=n;
        }
        return nums;
    }
}
