// https://codeforces.com/problemset/problem/577/A

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class MultiplicationTable {
        public static void main(String[] args) throws Exception {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter output = new PrintWriter(new OutputStreamWriter(System.out));
            String line = input.readLine();
            String[] split = line.split(" ");

            int nXm = Integer.parseInt(split[0]);
            long number = Long.parseLong(split[1]);

            int count = 0;
            for (int i = 1; i <= nXm; i++) {
                if (number / i <= nXm && number % i == 0) {
                    count++;
                }
            }

            output.println(count);
            output.flush();
        }

}
