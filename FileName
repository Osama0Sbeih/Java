
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FileName {

    public static void main(String[] args) throws  Exception {
    // https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/D
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(reader.readLine());
        int countx = 0;
        int countn = 0;
        String word = reader.readLine();
        reader.close();
        for (int i = 0;i<length;i++){
            if (word.charAt(i) == 'x'){
                countx++;
                if (countx >= 3)
                    countn++;

            }
            else
                countx=0;
        }
        writer.println(countn);
        writer.flush();

    }
}
