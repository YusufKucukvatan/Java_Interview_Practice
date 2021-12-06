package JavaSolutions;

import java.util.Stack;

public class ParenthesisBalance {
    public static void main(String[] args) {
        String str1 = "[]{}({[]})({{{{{[[[[[((((()))))]]]]]}}}}})";
        String str2 = "[](){[((((()))))]}";
        System.out.println("Solution with replaceAll: " + isBalancedReplaceAll(str1));
        System.out.println("Solution with stack: " + isBalancedStack(str1));
    }

    private static boolean isBalancedStack(String str) {
        if (null == str || ((str.length() % 2) != 0)) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray())
        {
            if (c=='(' || c=='{' || c=='['){
                stack.push(c);
            } else if (c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            } else if (c=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            } else if (c==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    private static boolean isBalancedReplaceAll(String str) {
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
