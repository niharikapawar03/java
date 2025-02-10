//write a program to check that the given array is a palindrom or not?
import java.util.Stack;

public class palindromStack {
    public static boolean Pal(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for (int i=0;i<arr.length;i++) {
            stk.push(arr[i]);        }
        for(int i=0;i<stk.size();i++){
            if(stk.pop()!=arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        if (Pal(arr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

