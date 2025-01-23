import java.util.Scanner;

public class multipleOf5 {
    public static void multiple(int n) {
        if (n % 10 == 0) {
            if (n % 5 == 0) {
                try {  //try block will only identify exception nothing else
                    int num=n/0;
                }
                catch (ArithmeticException e){
                    System.out.println("not divide");
                }
            }else{
                int num =n/5;
                System.out.println(num);
            }
        }else{
            System.out.println("the number is divisible by 5");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n1=sc.nextInt();
         multiple(n1);
    }
}
