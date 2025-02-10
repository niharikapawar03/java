import java.util.Stack;

//write a program to find the diffrence of max and min elemn=ent in thr stack
public class Stack2 {
    public static int diff(Stack<Integer>stk){
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        for(int ele: stk){
            if(ele<min)
                min=ele;
            if(max<ele){
                max=ele;
            }
        }return max-min;
    }

    public static void main(String[] args) {
        Stack<Integer>stk=new Stack<>();
        System.out.println(diff(stk));
    }

}
