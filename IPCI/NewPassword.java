import java.io.*;
 // https://codeforces.com/contest/770/problem/A
public class NewPassword {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        String line = reader.readLine();
        String split[] = line.split(" ");
        int length = Integer.parseInt(split[0]);
        int distinct = Integer.parseInt(split[1]);
      String charact = "qwertyuiopasdfghjklzxcvbnm";
      for (int i = 0;i<length;i++){
          writer.print(charact.charAt(i%distinct));
      }

        writer.flush();
    }
}
