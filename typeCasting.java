import java.util.Scanner;

public class typeCasting{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        String input = sc.nextLine();
        boolean b=factoInput(input);
        System.out.println(b);
        factoInput(input);
    }

    public static boolean factoInput(String input) {
        int number = Integer.parseInt(input);
        return number % 5 == 0;
        }
    }

