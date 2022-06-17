import java.io.*;
 // https://codeforces.com/group/zu3FIvIAXh/contest/233324/problem/G
public class AmerAndParty {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

        long x = Long.parseLong(reader.readLine());

        writer.println(((x * (x-1)) / 2));
        writer.flush();
    }
}
