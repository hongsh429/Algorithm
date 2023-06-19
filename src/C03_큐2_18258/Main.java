package C03_큐2_18258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int rowNum = Integer.parseInt(reader.readLine());

        StringBuffer buff = new StringBuffer();

        for (int i = 0; i < rowNum; i++) {
            String[] arr = reader.readLine().split(" ");
            String command = arr[0];

            switch (command) {
                case "push":
                    int num = Integer.parseInt(arr[1]);
                    queue.add(num);
                    break;
                case "pop":
                    Integer s = queue.poll();
                    if (s == null) buff.append(-1).append("\n");
                    else buff.append(s).append("\n");
                    break;
                case "size":
                    buff.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) buff.append(1 + "\n");
                    else buff.append(0 + "\n");
                    break;
                case "front":
                    if (!queue.isEmpty()) buff.append(queue.getFirst() + "\n");
                    else buff.append(-1).append("\n");
                    break;
                case "back":
                    if (!queue.isEmpty()) buff.append(queue.getLast() + "\n");
                    else buff.append(-1).append("\n");
                    break;
                default:
                    break;
            } // end switch
        }
        System.out.println(buff);
    }
}
