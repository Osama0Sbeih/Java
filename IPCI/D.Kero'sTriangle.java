import java.io.*;
 // https://codeforces.com/group/zu3FIvIAXh/contest/233324/problem/D
public class KerosTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

        String line = reader.readLine();
        String split[] = line.split(" ");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        int z = Integer.parseInt(split[2]);

        writer.println((int)((0.5 * x * y)));
        writer.println(x + y + z);
        writer.flush();

    }
}
