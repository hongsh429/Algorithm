package P05_작은수제거;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{12, 32, 6, 3, 234, 5623, 2});
        System.out.println("solution = " + Arrays.toString(solution));
    }

    public static int[] solution(int[] arr) {

        // 입력배열의 크기가 1일경우,
        if (arr.length == 1) {
            int[] answer = new int[]{-1};
            return answer;
        }

        // 제일 작은 요소 빼서 리턴
        int[] result = new int[arr.length - 1];

        Object[] array = Arrays.stream(arr)
                .sorted()
                .boxed().toArray();

        Arrays.sort(array, Collections.reverseOrder());

        for (int i = 0; i < result.length; i++) {
            result[i] = (int) array[i];
        }

        int[] result2 = new int[result.length];

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            // {1, 12, 32, 6, 3, 234, 5623, 6, 2}
            int num = arr[i];
            for (int j = 0; j < result.length; j++) {
                if( num == result[j]){
                    result2[k] = result[j];
                    k++;
                }
            }
        }
        return result2;
    }
}
