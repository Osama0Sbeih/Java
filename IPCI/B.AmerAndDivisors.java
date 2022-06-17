import java.io.*;
// https://codeforces.com/group/zu3FIvIAXh/contest/234221/problem/B
public class AmerAndDivisors {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(reader.readLine());
        for (int i = 1;i<=num;i++)
            if (num % i == 0)
                writer.print(i + " ");

        writer.flush();
    }
}
