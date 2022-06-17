import java.io.*;
// https://codeforces.com/group/zu3FIvIAXh/contest/234221/problem/E
public class PrintReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
       int number = Integer.parseInt(reader.readLine());
       int reverse = 0;
       while(number != 0){
           reverse = reverse *10 + number % 10;
           number /=10;
       }
writer.println(reverse);
        writer.flush();
    }
}
