public class interfaceGenerics {
    public static void main(String[] args) {
        intergeneric<Integer> obj=new intergeneric<>();
        obj.display(42);
        intergeneric<String> obj1= new intergeneric<>();
        obj1.display("nehu");
    }
}
interface GenericClass<T>{
    void display(T data);
}
class intergeneric<T> implements GenericClass<T>{
    public void display(T data){
        System.out.println(data);
    }
}