package P04_정수제곱근판별;

public class Solution {
    public static void main(String[] args) {
        long solution = solution(169);
        System.out.println("solution = " + solution);
        int a = 10;
        int b = 10;
        int check = (a > b) ? 1 : (a == b) ? 2 : 3;
    }

    public static long solution(long n) {
        long answer = 0;
        int check = 0;
        check = (n % Math.sqrt(n) == 0) ? 1 : 2;
        if (check == 1) {
            answer = (long)((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
        } else answer = -1;
        return answer;
    }
}
