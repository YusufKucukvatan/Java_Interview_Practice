package JavaSolutions;

public class FrequencyWithNestedLoop {
    public static void main(String[] args) {
        String str = "google";
        System.out.println(freq(str));
    }

    static String freq(String str){
        int count;
        for (int i = 0; i < str.length(); i++) {
            count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (count == 1) {
                return str.substring(i, i + 1);
            }
        }
        return "There is no unique char in string";
    }
}
