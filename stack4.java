import java.util.Stack;

//search an element in a stack without modifying it
public class stack4 {
    public static boolean searchEle(Stack<Integer> stk,int target){
        for(int ele:stk){
            if(ele==target){
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        stk.push(1);stk.push(2);stk.push(3);stk.push(4);stk.push(5);stk.push(6);
        if(searchEle(stk,5)){
            System.out.println("Element found");
        }else{
            System.out.println("not found");
        }
    }
}
