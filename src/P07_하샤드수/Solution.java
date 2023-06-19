package P07_하샤드수;

public class Solution {
    public static void main(String[] args) {
        boolean solution = solution(140);
        System.out.println("solution = " + solution);
    }

    public static boolean solution(int x) {
        boolean answer = true; // 알아서 false..초기화
        int sum = 0;
        int num = x;
        while (num > 0) {
            //종료 조건
            sum += num % 10;
            num /= 10;
        }
        answer = (x % sum == 0);
        return answer;
    }
}
