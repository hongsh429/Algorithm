package C02_FlymetotheAlphaCentauri_1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            String[] row = reader.readLine().split(" ");
            int start = Integer.parseInt(row[0]);
            int end = Integer.parseInt(row[1]);

            int distance = end - start;

            // 관계파악
            int root = (int) Math.sqrt(distance);

            if(root * root == distance) System.out.println(root * 2 - 1);
            else if((root * root + root )>= distance) System.out.println(root * 2);
            else System.out.println(root * 2 + 1);
        }

    }
}
