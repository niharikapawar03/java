import java.util.Scanner;

//write a program to calculate number of vowel in a string using recursion
public class calcuteNoVowelRE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toLowerCase();
        int ans = countVowel(str, 0, 0);
        System.out.println(ans);

    }

    static int countVowel(String str, int index, int count) {
        if (index == str.length()) {
            return count;
        }
        char ch = str.charAt(index);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count = count + 1;
        }
        return countVowel(str, index + 1, count);
    }
}
