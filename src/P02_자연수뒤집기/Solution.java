package P02_자연수뒤집기;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        long n = 12345;
        int[] solution = solution(n);
        System.out.println(Arrays.toString(solution));

    }

    public static int[] solution(long n) {
        String[] numberArray = (n + "").split("");
        int[] answer = new int[numberArray.length];

        for (int i = numberArray.length - 1; i >= 0 ; i--) {
            answer[numberArray.length -1 - i] = Integer.parseInt(numberArray[i]);
        }
        return answer;
    }
}
