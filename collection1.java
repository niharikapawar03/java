import java.util.ArrayList;
import java.util.List;

//WAP to print the elemnet of a list which are the occurance of a target elemnt in an array.
public class collection1 {
    public static  List<Integer> arrayList(int arr[],int target){
        List<Integer> ls= new ArrayList<>();
        for(int i =0;i<arr.length;i++) {
            if (arr[i] == target) {
                ls.add(i);
            }
        }
            if (ls.size()==0){
                ls.add(-1);

        }return ls;
    }
    public static void main(String[] args) {
        int s[]={1,4,2,5,6,7,4,7};
        int target = 1;
        List<Integer> ans = arrayList(s,target);
        System.out.println(ans);
    }
}
