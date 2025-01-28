public class LocalInnerClass {
    public static void main(String[] args) {
        Outer2 out=new Outer2();
        out.InnerMethod();
    }
}
class Outer2{
    void InnerMethod(){
        String name="nehu";
        class Inner2{
            void display(){
                System.out.println(name);
            }
        }
        Inner2 In=new Inner2();
        In.display();
    }
}