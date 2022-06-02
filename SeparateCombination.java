/*
Write a java project that contain the following :
1- Method called Min that return the minimum number in the array.
2- Method called evenOdd that separate even and odd numbers of a given array of integers. Put all even numbers first , and then od numbers.(Hint : the method will be void and don't use new array).(ex.Assume nums = {1,5,6,9,8,4} after calling the array will be {4,8,6,9,5,1}.
3- Method called Summation that all combination of four elements of a given array whose num is equal to a given value.(ex.Assume nums = {10,20,30,40,1,2} and the number is 53 , the output
will be 10 40 1 2 and 20 30 1 2)
4- in the main define an array called nums with size 6 and enter the elements then call Min,evenOdd(print the array after calling)finally enter value and call Summation methods.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class SeparateCombination {
    public static int min(int arr[]){
        int min = arr[0];
        for (int i = 1;i<arr.length;i++)
            if (min>arr[i])
                min = arr[i];
            return min;
    }

    public static void evenodd(int arr[]){
        for (int i = 0 ;i<arr.length;i++) {
            for (int j = 1; j < arr.length; j++) {
if (arr[i] % 2 != 0 && arr[j] % 2 == 0 && j > i){
    int swap = arr[i];
    arr[i] = arr[j];
    arr[j] = swap;
}
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void summation (int arr[] , int value){
        for (int i = 0;i<arr.length - 3;i++){
            for (int j = i+1;j<arr.length- 2;j++){
                for (int k = j+1;k<arr.length-1;k++){
                    for (int n = k+1;n<arr.length;n++){
                        if (arr[i] + arr[j] + arr[k] + arr[n] == value)
                            System.out.println(arr[i] + " " + arr[j] +  " "+ arr[k] + " " + arr[n]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        System.out.println("Please Enter Length Array : ");
        int length = Integer.parseInt(reader.readLine());
        int arr[] = new int[length];
        System.out.println("Please Enter Value of array : ");
        String line = reader.readLine();
        String split[] = array.line(" ");
        for (int i = 0;i<length;i++)
            arr[i] = Integer.parseInt(split[i]);
        System.out.println("Min Number");
        System.out.println(min(arr));
        System.out.println("Seperates even|odd");
        evenodd(arr);
        System.out.println("\nPlease Enter Value : ");
        int value = Integer.parseInt(reader.readLine());
        System.out.println("The Value Sum");
        summation(arr , value);

    }
}
