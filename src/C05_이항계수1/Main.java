package C05_이항계수1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int last = sc.nextInt();

        int a = 1;
        int b = 1;
        int result;

        for (int i = first; i > first - last; i--) {
            a *= i;
        }
        for (int j = 1; j <= last; j++) {
            b *= j;

        }
        result = a/b;
        System.out.println(result);


    }
}
