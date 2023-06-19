package C08_피보나치함수_1003;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int rows = Integer.parseInt(br.readLine());

        for (int i = 0; i < rows; i++) {
            int num = Integer.parseInt(br.readLine());
//            sb.append(fibo(num) + "\n");
            bw.write(fibo(num));
            bw.newLine();
        }
//        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
        bw.close();

    }

    public static String[] arr = new String[41];
    public static String fibo(int n) {

        // 초기화
        arr[0] = "1 0";
        arr[1] = "0 1";

        for (int i = 2; i <= n; i++) {
            int n2_zeroCnt = Integer.parseInt(arr[i - 2].split(" ")[0]);
            int n2_oneCnt = Integer.parseInt(arr[i - 2].split(" ")[1]);

            int n1_zeroCnt = Integer.parseInt(arr[i - 1].split(" ")[0]);
            int n1_oneCnt = Integer.parseInt(arr[i - 1].split(" ")[1]);

            int n_zeroCnt = n2_zeroCnt + n1_zeroCnt;
            int n_oneCnt = n2_oneCnt + n1_oneCnt;

            arr[i] = n_zeroCnt + " " + n_oneCnt;
        }

        return arr[n];
    }
}
