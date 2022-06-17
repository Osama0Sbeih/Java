import java.io.*;
 // https://codeforces.com/contest/677/problem/A
public class VanyaAndFence {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        int count = 0;
        String lineOne = reader.readLine();
        String lineTwo = reader.readLine();
        String splitLO []= lineOne.split(" ");
        String sploitLT [] = lineTwo.split(" ");

        for (int i =0;i<Integer.parseInt(splitLO[0]);i++){
            if (Integer.parseInt(sploitLT[i]) > Integer.parseInt(splitLO[1]))
                count+=2;
            else
                count++;
        }

        writer.println(count);
        writer.flush();
    }
}
