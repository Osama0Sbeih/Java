import java.io.*;
// https://codeforces.com/contest/112/problem/A
public class PetyaAndStrings {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
       String lineO = reader.readLine().toLowerCase();
       String lineT = reader.readLine().toLowerCase();

       for (int i = 0;i<lineO.length();i++){
           if (lineO.charAt(i) > lineT.charAt(i)) {
               writer.println(1);
               writer.flush();
               System.exit(0);
           }
           else if (lineO.charAt(i) < lineT.charAt(i)){
               writer.println(-1);
               writer.flush();
               System.exit(0);
           }
           else
               continue;
       }
        writer.println(0);
       writer.flush();
    }
}
