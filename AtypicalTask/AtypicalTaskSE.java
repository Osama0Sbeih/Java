
import java.util.Arrays;
import java.util.Scanner;

public class AtypicalTaskSE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int arr[] = new int[x];
        arr[0] = input.nextInt();
        arr[0] = (int) Math.pow(arr[0], 2);
        for (int i = 1; i < x; i++) {
            arr[i] = input.nextInt();
            arr[i] = (int) Math.pow(arr[i], 2);

            for (int j = 0; j < x; j++) {
                if (arr[i] < arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
