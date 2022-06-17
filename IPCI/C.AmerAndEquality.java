import java.io.*;
// https://codeforces.com/group/zu3FIvIAXh/contest/234221/problem/C
public class AmerAndEquality {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(reader.readLine());
        writer.println(num / 2);
        writer.flush();
    }
}
