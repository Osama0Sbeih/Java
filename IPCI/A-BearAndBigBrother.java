import java.io.*;

public class BearAndBigBrother {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        String line = reader.readLine();
        String split[] = line.split(" ");
        int countY = 0;
        int Limak = Integer.parseInt(split[0]);
        int Weight = Integer.parseInt(split[1]);
        if (Limak > Weight)
            writer.println(0);
        else if (Limak == Weight)
            writer.println(1);
        else {
            while (Limak<=Weight){
                Limak = Limak * 3;
                Weight = Weight * 2;
                countY++;
            }
            writer.println(countY);
        }
        writer.flush();
    }
}
