import java.util.Stack;

//write the program to check that given element is available in the stack or not(Serching in a stack).
public class searchingStack {
    public static boolean search(int []arr,int target){
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<arr.length;i++){
            stk.push(arr[i]);
        }
        while(!stk.empty()){
            if(stk.pop()==target){
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        int []n={1,2,5,7,8,9};
        int target=8;
        System.out.println(search(n,target));
    }
}
