import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.*;

public class Program {

    public static Map<String, String> makeMapFromSignatures(String signatureFilePath) throws IOException {

        Map<String, String> res = new HashMap<String, String>();

        try {
            FileInputStream br = new FileInputStream(new File(signatureFilePath));
            int line;
            StringBuilder builder = new StringBuilder();
            while ((line = br.read()) != -1) {
                String[] data = builder.toString().split(", ");
                res.put(data[1], data[0]);
                System.out.println("kew: " + data[1] + " vawue: " + data[0]);
            }
        }
        catch (IOException e) {
            System.out.println("Exception");
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        Map<String, String> signatures = new HashMap<String, String>();
        String resultFileName = new String("result.txt");
        String signatureFilePath = new String("signatures.txt");

        File result = new File(resultFileName);
        if (result.createNewFile())
            System.out.println("FIle created");
        Scanner filePath = new Scanner(System.in);

        signatures = makeMapFromSignatures(signatureFilePath);

    }
}
