
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class RegistrationSystem {
  // https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/C
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
Map<String,Integer> map = new HashMap<>();
int x = Integer.parseInt(reader.readLine());
for (int i = 0;i<x;i++){
    String word = reader.readLine();
    if (map.containsKey(word)){
        int database = map.get(word);
        database++;
        map.put(word , database);
        writer.println(word+database);
    }
    else{
        writer.println("OK");
        map.put(word,0);
    }
}
writer.flush();




    }
}
