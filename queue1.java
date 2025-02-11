//write a java program to find the element in a queue which is having frequency1 and every 0 the element is repeating for two time
import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static int unique(){
        Queue<Integer>que=new LinkedList<>();
        que.add(1);que.add(1);que.add(4);que.add(5);que.add(5);
        int xor=0;
        while(!que.isEmpty()){
            xor=xor^que.poll();
        }return xor;
    }
    public static void main(String[] args) {
        //Queue<Integer> que = new LinkedList<>();
        unique();
        System.out.println(unique());
    }
}
