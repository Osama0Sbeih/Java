import java.io.*;
// https://codeforces.com/contest/231/problem/A
public class Team {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        int problemN =Integer.parseInt(reader.readLine());
        int countY = 0;
        int countF = 0;
        for (int i = 0;i<problemN;i++){
            String line = reader.readLine();
            String split[] = line.split(" ");
            for (int j = 0;j<split.length;j++){
                if (split[j].equals("1"))
                    countY++;
            }
            if (countY >=2)
                countF++;
            countY = 0;
        }
        writer.println(countF);
        writer.flush();
    }
}
