import java.io.*;
// https://codeforces.com/group/zu3FIvIAXh/contest/233324/problem/E
public class GiveMeCents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(reader.readLine());
        writer.println(x % 100);
        writer.flush();
    }
}
