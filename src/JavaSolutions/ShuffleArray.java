package JavaSolutions;

import java.util.Arrays;
import java.util.Map;

public class ShuffleArray {
    public static void main(String[] args) {
        String[] arr = {"song1","song2", "song3", "song4", "song5", "song6"};
        System.out.println("Arrays.toString(shuffle(arr)) = " + Arrays.toString(shuffle(arr)));
    }

    static String[] shuffle(String[] arr) {
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            int j = (int)(Math.random()*4);
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
