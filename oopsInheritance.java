public class oopsInheritance {

    public static void main(String[] args) {
        Student obj = new Student();
        obj.teach();
        obj.read();
//        obj.teach();
    }
}
class Teacher {
    void teach() {
        System.out.println("teaching");
    }
}
class Student extends Teacher {
    void read() {
        System.out.println("reading");
    }
}
