import java.util.*;

public class Program {

    private static void printChart(char[] topTen, byte[] uArray) {
        short max = uArray[topTen[0]];
        byte maxHeight = (byte) (max <= 10 ? max : 10);
        byte totalLines = (byte) (2 + maxHeight);
        byte[] graphs = new byte[10];

        for (int i = 0; i < 10; i++) {
            if (max <= 10) {
                graphs[i] = (byte) uArray[topTen[i]];
            } else {
                graphs[i] = (byte) (uArray[topTen[i]] * 10 / max);
            }
        }
        System.out.println();
        for (int i = 0; i < totalLines; i++) {
            for (int j = 0; j < 10; j++) {
                if (topTen[j] != 0) {
                    if (i + graphs[j] + 2 == totalLines) {
                        System.out.printf("%3d", uArray[topTen[j]]);
                    } else if (i == totalLines - 1) {
                        System.out.printf("%3c", topTen[j]);
                    } else if (i + graphs[j] >= maxHeight) {
                        System.out.printf("%3c", '#');
                    }
                    if (j != 10 - 1 && topTen[j + 1] != 0 && i + graphs[j + 1] >= maxHeight) {
                        System.out.printf("%c", ' ');
                    }
                }
            }
            System.out.println();
        }
    }

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
