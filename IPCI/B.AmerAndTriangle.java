import java.io.*;
// https://codeforces.com/group/zu3FIvIAXh/contest/233723/problem/B
public class AmerAndTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        String line = reader.readLine();
        String split[] = line.split(" ");
        long x = Long.parseLong(split[0]);
        long y = Long.parseLong(split[1]);
        long z = Long.parseLong(split[2]);

        if (Math.pow(y , 2) + Math.pow(z,2) == Math.pow(x,2))
            writer.println("yes");
        else
            writer.println("no");

        writer.flush();

    }
}
