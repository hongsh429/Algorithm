package C05_요세푸스문제0_11866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> dq = new LinkedList<>();

        String[] row = reader.readLine().split(" ");
        int repeat = Integer.parseInt(row[0]);
        int step = Integer.parseInt(row[1]);

        sb.append("<");

        // queue 만들기 1 2 3 4 5 6 7
        for (int i = repeat; i >= 1; i--) {
            dq.push(i);
        }

        int tempStep = 0;

        // repeat 수만큼 반복
        for (int i = 1; i <= repeat; i++) {

            if(i == repeat){
                sb.append(dq.get(0));
                break;
            }

            tempStep += step - 1;
            if(tempStep < dq.size()){
                sb.append(dq.get(tempStep) + ", ");
                dq.remove(dq.get(tempStep));

            } else {
                tempStep = tempStep % dq.size();
                sb.append(dq.get(tempStep) + ", ");
                dq.remove(dq.get(tempStep));
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
