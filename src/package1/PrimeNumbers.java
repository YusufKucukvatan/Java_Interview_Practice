package package1;

public class PrimeNumbers {

    private static boolean primeNumber(int num) {
        boolean flag=true;
        if(num<=1) {
            flag=false;
        }
        else{
            for(int i=2; i<num;i++){
                if(num%i==0){
                    flag=false;
                }
            }
        }
        return flag;
    }

}
