import java.io.*;
// https://codeforces.com/contest/344/problem/A
public class Magnets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(reader.readLine());
int countFinal = 1;
        String line = reader.readLine();
if (x > 1) {
    for (int i = 0; i < x - 1; i++) {
        String line1 = reader.readLine();
        if (!(line.equals(line1)))
            countFinal++;

        line = line1;
    }

}
        writer.println(countFinal);
        writer.flush();

    }
}
