
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
// https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/B
public class Unary {
    public static void main(String[] args) throws  Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        String unary = reader.readLine();
long size = 0;
        for (int i = 0;i<unary.length();i++){
            size *= 16;
            if (unary.charAt(i) == '>')
                size+=8;
            else if (unary.charAt(i) == '<')
                size+=9;
            else if (unary.charAt(i) == '+')
                size+=10;
            else if (unary.charAt(i) == '-')
                size+=11;
            else if (unary.charAt(i) == '.')
                size+=12;
            else if (unary.charAt(i) == ',')
                size+=13;
            else if (unary.charAt(i) == '[')
                size+=14;
            else if (unary.charAt(i) == ']')
                size+=15;

            size%= 1000003;
        }

        writer.println(size);
        writer.flush();
    }
}
