package JavaSolutions;

public class IntegerToWord {
    public static void main(String[] args) {
        int num = 7410;
        System.out.println("integerToWord(num) = " + integerToWord(num));
    }

    static String integerToWord(int num) {
        String[] ones = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if (num == 0) return "Zero";

        String result = "";
        if (num < 10) result = ones[num];
        else if (num < 20) result = teens[num -10];
        else if (num < 100) result = tens[num/10] + " " + integerToWord(num % 10);
        else if (num < 1_000) result = integerToWord(num/100) + " Hundred " +  integerToWord(num % 100);
        else if (num < 1_000_000) result = integerToWord(num/1_000) + " Thousand " +  integerToWord(num % 1_000);
        else if (num < 1_000_000_000) result = integerToWord(num/1_000_000) + " Million " +  integerToWord(num % 1_000_000);
        else result = integerToWord(num/1_000_000_000) + " Billion " + integerToWord(num % 1_000_000_000);
        return result.trim();
    }
}
