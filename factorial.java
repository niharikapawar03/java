import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("enter the value:");
        int number=120;
        int fact=1;
        int i=1;
        while(fact>number){
            fact*=1;
            i++;
        }
        if (fact == number) {
            System.out.println(number + " is a factorial of " + i + ".");
        } else {
            System.out.println(number + " is not a factorial of any integer.");
        }
    }
}
