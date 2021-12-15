package JavaSolutions;

public class ReverseHelloWorld {
    public static void main(String[] args) {
        // https://leetcode.com/problems/reverse-only-letters/
        String str = "hello world";
        System.out.println("reverse(str) = " + reverse(str));
    }

    static String reverse(String str) {
        String result = "";
        String[] arr = str.split(" ");
        for (String each : arr) {
            result += new StringBuilder(each).reverse() + " ";
        }
        return result.trim();
    }

    ////// ****************************************  ////////

    static String reverse2(String str) {
        String result = "";
        String[] arr = str.split(" ");
        for (String each : arr) {
            for (int i = each.length()-1; i >= 0 ; i--) {
                result += each.charAt(i);
            }
            result += " ";
        }
        return result.trim();
    }
}
