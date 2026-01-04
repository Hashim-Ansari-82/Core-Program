package Java_8;

import java.util.function.BiConsumer;

public class BiConsumerInterface {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer=(x,y) -> {
            System.out.println(x+y);
        };
        biConsumer.accept(12,48);
    }
}
