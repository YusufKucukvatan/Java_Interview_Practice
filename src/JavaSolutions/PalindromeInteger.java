package JavaSolutions;

public class PalindromeInteger {
    public static void main(String[] args) {
        palindrome(1221);
    }

    public static void palindrome(int num){
        int temp=num;
        int reverse=0;

        while (temp>0){
            reverse*=10;
            reverse+=temp%10;
            temp/=10;
        }

        if(reverse==num){
            System.out.println("This number is a palindrome");
        }else {
            System.out.println("This number is not a palindrome");
        }
    }
}
