import java.io.*;
import java.util.Arrays;
// https://codeforces.com/contest/381/problem/A
public class SerejaAndDima {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        int countS = 0;
        int countD = 0;

        int x = Integer.parseInt(reader.readLine());
       String line = reader.readLine();
       String split[] = line.split(" ");
       int matrix[] = new int[x];
       for (int i = 0;i<x;i++)
           matrix[i] = Integer.parseInt(split[i]);

        int left = 0;
        int right = matrix.length-1;

        for (int i = 0;i<x;i++){
            if (i % 2 == 0) {
                if (matrix[left] > matrix[right]) {

                    countS+=matrix[left];
                    left++;
                }
                else {

                    countS+=matrix[right];
                    right--;
                }
            }
            else {
                if (matrix[left] > matrix[right]) {

                    countD+=matrix[left];
                    left++;
                }
                else {

                    countD+=matrix[right];
                    right--;
                }
            }
        }
        writer.println(countS + " " + countD);
        writer.flush();
    }
}
