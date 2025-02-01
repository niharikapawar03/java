public class wrapper {
    public static void main(String[] args) {
        Integer a=130;
        Integer b=130;
        if(a==(b)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
/*
when the object are in their respective cache range and both the object are having same value ,then if you'll be using "==" operator
it will give yes,although you are comparing the reference ,it will give true because for the same values no new object will be
created the next one will be having the refence of previous one.
so for this reason,100 is giving ture and 200 is giving false because the range of cache is (int -128 to 127)
 */