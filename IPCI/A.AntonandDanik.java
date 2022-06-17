import java.io.*;
// https://codeforces.com/contest/734/problem/A
public class AntonAndDanik {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        String split[] = line.split("");
        int countA = 0;
        int countB=0;

        for (int i = 0;i<split.length;i++){
            if (split[i].equals("A"))
                countA++;
            else if (split[i].equals("D"))
                countB++;
        }
        if (countA > countB)
            writer.println("Anton");
        else if (countA == countB)
            writer.println("Friendship");
        else
            writer.println("Danik");

        writer.flush();

    }
}
