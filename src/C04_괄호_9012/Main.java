package C04_괄호_9012;


import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            String row = sc.next();
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < row.length(); j++) {

                if(row.charAt(j) == ')'){
                    if(stack.isEmpty()){
                        stack.push(row.charAt(j));
                    }else {
                        if(stack.peek() == '(') stack.pop();
                        else stack.push(row.charAt(j));
                    }
                }
                // '(' 일 때,
                else {
                    stack.push(row.charAt(j));
                }
            }
            //stack 확인
            if(stack.isEmpty()){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
