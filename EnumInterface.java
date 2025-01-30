public class EnumInterface {
    public static void main(String[] args) {
        InterEnum.Morning.message();
        InterEnum.Evening.message();
    }
}
interface Enum{
    void message();
}
enum InterEnum implements Enum{
    Morning{
        public void message(){
            System.out.println("GoodMorning");
        }
    },Evening{
        public void message(){
            System.out.println("GoodEvening");
        }
    }
}
