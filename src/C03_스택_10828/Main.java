package C03_스택_10828;


import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int row = Integer.parseInt(reader.readLine());
        Stack<Integer> stack = new Stack<>();

        // 반복
        for (int i = 0; i < row; i++) {
            String[] two = reader.readLine().split(" ");
            String command = two[0];

            int num;

            switch (command) {
                case "push":
                    num = Integer.parseInt(two[1]);
                    stack.push(num);
                    break;
                case "pop":
                    if (stack.empty()) System.out.println(-1);
                     else System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if (stack.empty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "top":
                    if (stack.empty()) System.out.println(-1);
                    else System.out.println(stack.peek());
                default:
                    break;
            }
        }

    }
}
