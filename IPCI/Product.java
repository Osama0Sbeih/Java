import java.io.*;

public class Product {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        long Num1 = Long.parseLong(reader.readLine());
        long Num2 = Long.parseLong(reader.readLine());
        while (Num1 != 0 && Num2 != 0){
            writer.println(Num1 * Num2);
             Num1 = Long.parseLong(reader.readLine());
             Num2 = Long.parseLong(reader.readLine());
        }
        writer.flush();
    }
}
