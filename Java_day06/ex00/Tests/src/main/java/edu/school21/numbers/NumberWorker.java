package edu.school21.numbers;

public class NumberWorker {
    public int digitsSum(int number) {
        int sum = 0;

        while(number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public boolean isPrime(int number) {
        int i = 1;
        if (number < 2) {
            throw new IllegalNumberException("Number < 2");
        }
        else if (number == 2) {
            return true;
        }
        else if (number % 2 == 0) {
            return false;
        }
        while (i * i < number) {
            i += 2;
            if (number % i == 0 && number != 3) {
                return false;
            }
        }
        return true;
    }
}

class IllegalNumberException extends RuntimeException {
    public IllegalNumberException(String message) { super(message); }
}
