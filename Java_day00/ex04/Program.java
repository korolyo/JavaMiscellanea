import java.util.*;

public class Program {

    public static void parseInput(char[] c, byte[] uArray, int len) {
        int i = 0;

        while (i < len) {
            uArray[(c[i])]++;
            i++;
        }
    }

    private static char[] findTen(byte[] uArray) {
        char [] ret = new char[10];

        for (int i = 0; i < 65535; i++) {
            byte charCount = uArray[i];
            if (charCount > 0) {
                for (int j = 0; j < 10; j++) {
                    if (uArray[ret[j]] < charCount) {
                        ret = insertChar(ret, (char)i, j);
                        break;
                    }
                }
            }
        }
        return ret;
    }

    private static char[] insertChar(char[] base, char c, int index) {
        char [] ret = new char[10];
        for (int i = 0; i < index; i++) {
            ret[i] = base[i];
        }
        ret[index] = c;
        for (int i = index + 1; i < 10; i++) {
            ret[i] = base[i - 1];
        }
        return ret;
    }

    public static void main(String[] args) {
        String str;

        Scanner scanner = new Scanner(System.in);
        System.out.print("->");
        str = scanner.nextLine();

        int len = str.length();
        char[] c = str.toCharArray();
        byte [] uArray = new byte[65536];

        parseInput(c, uArray, len);
        char[] topTen= findTen(uArray);
        printChart(topTen, uArray);
    }
}