public class EnumConstructor {
    public static void main(String[] args) {
        System.out.println(Animal.h4.dispaly());
    }
}
enum Animal {
    h1(23), h2(55), h3(45), h4(34);

    private int heigth;

    Animal(int heigth) {
        this.heigth = heigth;
    }

    int dispaly() {
        return heigth;
    }
}