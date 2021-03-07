package package2;

public class Equifax {
    public static void main(String[] args) {
        String str = "xyusufx";
        System.out.println(removeFirstLast(str));
    }

    private static String removeFirstLast(String str) {

        String result;
        if(str.charAt(0)==str.charAt(str.length()-1)){
            str=str.substring(1,str.length()-1);
        }
        return str;

    }
}
