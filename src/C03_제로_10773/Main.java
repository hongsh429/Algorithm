package C03_제로_10773;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        // 받을 숫자 갯수
        int rows = Integer.parseInt(reader.readLine());

        // rows만큼 반복
        for (int i = 0; i < rows; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (num == 0) {
                stack.pop();
                continue;
            }
            stack.push(num);
        }
        int sum = 0;
        for(int a : stack){
            sum+=a;
        }
        System.out.println(sum);
    }
}
