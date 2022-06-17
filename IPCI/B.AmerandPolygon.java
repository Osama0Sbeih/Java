import java.io.*;
// https://codeforces.com/group/zu3FIvIAXh/contest/233324/problem/B
public class AmerandPolygon {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        String line = reader.readLine();
        String split[] = line.split(" ");
        long x = Long.parseLong(split[0]);
        long y = Long.parseLong(split[1]);

        writer.println(x * y);
        writer.flush();


    }
}
