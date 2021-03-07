package package2;

public class Hamza2 {


    public static void main(String[] args) {
        System.out.println(lottery(1,1,1)); //=>20
        System.out.println(lottery(1,2,2)); //=>10
        System.out.println(lottery(1,1,2)); //=>10
        System.out.println(lottery(1,2,1)); //=>10
        System.out.println(lottery(1,2,3)); //=>0
    }
    static int lottery(int a, int b, int c){
        if(a==b && a==c && b==c){
            return 20;
        }else if(a==b || a==c || b==c){
            return 10;
        }else{
            return 0;
        }
    }
}
