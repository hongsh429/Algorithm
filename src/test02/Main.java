package test02;

import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static boolean[] getSosu() {
        int num = 123456;

        boolean[] arr = new boolean[num * 2 + 1];
        arr[1] = true;

        // 소수인 것들만 false;
        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j < arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        boolean[] arr = getSosu();
        while (true) {
            int num = sc.nextInt();
            int count = 0;

            if (num == 0) break;

            for (int i = num + 1; i <= 2 * num; i++) {
                if (arr[i] == false) count++;
            }
            System.out.println(count);
        }

        sc.close();
    }
}
