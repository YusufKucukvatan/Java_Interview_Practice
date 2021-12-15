package JavaSolutions;

public class StringToIntegerAtoi
{
    public static void main(String[] args) {
        // https://leetcode.com/problems/string-to-integer-atoi/
        String str = "-91283472332 with words";
        System.out.println("atoi(str) = " + atoi(str));
    }

    static int atoi(String str) {
        int result = 0;
        String num = "";
        boolean isNegative = false;
        str = str.trim();

        if (str.charAt(0) == '-') {
            isNegative = true;
            str = str.substring(1);
        } else if (str.charAt(0) == '+') {
            str = str.substring(1);
        }

        if (!Character.isDigit(str.charAt(0))) {
            return 0;
        }

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);
            } else {
                break;
            }
        }

        try {
            result = (isNegative) ? -Integer.parseInt(num) : Integer.parseInt(num);
        } catch (Exception e) {
            result = (isNegative) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        return result;
    }
}
