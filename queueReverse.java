import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queueReverse {
    public static void main(String[] args) {
        Queue<Integer>que=new LinkedList<>();
        que.add(2);que.add(4);que.add(6);que.add(8);que.add(10);
        Stack<Integer> stk=new Stack<>();
        while(!que.isEmpty()){
            stk.push(que.poll());
        }
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }

    }
}
