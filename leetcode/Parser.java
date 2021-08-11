package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Parser {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')
                stack.offerFirst(c);
            else {
                try {
                    char top = stack.peekFirst();
                    if ((top == '(' && c == ')') || (top == '{' && c == '}') || (top == '[' && c == ']'))
                        stack.pollFirst();
                    else
                        return false;
                } catch (Exception e) {
                    return false;
                }
            }
        }
        if (stack.size() != 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("({[})"));
    }
}
