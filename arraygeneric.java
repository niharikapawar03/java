public class arraygeneric {
    public static void main(String[] args) {
        genericClass1<int[]> obj3=new genericClass1<>();
        obj3.setdata(new int[]{1,2,3,4,5});
        System.out.println(obj3.getFirst()[0]);
    }
}
class genericClass1<T>{
    T data1;
    void setdata(T data1){
        this.data1=data1;
    }
    T getFirst(){
        return data1;
    }
}
