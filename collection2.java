import java.util.ArrayList;
import java.util.List;

//Write a program to print the diffrence of index ans element which are being started in a list.
public class collection2 {
    public static  List<Integer> arrayList(int arr[],int target){
        List<Integer> ls= new ArrayList<>();
        int left = 0;
        int right = arr.length-1;
        int ans = -1;
        while(left<=right) {
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                ans = mid;
                break;
            }
            if(arr[mid]<target){
                left = mid+1;
            }
            if(arr[mid]>target){
                right = mid-1;
            }
            for(int i=0;i<arr.length;i++){
                ls.add(arr[i]-target);
            }


        }return ls;
    }
    public static void main(String[] args) {
        int s[]={1,4,6,8,9,12,34};
        int target = 1;
        List<Integer> ans = arrayList(s,target);
        System.out.println(ans);
    }
}
