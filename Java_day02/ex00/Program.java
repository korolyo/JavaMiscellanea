import java.io.*;
import java.util.*;

public class Program {

    public static void main(String[] args) throws IOException {
        Map<String, String> signatures = new HashMap<>();
        String resultFileName = new String("result.txt");
        String signatureFilePath = new String("signatures.txt");

        try (FileInputStream fis = new FileInputStream(new File(signatureFilePath))) {
            int line;
            StringBuilder sb = new StringBuilder();
            while ((line = fis.read()) != -1) {
                if ((char) line == '\n' || fis.available() == 0) {
                    String[] l = sb.toString().split(", ");
                    String key = new String(l[1].trim());
                    String value = new String(l[0].trim());
                    signatures.put(key, value);
                    sb.setLength(0);
                    continue;
                }
                sb.append((char) line);
            }
        } catch (IOException e) {
            System.out.println("Exception");
        }

        String input = new String("");
        Scanner filePath = new Scanner(System.in);
        while (!(input = filePath.nextLine()).equals("42")) {
            StringBuilder hex = new StringBuilder();
            try (FileInputStream checkFile = new FileInputStream(input)) {
                FileOutputStream result = new FileOutputStream(resultFileName);
                for (int i = 0; checkFile.available() > 0 && i < 8; i++)
                    hex.append(String.format("%02X ", checkFile.read()));
                String ifsignature = new String(hex.toString());
                String value = new String("");
                for (String key : signatures.keySet()) {
                    if (ifsignature.startsWith(key)) {
                        value = signatures.get(key);
                        result.write(value.getBytes());
                        result.write('\n');
                        System.out.println("PROCESSED");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
