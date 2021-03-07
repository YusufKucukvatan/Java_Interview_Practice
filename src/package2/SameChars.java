package package2;

public class SameChars {
    public static void main(String[] args) {
        same("abcc","cab");
    }

    private static void same(String str1, String str2) {
        boolean flag=true;
        for(int i=0; i<str1.length(); i++){
            for(int j=0; j<str2.length(); j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    str1.replace(""+str1.charAt(i),"");
                    str2.replace(""+str1.charAt(j),"");
                    flag=true;
                    break;
                }else{
                    flag=false;
                }
            }
            if(flag==false){
                System.err.println("not same characters");
                break;
            }
        }
        if(flag==true){
            System.out.println("Yes same characters...");
        }
    }
}
