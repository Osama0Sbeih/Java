import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FileName {

    public static void main(String[] args) throws  Exception {
    // https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/L
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
String word = reader.readLine().toLowerCase();
String wordnew = "";
for (int i = 0;i<word.length();i++){
    if (word.charAt(i) == 'a' || word.charAt(i) == 'o' || word.charAt(i) == 'y' || word.charAt(i) == 'e' || word.charAt(i) == 'u' || word.charAt(i) == 'i'){
        continue;
    }
    else
    wordnew+= "." + word.charAt(i);
}
writer.println(wordnew);
writer.flush();
    }
}
