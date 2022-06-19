import java.io.*;

public class Dictionary {
// https://codeforces.com/contest/1674/problem/B
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        String Eng [] = {"a" , "b" , "c" , "d" , "e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int x = Integer.parseInt(reader.readLine());
        int indexF = 0;
        int indexS = 0;
        for (int i = 0;i<x;i++){
            String line = reader.readLine();
            String split[] = line.split("");

            for (int j = 0;j<Eng.length;j++){
if (split[0].equals(Eng[j])){
    indexF = j;
}
if (split[1].equals(Eng[j]))
    indexS = j;
            }
            if (indexF == 0 || indexF < indexS)
            writer.println((25 * indexF) + indexS);
            else
                writer.println((25 * indexF) + indexS+1);

        }

        writer.flush();
    }
}
