import java.io.*;
// https://codeforces.com/contest/731/problem/A
public class NightAtTheMuseum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        char indexN = 'a';
        char line[] = reader.readLine().toCharArray();
        for (int i = 0;i<line.length;i++){
int numberR = Math.abs(line[i] - indexN);
int numberL = 26 - Math.abs(numberR);
sum+=Math.min(numberL , numberR);
indexN = line[i];
        }

        writer.println(sum);
        writer.flush();
    }
}
