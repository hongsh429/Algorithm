package P03_정수내림차순배치;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        long solution = solution(118372);
        System.out.println("solution = " + solution);
    }

    public static long solution(long n) {

        // 118372
        String[] splitNum = (n + "").split("");

        // "1", "8"
        // 1, 8 >> (a, b) -> a - b // b - a
                                        /* comparator 함수형 인터페이스의 람다식 */
        // Arrays.sort(splitNum, (a, b) -> Integer.parseInt(b) - Integer.parseInt(a));
        Arrays.sort(splitNum, Collections.reverseOrder());
        String result = "";
        for (int i = 0; i < splitNum.length; i++) {
            result += splitNum[i];
        }
        return Long.parseLong(result);
    }
}
