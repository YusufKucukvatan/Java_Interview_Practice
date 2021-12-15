package JavaSolutions;

import java.util.Stack;

public class ParenthesisBalance {
    public static void main(String[] args) {
        // https://leetcode.com/problems/valid-parentheses/
        String str1 = "({[]})()";
        System.out.println("Solution with stack: " + isBalancedWithStack(str1));
    }

    private static boolean isBalancedWithStack(String str) {
        if (((str.length() % 2) != 0) || str == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c=='(' || c=='{' || c=='['){
                stack.push(c);
            } else if (c==')' && stack.peek()=='('){
                stack.pop();
            } else if (c=='}' && stack.peek()=='{'){
                stack.pop();
            } else if (c==']' && stack.peek()=='['){
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }



    private static boolean isBalancedWithReplaceAll(String str) {

        if (null == str || ((str.length() % 2) != 0)) {
            return false;
        }

        while (str.contains("()") || str.contains("[]") || str.contains("{}")) {
            str = str.replaceAll("\\(\\)", "")
                     .replaceAll("\\[\\]", "")
                     .replaceAll("\\{\\}", "");
        }

        return str.length() == 0;
    }

}
