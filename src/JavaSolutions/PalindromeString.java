package JavaSolutions;

public class PalindromeString {
    public static void main(String[] args) {
        String pal = "ey edip adanada pide ye";
        isPalindrome(pal);
    }

    private static void isPalindrome(String pal) {
        int a = 0;
        int b = pal.length()-1;
        boolean flag = true;

        for (int start=a, end=b; start< end; start++, end--) {
            if (pal.charAt(start) != pal.charAt(end)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("This word is a palindrome...");
        }else{
            System.err.println("This word is NOT a palindrome...");
        }
    }
}
