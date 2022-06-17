import java.io.*;
import java.util.Scanner;
// https://codeforces.com/contest/263/problem/A
public class BeautifulMatrix {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int matrix [][] = new int[5][5];
        int indexi = 0;
        int indexj = 0;
        int count = 0;
        for (int i = 0;i<5;i++){
            for (int j = 0;j<5;j++) {
                matrix[i][j] = input.nextInt();
                if (matrix[i][j] == 1){
                    indexi = i;
                    indexj = j;
                }

            }
        }

        for (int i = 0;i<5;i++){
            for (int j = 0;j<5;j++){
                if (indexi == 2){
                    if (indexj == 2){
                        break;
                    }
                    else {
                        if (indexj < 2) {
                            indexj++;
                            count++;
                        }
                        else {
                            indexj--;
                            count++;
                        }
                    }
                }
               if (indexj == 2){
                   if (indexi == 2){
                       break;
                   }
                   else if (indexi < 2){
                       indexi++;
                       count++;
                   }
                   else{
                       indexi--;
                       count++;
                   }
               }

               else {
                      if (indexi < 2){
                       indexi++;
                       count++;
                   }
                      else if (indexi > 2){
                          indexi--;
                          count++;
                      }
                      else if (indexj<2){
                          indexj++;
                          count++;
                      }
                      else if (indexj > 2){
                          indexj--;
                          count++;
                      }
               }
            }
        }
        System.out.println(count);

    }
}
