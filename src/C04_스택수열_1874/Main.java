package C04_스택수열_1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int num = Integer.parseInt(bf.readLine());
        int temp = 0;  //4

        for(int i =1; i <= num; i++){
            int input = Integer.parseInt(bf.readLine());//4

            if(input > temp){
                for(int j=temp + 1; j <=input; j++){
                    stack.push(j);//1 2 3 4
                    sb.append("+").append("\n");
                }
                temp = input;
            } else if(stack.peek() != input){
                System.out.println("NO");
                return;
            }
            stack.pop();//1 2 3
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}
