import java.io.*;
// https://codeforces.com/group/zu3FIvIAXh/contest/234221/problem/F
public class EhabAndAnotherConstructionProblem {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(reader.readLine());
    for (int i = 1;i<=x;i++)
        for (int j = 1;j<=x;j++){
            if (i*j  > x && i%j == 0 && i / j < x) {
                writer.println(i + " " + j);
                writer.flush();
                System.exit(0);
            }
        }
    writer.println(-1);
    writer.flush();


    }
}
