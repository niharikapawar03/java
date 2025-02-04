import java.util.*;
public class collection5 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 2, 1);
        List<Integer> list2 = Arrays.asList(5, 4, 3, 4, 5, 1);
        System.out.println((isPalindrome(list1, 0, list1.size() - 1) ? "Yes" : "No"));
        System.out.println((isPalindrome(list2, 0, list2.size() - 1) ? "Yes" : "No"));
    }
    public static boolean isPalindrome(List<Integer> ls, int left, int right) {
        while (left < right) {
            if (!ls.get(left).equals(ls.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

