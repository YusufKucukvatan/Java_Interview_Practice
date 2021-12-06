package JavaSolutions;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 7, 9 };
        int[] arr2 = { 4, 8 };
        System.out.println("Arrays.toString(merge(arr1, arr2)) = " + Arrays.toString(merge(arr1, arr2)));
    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int length1 = arr1.length;
        int length2 = arr2.length;

        int[] merged = new int[length1 + length2];

        int i, j, m;
        i = j = m = 0;

        while (i < length1 && j < length2) {
            if (arr1[i] < arr2[j]) {
                merged[m++] = arr1[i++];
            } else {
                merged[m++] = arr2[j++];
            }
        }

        // Store remaining elements of first array if length is greater than arr2
        while (i < length1) {
            merged[m++] = arr1[i++];
        }
        // Store remaining elements of second array if length is greater than arr1
        while (j < length2) {
            merged[m++] = arr2[j++];
        }

        return merged;
    }
}
