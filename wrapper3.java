//write a java program to convert a character into an integer using wrapper class check that the given number is prime or not.
public class wrapper3 {
    public static void main(String[] args) {
        char ch = '1';
        boolean result = isPrime(ch);
        System.out.println(result);
    }
    public static boolean isPrime(char ch) {
        int num = Character.getNumericValue(ch);
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

