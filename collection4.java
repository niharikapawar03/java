import java.util.*;
public class collection4 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 4, 6, 8, 10, 12, 14);
        List<Integer> list2 = Arrays.asList(6, 8, 3, 5, 14, 9);
        List<Integer> commonElements = CommonFile(list1, list2);
        System.out.println("Common elements: " + commonElements);
    }
    public static List<Integer> CommonFile(List<Integer> ls1, List<Integer> ls2) {
        List<Integer> common = new ArrayList<>();
        for (int i = 0; i < ls2.size(); i++) {
            if (ls1.contains(ls2.get(i))) {
                common.add(ls2.get(i));
            }
        }
        return common;
    }
}