public class nonStaticNested {
    public static void main(String[] args) {
     Outer1 out =new Outer1();
     Outer1.Inner oin=out.new Inner();
     oin.display();
    }
}
class Outer1{
    private String name="nehu";
    class Inner{
        void display(){
            System.out.println(name);
        }
    }
}
