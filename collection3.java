//write a program to remove duplicate element from a list (use list.contains(),list.remove())
import java.util.ArrayList;
import java.util.List;

public class collection3 {
    public static List<Integer> arrayList(List<Integer>arr){
        List<Integer> ls=new ArrayList<>();
        for(int i =0;i<arr.size();i++) {
            if(!ls.contains(arr.get(i))){
                ls.add(arr.get(i));
            }
        }return ls;
    }
    public static void main(String[] args) {
        List<Integer>ls=new ArrayList<>();
        ls.add(2);ls.add(4);ls.add(5);ls.add(2);ls.add(3);ls.add(8);ls.add(4);ls.add(2);ls.add(7);ls.add(3);ls.add(8);
        System.out.println(arrayList(ls));
    }
}
