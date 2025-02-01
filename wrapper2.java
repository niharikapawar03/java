//write a java program to convert string into Integer double,long,charchter str"5"
public class wrapper2 {
    public static void main(String[] args) {
        String str="51";
        int a=Integer.parseInt(str);
        double b=Double.parseDouble(str);
        long c=Long.parseLong(str);
        char d=str.charAt(0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
