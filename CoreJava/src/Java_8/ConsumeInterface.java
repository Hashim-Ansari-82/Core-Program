package Java_8;

import java.util.*;
import java.util.function.Consumer;

public class ConsumeInterface {
    public static void main(String[] args) {

      //  Consumer<String> consumer= s -> System.out.println(s);
        Consumer<List<Integer>> listConsumer1= x -> {
            for(int i:x){
                System.out.println(i+100);
            }
        };
        Consumer<List<Integer>> listConsumer2= x -> {
            for(int i:x){
                System.out.println(i);
            }
        };
        Consumer<List<Integer>> listConsumer=listConsumer2.andThen(listConsumer1);
        listConsumer.accept(Arrays.asList(1,2,3,4,5));
    }
}
