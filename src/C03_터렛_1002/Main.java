package C03_터렛_1002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            double distance = ((Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))) * 10.0) / 10;
            double tot = r1 + r2;


            // 좌표가 동일
            if ((x1 == x2) && (y1 == y2)) {
                // 반지름이 같은 경우,
                if (r1 == r2) System.out.println(-1);
                else System.out.println(0);

            } else {
                // 거리 == 반지름합
                if (distance == tot) System.out.println(1);
                else if (distance > tot) System.out.println(0);
                else {
                    if(Math.abs(r1 - r2) == distance) System.out.println(1);
                    else if(Math.abs(r1 - r2) < distance) System.out.println(2);
                    else System.out.println(0);

                }
            }


        }
    }
}
