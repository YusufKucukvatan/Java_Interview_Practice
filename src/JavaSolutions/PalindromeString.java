package JavaSolutions;

public class PalindromeString {
    public static void main(String[] args) {
        String pal = "ey edip adanada pide ye";
        System.out.println("isPalindrome(pal) = " + isPalindrome(pal));
    }

    private static boolean isPalindrome(String pal) {
        boolean flag = true;
        for (int start=0, end=pal.length()-1; start<end; start++, end--) {
            if (pal.charAt(start) != pal.charAt(end)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
