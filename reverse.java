import java.util.Scanner;
/*
public class reverse {
    public static void main(String [] args){
        int num=14795;
        int reversenum =0;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        for( int n = 0 ; num != 0;n++ )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

        System.out.println(reversenum);
    }
}
*/

public class reverse{
    public static void main(String[] args) {
        int num=14795;
        int reversenum=0;
        while(num!=0){
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

        System.out.println(reversenum);
        }

    }
