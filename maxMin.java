import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x= sc.nextInt();
        int arr[]=new int[x];

        for( int i =0;i<x;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        int min=arr[0];
        for(int i= 1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int mul=max*min;
        System.out.println(max);
        System.out.println(min);
        System.out.println(mul);

        if(mul%max==0 && mul%min==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
