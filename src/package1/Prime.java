package package1;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(37));
    }

    private static boolean isPrime(int num) {
        boolean flag=true;
        if(num<2){
            flag=false;
        }else{
            for (int i = 2; i < num; i++) {
                if(num%i==0){
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }
}
