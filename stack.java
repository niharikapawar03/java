import java.util.Stack;

public class stack {
    public static void StackOperation(int[]arr){
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<arr.length;i++){
            stk.push(arr[i]);
        }
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.empty());
        System.out.println(stk.size());
    }
    public static void main(String[] args) {
        int []a={10,20,30,40,50   };
        StackOperation(a);
    }
}
