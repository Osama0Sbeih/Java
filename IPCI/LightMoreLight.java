import java.io.*;
// https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1051
public class LightMoreLight {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        while (n != 0) {
            if ((int) (Math.sqrt(n)) * (int) (Math.sqrt(n)) == n)
                writer.println("yes");
            else
                writer.println("no");
            n = Integer.parseInt(reader.readLine());

        }

        writer.flush();

    }
}
