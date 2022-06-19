import java.io.*;
// https://codeforces.com/contest/431/problem/A
public class BlackSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        String lineO = reader.readLine();
        String lineT = reader.readLine();
        String splitO [] = lineO.split(" ");
        String splitT[] = lineT.split("");

        int count = 0;

        for (int i = 0;i<lineT.length();i++){
            count+=Integer.parseInt(splitO[(Integer.parseInt(splitT[i])) - 1]);
        }

        writer.println(count);
        writer.flush();

    }
}
