import java.io.*;

public class EnglishLetterConvertArabicLetter {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
        char englishL[] = {' ', 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', '[', ']', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ';', '\'', 'z', 'x', 'c', 'v', 'b', 'n', 'm', ',', ',', '.', '/'};
        int arabicL[] = {32, 1590, 1589, 1579, 1602, 1601, 1594, 1593, 1607, 1582, 1581, 1580, 1583, 1588, 1587, 1610, 1576, 1604, 1575, 1578, 1606, 1605, 1603, 1591, 1574, 1569,
                1572, 1585, 1604, 1609, 1577, 1608, 1586, 1592};


        char line[] = reader.readLine().toCharArray();
        int index = 0;
        String newString = "";
        for (int i = 0; i < line.length; i++) {

            for (int j = 0; j < englishL.length; j++) {
                if (Character.toLowerCase(line[i]) == englishL[j]) {
                    index = j;
                    break;
                }
            }
            newString += (char) arabicL[index];

        }

        writer.println(newString);
        writer.flush();
    }
}
