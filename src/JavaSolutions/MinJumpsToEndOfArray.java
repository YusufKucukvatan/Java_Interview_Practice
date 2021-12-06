package JavaSolutions;

public class MinJumpsToEndOfArray
{
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};  //-> should return 3
        int[] arr2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};  //-> should return 10
        System.out.println("minJump(arr) = " + minJump(arr1));
    }
    static int minJump(int[] arr) {
        int jumpCount = 1;
        for (int i = 0; i < arr.length;) {
            if (arr[i]>=arr.length-1-i) {
                return jumpCount;
            } else {
                i += arr[i];
            }
            jumpCount++;
        }
        return jumpCount;
    }
}
