import java.util.*;
public class insertionsort {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ashu[] = new int[x];

        for(int i=0;i<x;i++) {
            ashu[i] = sc.nextInt();
        }
        for (int i = 1; i < x; i++) {
            for (int j = i; j > 0; j--) {
                if (ashu[j] < ashu[j - 1]) {
                    int temp = ashu[j];
                    ashu[j] = ashu[j - 1];
                    ashu[j - 1] = temp;
                    System.out.println(ashu[j]);
                } else {
                    break;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int num1 : ashu) {
            System.out.print(num1 + " ");
        }
        }
    }

