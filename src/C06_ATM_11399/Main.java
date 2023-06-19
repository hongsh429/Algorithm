package C06_ATM_11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token1 = new StringTokenizer(br.readLine());

        StringTokenizer token2 = new StringTokenizer(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        while (token2.hasMoreTokens()) {
            int input = Integer.parseInt(token2.nextToken());
            pq.add(input);
        }

//        4 3 3 2 1
//        1 1+2 1+2+3 1+2+3+3 1+2+3+3+4
//        1  3   6
//
        int sum = 0;
        int initSize = pq.size();
        for (int i = 0; i < initSize; i++) {
            int temp = pq.peek();
            int num = temp * (pq.size());
            pq.poll();
            sum += num;
        }
        System.out.println(sum);
    }
}
