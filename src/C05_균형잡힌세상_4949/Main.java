package C05_균형잡힌세상_4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // () [] 섞인 문자열
        // 토큰 단위 검사 필요함
        // 한토큰에서 문자열을 돌면서 () [] 체크
        while (true) {
            Stack<Character> stack = new Stack<>();
            String senten = reader.readLine();
            boolean check = true;

            // 종료 조건
            if (senten.charAt(0) == '.' && senten.length() == 1) {
                break;
            }

            // 한문장에서 받은 토큰이 끝날 때까지 반복
            for (int i = 0; i < senten.length(); i++) {
                // stack 넣기
//                for (int i = 0; i < tempWord.length(); i++) {
                char temp = senten.charAt(i);
                if (temp == ')') {
                    if (stack.isEmpty()) {
                        check = false;
                        break;
                    } else {
                        if (stack.peek() == '(') stack.pop();
                        else stack.push(temp);
                    }
                } else if (temp == '(') stack.push(temp);

                if (temp == ']') {
                    if (stack.isEmpty()) {
                        check = false;
                        break;
                    } else {
                        if (stack.peek() == '[') stack.pop();
                        else stack.push(temp);
                    }
                } else if (temp == '[') stack.push(temp);
            }

            // 출력 결정 조건
            if (stack.isEmpty()) {
                // check=false이거나,  다 지워져서 왔거나
                if (!check) System.out.println("no");
                else System.out.println("yes");
            } else System.out.println("no");


        }
    }
}
