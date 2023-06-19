package C04_회전하는큐_1021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token1 = new StringTokenizer(br.readLine());
        LinkedList<Integer> q = new LinkedList<>();

        int numLength = Integer.parseInt(token1.nextToken());
        int pickCnt = Integer.parseInt(token1.nextToken());

        StringTokenizer token2 = new StringTokenizer(br.readLine());

        for (int i = 1; i <= numLength; i++) {
            q.add(i);
        }

        int count = 0;
        int midIndex;

        for (int i = 0; i < pickCnt; i++) {
            int num = Integer.parseInt(token2.nextToken());
            int numIndex = q.indexOf(num);

            // midIndex가 중요한 포인트
            // q 가 짝수개
            if (q.size() % 2 == 0) midIndex = q.size() / 2 - 1;
            // q 가 홀수개
            else midIndex = q.size() / 2;

            // 2번 규칙 : 왼쪽에서 빼서 오른쪽으로 넣기
            if (numIndex <= midIndex) {
                for (int j = 0; j < numIndex; j++) {
                    q.offerLast(q.pollFirst());
                    count++;
                }
                // 3번 규칙 : 오른쪽에서 빼서 왼쪽으로 넣기
            } else {
                for (int j = numIndex; j < q.size(); j++) {
                    q.offerFirst(q.pollLast());
                    count++;
                }
            }
            // 1번 작업
            q.pollFirst();

        }

        System.out.println(count);
    }
}
