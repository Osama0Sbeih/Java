
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.PriorityQueue;
import java.util.Queue;


public class NewBeginnings {

    private static int[] machines = {1, 2, 3, 4};

    private static int[] problems = {1, 3, 4, 7};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("input.in"));

        int tc = Integer.parseInt(reader.readLine());
        while (tc-- > 0) {
            int nOfProblems = Integer.parseInt(reader.readLine());
            System.out.println(bfs(nOfProblems));
        }
    }

    private static long bfs(int p) {
        Queue<Item> queue = new PriorityQueue<>();

        queue.offer(new Item(0, 0));
        while (!queue.isEmpty()) {
            Item item = queue.poll();

            if (item.problems == p) {
                return item.machines;
            }

            for (int i = 0; i < machines.length; i++) {
                queue.offer(new Item(item.machines + machines[i], item.problems + problems[i]));
            }
        }

        return 0;
    }

    private static class Item implements Comparable<Item> {

        private long machines;

        private int problems;

        public Item(long machines, int problems) {
            this.machines = machines;
            this.problems = problems;
        }

        @Override
        public int compareTo(Item o) {
            return Long.compare(this.machines, o.machines);
        }
    }
}
