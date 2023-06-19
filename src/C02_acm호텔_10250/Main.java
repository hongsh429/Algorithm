package C02_acm호텔_10250;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){

            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int tot1 = N / H + 1;   // 호수
            int tot2 = N % H;       // 층

            if (tot2 == 0) {
                tot2 = H;
                tot1--;
            }

            System.out.println(String.format("%d%02d", tot2, tot1));
        }

    }
}
