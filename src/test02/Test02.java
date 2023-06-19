package test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test02 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int range = 123456;

        boolean[] prime_number = new boolean[(range * 2) + 1];

        prime_number[0] = true;
        prime_number[1] = true;

        for (int i = 2; i * i <= (range * 2) + 1; i++) {
            if (!prime_number[i]) {
                for (int j = i * i; j <= (range * 2) + 1; j += i) {
                    prime_number[j] = true;
                }
            }
        }

        /*

        for(int i=1; i<= range;i ++){
        if(!prime_number[i]){
        System.out.println(i);
        }
        }

        */
        for (; ; ) {
            int num = Integer.parseInt(bf.readLine());
            if (num == 0) {
                break;
            }
            int cnt = 0;
            for (int i = num + 1; i <= num * 2; i++) {
                if (!prime_number[i]) {
                    cnt += 1;
                    sb.append(cnt).append('\n');
                }
            }
            System.out.println(cnt);

        }


    }
}
