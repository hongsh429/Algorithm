package C06_최소공배수_1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token1 = new StringTokenizer(br.readLine());

        int rowNum = Integer.parseInt(token1.nextToken());

        for (int i = 0; i < rowNum; i++) {
//            String[] nums = br.readLine().split(" ");
//            int first = Integer.parseInt(nums[0]);
//            int second = Integer.parseInt(nums[1]);

            StringTokenizer token2 = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(token2.nextToken());
            int second = Integer.parseInt(token2.nextToken());

            int firstOperand = 2;
            int secondOperand = 2;
            int firstTemp = first;
            int secondTemp = second;
            while (true) {

                if (firstTemp == secondTemp) break;

                if (firstTemp < secondTemp) {
                    firstTemp = first * firstOperand;
                    firstOperand++;
                } else if (secondTemp < firstTemp) {
                    secondTemp = second * secondOperand;
                    secondOperand++;
                }


            }
            System.out.println(firstTemp);
        }


    }
}
