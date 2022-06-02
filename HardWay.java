// https://codeforces.com/problemset/problem/1642/A
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class HardWay {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter output = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(input.readLine());
        for (int i = 0; i < n; i++) {
            int in[][] = new int[3][2];
            for (int j = 0; j < in.length; j++) {
                String[] split = input.readLine().split(" ");
                in[j][0] = Integer.parseInt(split[0]);
                in[j][1] = Integer.parseInt(split[1]);
            }

            int a = 0;
            for (int j = 0; j < in.length; j++) {
                if (in[j][1] == in[(j + 1) % 3][1]) {
                    if (in[j][1] != 0) {
                        a = Math.abs(in[j][0] - in[(j + 1) % 3][0]);
                    }
                    if (in[(j + 2) % 3][1] > in[j][1]) {
                        a = 0;
                    }
                }
            }

            System.out.println(a);
        }
    }
}

