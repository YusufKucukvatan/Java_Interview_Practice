package JavaSolutions;

public class PalindromeString {
    public static void main(String[] args) {
        String pal = "ey edip adanada pide ye";
                //    01234567890123456789012
        int a = 0;
        int b = pal.length() - 1;
        boolean flag = true;

        for (int i=a; a < b; a++, b--) {
            if (pal.charAt(a) != pal.charAt(b)) {
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
