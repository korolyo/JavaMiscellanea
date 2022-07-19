import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int i = 1;
        int steps = 0;

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        if (input < 2) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        else if (input == 2) {
            steps++;
            System.out.println("true 1");
            System.exit(-1);
        }
        else if (input % 2 == 0) {
            steps++;
            System.out.println("false 1");
            System.exit(-1);
        }
        while (i * i < input) {
            steps++;
            i += 2;
            if (input % i == 0 && input != 3) {
                System.out.println("false " + steps);
                System.exit(1);
            }
        }
        System.out.println("true " + steps);
    }
}
