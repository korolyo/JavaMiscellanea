import java.util.Scanner;

public class Program {

    static int isPrime(int input) {
        int i = 1;

        if (input == 2) {
            return 1;
        }
        if (input % 2 == 0) {
            return 0;
        }
        while (i * i < input) {
            i += 2;
            if (input % i == 0 && input != 3) {
                return 0;
            }
        }
        return 1;
    }

    public static int findSum(int input) {
        int sum = 0;

        if (input < 2) {
            System.out.println("IllegalArgument");
            System.exit(-1);
        }
        while (input != 0) {
            sum += input % 10;
            input /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        int sum = 0;
        int input = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (input != 42) {
            input = Integer.parseInt(scanner.nextLine());
            sum = findSum(input);
            if (isPrime(sum) == 1) {
                count++;
            }
        }

        System.out.println("Count of coffee-request - " + count);
    }
}
