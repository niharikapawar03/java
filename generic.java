public class generic {
    public static void main(String[] args) {
        genericClass<Integer> obj= new genericClass<>();
        obj.setdata(45,25);
        System.out.println(obj.getFirst());
        System.out.println(obj.getSecond());
        genericClass<Integer> obj1=new genericClass<>();
        obj1.setdata(5,7);
        System.out.println(obj1.getFirst());
        System.out.println(obj1.getSecond());
    }
}
class genericClass<T>{
    T data1;
    T data2;
    void setdata(T data1,T data2){
        this.data1=data1;
        this .data2=data2;
    }
    T getFirst(){
        return data1;
    }
    T getSecond(){
        return data2;
    }
}
