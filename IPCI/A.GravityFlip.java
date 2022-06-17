import java.io.*;
import java.util.Arrays;
// https://codeforces.com/contest/405/problem/A
public class GravityFlip {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        String split[] = line.split(" ");
        int number[] = new int[n];
       for (int i = 0;i<n;i++)
           number[i] = Integer.parseInt(split[i]);

       Arrays.sort(number);
       for (int i = 0;i<n;i++)
           writer.print(number[i] + " ");

       writer.flush();
    }
}
