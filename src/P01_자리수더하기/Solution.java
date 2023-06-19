package P01_자리수더하기;

import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int solution = solution(123);
        System.out.println("solution = " + solution);
    }
    public static int solution(int n) {
        int answer = 0;

        String[] numString = (n + "").split("");
        for (int i = 0; i < numString.length; i++) {
            answer += Integer.parseInt(numString[i]);
        }

        return answer;

//        while (n > 0) {
//            answer += n % 10;
//            n /= 10;
//        }
    }
}