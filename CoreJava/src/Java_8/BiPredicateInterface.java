package Java_8;

import java.util.function.BiPredicate;

public class BiPredicateInterface {
    public static void main(String[] args) {

        BiPredicate<Integer,Integer> biPredicate=(x,y) -> x%2==0 && y%2==0;
        System.out.println(biPredicate.test(24,50));
        BiPredicate<String,Integer> biPredicate1=(x,y) -> x.length() == y;
        System.out.println(biPredicate1.test("hashim",6));

    }
}
