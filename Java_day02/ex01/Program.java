import java.util.*;
import java.io.*;

public class Program {

    public static List<String> inputA = new ArrayList<>();
    public static List<String> inputB = new ArrayList<>();
    public static TreeSet<String> dictionary = new TreeSet<>();

    public static void openFiles(String fileA, String fileB) {
        BufferedReader inA = null;
        BufferedReader inB = null;
        BufferedWriter writer;
        try {
            inA = new BufferedReader(new FileReader(fileA));
            inB = new BufferedReader(new FileReader(fileB));
            writer = new BufferedWriter(new FileWriter("dictionary.txt"));

            String line;
            while ((line = inA.readLine()) != null) {
                String [] ArrOfStrings = line.split(" ");
                inputA.addAll(Arrays.asList(ArrOfStrings));
                dictionary.addAll(inputA);
            }

            while ((line = inB.readLine()) != null) {
                String [] ArrOfStrings = line.split(" ");
                inputB.addAll(Arrays.asList(ArrOfStrings));
                dictionary.addAll(inputB);
            }

            for (String word : dictionary)
                writer.write(word + " ");

            inA.close();
            inB.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fillFreq(List<Integer> a, List<Integer> b) {
        int countA = 0;
        int i = 0;
        for (String elem : dictionary) {
            for (String elemA : inputA)
                if (elem.equals(elemA))
                    countA++;
            a.add(i, countA);
            countA = 0;
            i++;
        }
        i = 0;
        for (String elem : dictionary) {
            for (String elemB : inputB)
                if (elem.equals(elemB))
                    countA++;
            b.add(i, countA);
            countA = 0;
            i++;
        }
    }

    public static double similarity() {
        List<Integer> frequencyA = new ArrayList<>(dictionary.size());
        List<Integer> frequencyB = new ArrayList<>(dictionary.size());

        fillFreq(frequencyA, frequencyB);
        int numerator = findNumerator(frequencyA, frequencyB);
        double denominator = findDenumerator(frequencyA, frequencyB);
        return numerator / denominator;
    }

    public static int findNumerator(List<Integer> a, List<Integer> b) {
        int sum = 0;
        for (int i = 0; i < dictionary.size(); i++)
            sum += a.get(i) * b.get(i);
        return sum;
    }

    public static double findDenumerator(List<Integer> a, List<Integer> b) {
        double sumA = 0;
        double sumB = 0;

        for (Integer x : a)
            sumA += x * x;
        for (Integer x : b)
            sumB += x * x;
        return Math.sqrt(sumA) * Math.sqrt(sumB);
    }

    public static void main(String[] args) {
        openFiles(args[0], args[1]);
        System.out.printf("Similarity = %.2f\n", similarity());
    }
}
