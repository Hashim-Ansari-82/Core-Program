package Java_8;

import java.util.function.BiFunction;

public class BiFunctionInterface {
    public static void main(String[] args) {

        BiFunction<String,String,Integer> biFunction=(x,y) -> x.length()+y.length();
        System.out.println(biFunction.apply("Hashim","Koilsa"));
    }
}
