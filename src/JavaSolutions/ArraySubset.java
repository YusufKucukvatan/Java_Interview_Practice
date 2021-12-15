package JavaSolutions;

public class ArraySubset
{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,4,2};
        System.out.println("isSubset(arr1, arr2) = " + isSubset(arr1, arr2));
    }

    static boolean isSubset(int arr1[], int arr2[])
    {
        if (arr1.length==0 || arr2.length == 0 || arr1.length<arr2.length){
            return false;
        }
        for (int subset : arr2) {
            int count = 0;
            for (int set : arr1) {
                if (subset == set) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        return true;
    }
}
