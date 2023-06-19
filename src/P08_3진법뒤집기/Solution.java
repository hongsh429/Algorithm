package P08_3진법뒤집기;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int solution = solution(125);
        System.out.println("solution = " + solution);
    }

    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        // 45 0
        // 15 0
        // 5  2
        // 1
        while (n >= 3) {
            list.add(n % 3);
            n /= 3;
        }
        list.add(n);
        System.out.println("list = " + list);
        /*3 2 1 0 */
        /* 27 9 3 1 */
        /* 1 2 0 0  ---> 0 0 2 1 --> 3 * 2 + 1 = 7 */

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * Math.pow(3, list.size() - 1 - i);
        }

        // 1 2 0 0 >>> 0 0 2 1
        // 1 3 3^2 3^3
        return answer;
    }
}
