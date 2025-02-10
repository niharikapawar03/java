import java.util.Stack;

//count the number of element in a stack without modifiying it
//search an element in a stack without modifying it
public class stack3 {
    public static int countElement(Stack<Integer> stk){
        int count=0;
        for(int ele: stk){
            count=count+1;
        }
        return count;
    }
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(1);stk.push(2);stk.push(3);stk.push(4);stk.push(5);stk.push(6);
        System.out.println(countElement(stk));
    }
}
