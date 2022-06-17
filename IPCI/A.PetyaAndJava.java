import java.io.*;
// https://codeforces.com/contest/66/problem/A
public class PetyaAndJava {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
try {
    long num = Long.parseLong(reader.readLine());
    if (num<=127)
        writer.println("byte");
    else if (num<=32767)
        writer.println("short");
    else if (num<=2147483647)
        writer.println("int");
    else writer.println("long");
    writer.flush();
}catch(Exception e){
    writer.println("BigInteger");
    writer.flush();
}


    }
}
