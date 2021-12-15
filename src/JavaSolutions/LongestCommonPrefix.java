package JavaSolutions;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        // https://leetcode.com/problems/longest-common-prefix/
        String[] arr = {"flower", "flow", "floght"};
        System.out.println("longest(arr) = " + longest(arr));
    }

    private static String longest(String[] arr) {
        String result = "";
        int shortestLength = Integer.MAX_VALUE;
        String shortest = "";
        for (String each : arr) {
            if (each.length()<shortestLength) {
                shortestLength = each.length();
                shortest = each;
            }
        }
        for (int i = 0; i<shortestLength; i++) {
            for (int j=0; j < arr.length; j++) {
                if (shortest.charAt(i) != arr[j].charAt(i)) {
                        return result;
                }
            }
            result += shortest.charAt(i);
        }
        return result;
    }
}
