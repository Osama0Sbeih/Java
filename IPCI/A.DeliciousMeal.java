

// https://codeforces.com/group/zu3FIvIAXh/contest/233324/problem/A
import java.io.*;

public class DeliciousMeal {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        String line = reader.readLine();
        String split[] = line.split(" ");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        writer.println(x+y);
        writer.flush();
    }
}
