import java.io.*;
// https://codeforces.com/group/zu3FIvIAXh/contest/234221/problem/A
public class AmerAndSummation2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

        String line = reader.readLine();
        String split[] = line.split(" ");
        long sum = 0;
        int num1 = Integer.parseInt(split[0]);
        int num2 = Integer.parseInt(split[1]);

        for (int i = num1;i<=num2;i++){
            sum+=i;
        }
        writer.println(sum);
        writer.flush();
    }
}
