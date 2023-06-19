package P06_콜라츠추측;

public class Solution {
    public static void main(String[] args) {
        int solution = solution(626331);
        System.out.println("solution = " + solution);

    }

    public static int solution(int num) {
        int count = 0;
        long number = num;
        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
            }
            else number = number * 3 + 1;
            count ++;
            if (count == 501) {
                return -1;
            }
        }


        return count;
    }
}
