import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue2 {
    public static Queue<Integer> reversek(int k){
        Queue<Integer> que=new LinkedList<>();
        que.add(1);que.add(2);que.add(3);que.add(4);que.add(5);
        Stack<Integer> stk=new Stack<>();
       if(que.isEmpty()||k<=0||k>que.size()){
            return que;
        }for(int i=0;i<k;i++){
           stk.push(que.poll());
        }
       while(!stk.isEmpty()){
           que.add(stk.pop());
       }
       for(int i=0;i<que.size()-k;i++){
           que.add(que.poll());
       }return que;
    }
    public static void main(String[] args) {
        int k=3;
        Queue<Integer> result=reversek(k);
        System.out.println(result);
    }
}
