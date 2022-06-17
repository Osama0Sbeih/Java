import java.io.*;

// https://codeforces.com/group/zu3FIvIAXh/contest/233723/problem/E
public class IAmnesia {
    public static void main(String[] args) throws  IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        char x = reader.readLine().charAt(0);
        if (((int) x) >= 65 && ((int) x) <=90)
            writer.println("Alphabet");
        else
            writer.println("Not alphabet");

        writer.flush();

    }
}
