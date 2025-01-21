public class multipleInheritance {

    public static void main(String[] args) {
        Sum obj = new Sum(); // Changed to Nehu to access dance()
        obj.teach();           // Method from Teacher class
        obj.vege();            // Method from Student class
        obj.nonvege();
        obj.calculate();
    }
}

class food{
    void teach() {
        System.out.println("teaching");
    }
}

class Veg extends food  {
    void vege() {
        System.out.println("vegan");
    }
}

class Nonveg extends Veg {
    void nonvege() {
        System.out.println("not vegan");
    }
}
class Sum extends Nonveg{
    void calculate(){
        System.out.println("calculating");
    }
}