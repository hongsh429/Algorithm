package C08_평범한배낭_12865;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[][] arr = new int[10][20];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                arr[i][j] = i + j;
            }
        }
    }
}
