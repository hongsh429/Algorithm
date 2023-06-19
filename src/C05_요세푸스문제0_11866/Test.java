package C05_요세푸스문제0_11866;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("ㄱ");
        stack.push("ㄴ");
        stack.push("ㄷ");
        stack.push("ㄹ");

        System.out.println(stack.peek());
        System.out.println(stack.indexOf("ㄹ"));



    }
}
