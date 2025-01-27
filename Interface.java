public class Interface{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sleep();
        d.eat();
        d.move();
        d.recongize();
        d.run();
        d.sit();
    }
}
interface Animal2{
    public abstract void move();
    public abstract void recongize();
}
interface Animal1 {
   public abstract void sleep();
    public abstract void eat();
}
interface Animal3{
    public abstract void run();
    public abstract void sit();
}
class Dog implements Animal1,Animal2,Animal3{
    public void sleep(){
        System.out.println("Sleeping");
    }public void eat(){
        System.out.println("Eating");
    }public void move(){
        System.out.println("Moving");
    }public void recongize(){
        System.out.println("Reconginzing");
    }public void run(){
        System.out.println("Running");
    }public void sit(){
        System.out.println("Sitting");
    }
}
