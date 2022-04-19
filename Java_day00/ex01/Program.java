import java.util.*;

public class Program {
    public static void main(String[] args) {
        int i = 1;
        int steps = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("->");
        int input = scanner.nextInt();
        if (input < 2) {
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        else if (input == 2) {
            System.out.println("true 1");
            System.exit(-1);
        }
        else if (input % 2 == 0) {
            System.out.println("false 1");
            System.exit(-1);
        }
        while (i * i < input) {
            steps += 1;
            i += 2;
            if (input % i == 0) {
                System.out.println("false " + steps);
                System.exit(1);
            }
        }
        System.out.println("true " + steps);
    }
}