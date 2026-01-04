package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Streams {
    public static void main(String[] args) {

        List<String> list= Arrays.asList("Hashim","Koilsa","Sant Kabir Nagar");
        Stream<String> stream=list.stream();
        stream.forEach(System.out::println);

        System.out.println("...............................");

        String[] array={"Hashim","Koilsa","Sant Kabir Nagar"};
        Stream<String> stream1=Arrays.stream(array);
        stream1.forEach(System.out::println);

        System.out.println("...............................");

        Stream<String> stream2=Stream.of("Hashim","Ansari");
        stream2.forEach(System.out::println);


        System.out.println("...............................");

        Stream<Integer> stream3=Stream.iterate(0,n -> n + 1).limit(5);
        stream3.forEach(System.out:: println);

        System.out.println("...............................");

        Stream<Integer> stream4=Stream.generate(() -> (int) (Math.random()*10)).limit(5);
        stream4.forEach(System.out:: println);
    }
}

