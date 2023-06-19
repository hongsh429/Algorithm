package C08_다리놓기_1010;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(br.readLine());

        for (int i = 0; i < rows; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(token.nextToken());
            int right = Integer.parseInt(token.nextToken());

            BigInteger upper = new BigInteger("1");
            BigInteger down = new BigInteger("1");
            for (long j = right; j >(right - left); j--) {
                upper = upper.multiply(BigInteger.valueOf(j));
            }
            for (long k = 1; k <= left ; k++) {
                down = down.multiply(BigInteger.valueOf(k));
            }

            System.out.println(upper.divide(down));

        }

    }
}
