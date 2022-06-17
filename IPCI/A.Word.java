import java.io.*;
import java.util.Locale;
// https://codeforces.com/contest/59/problem/A
public class Word {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        String word = reader.readLine();
        int countC = 0;
        int countS = 0;

        for (int i = 0;i<word.length();i++){
            if ((int)word.charAt(i) >=97 && (int)word.charAt(i)<=122)
                countS++;
            else
                countC++;
        }
        if (countC > countS)
            writer.println(word.toUpperCase());
        else
            writer.println(word.toLowerCase());

        writer.flush();
    }
}
