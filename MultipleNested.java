public class MultipleNested {
    public static void main(String[] args) {
        Outer.Inner obj=new Outer.Inner(4,2);
        obj.move();
        obj.write();
    }
}
class Outer{
    static class Inner{
        private int legs;
        private int hands;
        Inner(int legs,int hands){
            this.legs=legs;
            this.hands=hands;
        }
        void move() {
            System.out.println(legs);
        }void write(){
            System.out.println(hands);
        }
    }
}
