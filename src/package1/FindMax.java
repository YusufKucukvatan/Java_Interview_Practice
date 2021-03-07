package package1;

public class FindMax {
    public static void main(String[] args) {
        int[] nums={4,1,6,2,8,5};
        System.out.println(findMax(nums));
    }

    private static int findMax(int[] nums) {
        int max=Integer.MIN_VALUE;
        for (int num : nums) {
            if(num>max){
                max=num;
            }
        }
        return max;
    }
}
