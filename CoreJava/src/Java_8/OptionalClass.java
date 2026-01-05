package Java_8;

import java.util.Optional;


public class OptionalClass {
    public static void main(String[] args) {

        Optional<String > name=getName();

        Optional<String> s = name.map(String::toUpperCase);
        System.out.println(s);
//        String ifPresent=name.orElse("na");
//        System.out.println(ifPresent);

        //name.ifPresent(System.out::println);
       // name.ifPresent(x -> System.out.println(x));


    }
    private static Optional<String> getName(){
//       String name=null;
//       return Optional.ofNullable(name);
        return Optional.of("hashim");
    }
}
