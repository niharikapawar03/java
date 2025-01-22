public class BinarySearch {
    public static int binarySearch(int[] arr,int target){
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                h=mid-1;
            }else if(arr[mid]<target){
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        int target=120;
        binarySearch(arr,target);
        System.out.println(binarySearch(arr,target));
    }
}