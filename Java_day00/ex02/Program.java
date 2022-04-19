import java.util.*;

public class Program {

    static int isPrime(int input) {
        int i = 1;

        if (input == 2) {
            return 1;
        }
        else if (input % 2 == 0) {
            return 0;
        }
        while (i * i < input) {
            i += 2;
            if (input % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        int sum = 0;
        int input = 0;
        int count = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("->");
            input = scanner.nextInt();
            if (input == 42)
                break;
            if (input < 2) {
                System.out.println("IllegalArgument");
                System.exit(-1);
            }
            while (input != 0) {
                sum += input % 10;
                input /= 10;
            }
            if (isPrime(sum) == 1)
                count++;
        }
        System.out.println("Count of coffee request-" + count);
    }
}