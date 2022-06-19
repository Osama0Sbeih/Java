import java.io.*;

public class StonesOnTheTable {
// https://codeforces.com/contest/266/problem/A
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        int count = 0;
        for (int i = 0;i<line.length() - 1;i++){
            if (line.charAt(i) == line.charAt(i+1))
                count++;
        }
        writer.println(count);
         writer.flush();
    }
}
