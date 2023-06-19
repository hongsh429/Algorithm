package C07_분해합_2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());

        for (int i = 10; i <= 1000000; i++) {

            String[] tot_arr = (""+i).split("");
            //198 + 1 + 9 + 8
            int tot=i;
            for (int j = 0; j < tot_arr.length; j++) {
                tot += Integer.parseInt(tot_arr[j]);
            }

            if(tot == input){
                System.out.println(tot);
                return;
            }

        }
        System.out.println("0");


    }
}

