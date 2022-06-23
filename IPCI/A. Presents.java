import java.io.*;
// https://codeforces.com/contest/136/problem/A
public class Presents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(reader.readLine());
        int arr[] = new int[x + 1];
        String line = reader.readLine();
        String split[] = line.split(" ");

        for (int i = 0; i < arr.length - 1; i++) {
            arr[Integer.parseInt(split[i])] = i + 1;
        }
        int i = 0;
        while (x-- > 0)
            writer.print(arr[++i] + " ");

        writer.flush();

    }
}
