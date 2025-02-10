import java.util.Stack;

//write a program to print all the elemnet of a stack without using extra space.
public class Stack1 {
    public static void print(Stack<Integer>stk){
        for(int ele:stk){
            System.out.println((ele));
        }
    }
    public static void main(String[] args) {
        Stack<Integer>stk=new Stack<>();
        stk.add(2);stk.add(4);stk.add(6);stk.add(8);stk.add(10);stk.add(12);
        print(stk);
    }
}
