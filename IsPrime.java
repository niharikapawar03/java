import java.util.Scanner;

interface Prime {
    boolean isPrime(int number);
}

class PrimeCheck implements Prime{
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Prime primeChecker = new PrimeCheck();

        int testNumber = scanner.nextInt();
        if (primeChecker.isPrime(testNumber)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scanner.close();
    }
}
