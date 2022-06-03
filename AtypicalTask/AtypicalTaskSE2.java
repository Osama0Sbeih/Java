import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AtypicalTaskSE2 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for (int i = 0; i < x; i++) {
            int n = (int) Math.pow(input.nextInt(), 2);
            list.add(n);
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
