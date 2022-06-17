import java.io.*;

public class Prime {
// https://codeforces.com/group/zu3FIvIAXh/contest/234221/problem/D
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(reader.readLine());
int count = 0;
for (int i =2;i<x;i++){
    if (x % i == 0)
        count++;
}

if (count < 2)
    writer.println("Yes");
else
    writer.println("No");
        writer.flush();

    }
}
