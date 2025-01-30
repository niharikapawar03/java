public class EnumOutside {
    public static void main(String[] args) {
        for(Engineering eng : Engineering.values()){
            System.out.println(eng);
        }
    }
}
enum Engineering{
    Mechanical,Electical, computer,robotics;
}