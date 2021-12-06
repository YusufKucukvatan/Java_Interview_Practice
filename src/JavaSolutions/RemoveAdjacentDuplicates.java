package JavaSolutions;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String str = "azxaxzyyzyzzyx";
        System.out.println("removeAdjacent(str) = " + removeAdjacent(str));
    }
    static String removeAdjacent(String str){
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (stack.size()==0){
                stack.push(ch);
            } else if (ch == stack.peek()) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        String result = "";
        for (Character character : stack) {
            result += character;
        }
        return result;
    }
}

