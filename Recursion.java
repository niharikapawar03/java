import java.util.Scanner;

public class Recursion {
    public static void add(int n ){
        if(n>25){
            return;
        }
        System.out.println(n);
        add(n+1);
    }
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int a=1;
        add(a);
        System.out.println();
    }
}
