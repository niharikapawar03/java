
import java.util.*;

    public class bubbleShorting {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();

            int[] num = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                num[i] = sc.nextInt();
            }

            // Bubble Sort Logic
            for (int i = 0; i < num.length - 1; i++) {
                for (int j = 0; j < num.length - i - 1; j++) {
                    if (num[j] > num[j + 1]) {
                        // Swap num[j] and num[j + 1]
                        int temp = num[j];
                        num[j] = num[j + 1];
                        num[j + 1] = temp;
                    }
                }
            }

            System.out.println("Sorted array:");
            for (int num1 : num) {
                System.out.print(num1 + " ");
            }

            sc.close();
        }
    }
