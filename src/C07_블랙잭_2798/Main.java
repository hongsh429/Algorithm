package C07_블랙잭_2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token1 = new StringTokenizer(br.readLine());
        int nums = Integer.parseInt(token1.nextToken());
        int maxSum = Integer.parseInt(token1.nextToken());

        StringTokenizer token2 = new StringTokenizer(br.readLine());

        int[] arr = new int[nums];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(token2.nextToken());
        }

        int sum;
        int candidate = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i+1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum <= maxSum){
                        candidate = Math.max(sum, candidate);
                    }
                }
            }
        }
        System.out.println(candidate);


    }
}
