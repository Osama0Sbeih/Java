import java.io.*;
// https://codeforces.com/group/zu3FIvIAXh/contest/233723/problem/G
public class AlAhlyGoalKeepers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

        String lPLayer = reader.readLine();
        String lPrice = reader.readLine();
        String lShots = reader.readLine();

        String splitP[]= lPLayer.split(" ");
        String splitR[] = lPrice.split(" ");
        String splitS[] = lShots.split(" ");

        int max = Integer.parseInt(splitR[0]) / Integer.parseInt(splitS[0]);
        int index = 0;
        for (int i = 1;i<splitS.length;i++){
            int z = Integer.parseInt(splitR[i]) / Integer.parseInt(splitS[i]);
            if (z > max) {
                max = z ;
                index = i;
            }
        }

        writer.println(splitP[index]);
        writer.flush();

    }
}
