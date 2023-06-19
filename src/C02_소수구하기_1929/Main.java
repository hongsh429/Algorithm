package C02_소수구하기_1929;

import java.io.*;

public class Main {

    public static boolean[] getPrime() {
        int num = 1000000;

        boolean[] arr = new boolean[num + 1];

        // 1은 소수 아님
        arr[1] = true;

        for (int i = 2; i * i < arr.length; i++) {

            // false = 소수
            if (!arr[i]) {
                for (int j = i * i; j < arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) throws IOException {

        boolean[] arr = getPrime();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nums = reader.readLine();

        int start = Integer.parseInt(nums.split(" ")[0]);
        int end = Integer.parseInt(nums.split(" ")[1]);

        for (int i = start; i <= end; i++) {
            if (!arr[i]) {
                bw.write("" + i);
                bw.newLine();
                bw.flush();
            }
        }
        bw.close();
        reader.close();
    }
}
