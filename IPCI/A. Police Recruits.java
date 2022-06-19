import java.io.*;
 // https://codeforces.com/contest/427/problem/A
public class PoliceRecruits {
    public static void main(String[] args) throws IOException {
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
   int x = Integer.parseInt(reader.readLine());
   String line = reader.readLine();
   String split[] = line.split(" ");
   int count = 0;
   int one = 0;
   for (int i = 0;i<x;i++){
       if (Integer.parseInt(split[i]) > 0){
           one+=Integer.parseInt(split[i]);
       }
       else{
           if (one > 0){
               one--;
           }
           else count++;
       }
   }
writer.println(count);
   writer.flush();
    }
}
