import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringJoiner;

public class AtypicalTaskSE1 {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int i = 0; i < x; i++) {
            int n = (int) Math.pow(input.nextInt(), 2);
            queue.offer(n);
        }

        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        while (!queue.isEmpty()) {
            joiner.add(queue.poll() + "");
        }

        System.out.println(joiner);
    }
}
