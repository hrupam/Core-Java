package StringOps;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Parser {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Deque<Character> stack = new ArrayDeque<>();

        outer:
        while (sc.hasNext()) {
            stack.clear();
            String input = sc.next();
            //Complete the code
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == '(' || c == '{' || c == '[')
                    stack.offerFirst(c);
                else {
                    try {
                        char top = stack.peekFirst();

                        if ((top == '(' && c == ')') || (top == '{' && c == '}') || (top == '[' && c == ']'))
                            stack.pollFirst();
                        else {
                            System.out.println("false");
                            continue outer;
                        }

                    } catch (Exception e) {
                        System.out.println("false");
                        continue outer;
                    }

                }
            }
            if (stack.size() == 0) {
                System.out.println("true");
                // continue outer;
            } else {
                System.out.println("false");
                // continue outer;
            }
        }
    }
}




