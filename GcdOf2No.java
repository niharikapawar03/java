import java.util.Scanner;

public class GcdOf2No {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int ans=1;
        int x=Math.min(a,b);
        for(int i=1;i<=x;i++){
            if(a%i==0&&b%i==0){
                ans=i;
            }
        }
        System.out.println(ans);
    }
}
