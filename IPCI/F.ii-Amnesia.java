import java.io.*;
// https://codeforces.com/group/zu3FIvIAXh/contest/233723/problem/F
public class iiAmnesia {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

        char x = reader.readLine().charAt(0);
        if ((int) x >=65 && (int) x <=90) {
            writer.print("Alphabet Upper ");
            if (x == 'A' || x == 'E' || x == 'I' || x=='O' || x=='U')
                writer.print("Vowel");
            else
                writer.print("Consonant");
        }
        else if ((int) x >=97 && (int) x <=122){
            writer.print("Alphabet Lower ");
            if (x == 'A' || x == 'E' || x == 'I' || x=='O' || x=='U')
                writer.print("Vowel");
            else
                writer.print("Consonant");
        }

        else if ((int) x >=48 && (int)x <=57)
            writer.print("Number");
        else
            writer.println("Special");

        writer.flush();

    }
}
