import java.util.Optional;


public class optionalclass {
    public static void main(String[] args) {
        Optional<String> empty=Optional.empty();
        System.out.println(empty.isPresent());
        Optional<String> obj1=Optional.of("nehu");
        System.out.println(obj1.isPresent());
        Optional<String>obj2=Optional.of("dog");
        System.out.println(obj2.isPresent());
        Optional<String>obj3=Optional.empty();
        System.out.println(obj3.isPresent());
        Optional<String> obt=Optional.of("nehu");
        System.out.println(obt.get());
        Optional<String> obj4=Optional.ofNullable(null);
        System.out.println(obj4.isPresent());
    }
}
