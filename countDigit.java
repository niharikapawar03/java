import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(count(a,n));
    }
    public static int count(int[]a,int n ){
        int c=0;
        boolean isDictinct=true;
        for(int i=0;i<n;i++){
            for(int j=(i-1);j>=0;j++){
                if(a[i]==a[j]){
                    isDictinct=false;
                    break;
                }
            }if(isDictinct==true){
                c++;
            }
        }return c;
    }
}
