import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> qu=new LinkedList<>();
        qu.add(4);
        qu.add(5);
        qu.add(6);
        System.out.println(qu.peek());
        System.out.println(qu.poll());
        System.out.println(qu);
    }
}
