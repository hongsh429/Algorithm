package C05_최대힙_11279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> reversePq = new PriorityQueue<>(Collections.reverseOrder());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int rows = Integer.parseInt(br.readLine());

        for (int i = 0; i < rows; i++) {
            int input = Integer.parseInt(br.readLine());

            if(input == 0){
                if(reversePq.isEmpty()) sb.append(input + "\n");
                else sb.append(reversePq.poll()+"\n");
            } else reversePq.add(input);
        }
        System.out.println(sb);
    }
}
