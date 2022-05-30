
import java.io.*;

public class Main {
	// https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/A

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
	boolean flag = false;
	String word = reader.readLine();
	for (int i = 0;i<word.length();i++){
	    if (word.charAt(i) == 'H' || word.charAt(i) == 'Q' ||  word.charAt(i) == '9'){
           flag = true;
           break;
        }


	}
		if (flag) {

			writer.print("YES");
		}
		else {
			writer.print("NO");

		}
		writer.flush();


	}
}
