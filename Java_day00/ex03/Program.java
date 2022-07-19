import java.util.Scanner;

public class Program {

    public static int checkLine(String str, int count) {
        if (count <= 18) {
            if (str.equals("Week " + count))
                return 1;
        }

        return 0;
    }

    public static void   printGrades(int count, long grades) {
        int i = 1;
        long gradeMin;

        while (i < count) {
            System.out.print("Week " + i);
            gradeMin = grades % 10;
            grades /= 10;

            while (gradeMin != 0) {
                System.out.print("=");
                gradeMin--;
            }

            i++;
            System.out.println(">");
        }
    }

    public static long  reverseLong(long reverseGrades) {
        long grades = 0;
        long num = 0;

        while (reverseGrades != 0)
        {
            num = reverseGrades % 10;
            grades = grades * 10 + num;
            reverseGrades /= 10;
        }

        return grades;
    }

    public static void main(String[] args) {

        int     tmp = 9;
        String  str;
        int     input = 0;
        int     count = 1;
        long    grades = 0;
        long    reverseGrades = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();

            if (str.equals("42"))
                break;
            else if (checkLine(str, count) == 0) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }

            count++;
            tmp = 9;

            for (int i = 0; i < 5; i++) {
                input = scanner.nextInt();
                if (tmp > input)
                    tmp = input;
            }

            reverseGrades = reverseGrades * 10 + tmp;
        }

        grades = reverseLong(reverseGrades);
        printGrades(count, grades);
    }
}
