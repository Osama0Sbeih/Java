import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class SayHello {
    public static void main(String[] args) throws  Exception {
      // https://codeforces.com/group/MWSDmqGsZm/contest/219158/problem/A
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        String name = reader.readLine();
        writer.println("Hello, " + name);
writer.flush();
    }
}
