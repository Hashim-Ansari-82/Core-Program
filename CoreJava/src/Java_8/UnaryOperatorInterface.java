package Java_8;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {
    public static void main(String[] args) {

        UnaryOperator<Integer> unaryOperator= x -> x * x * x;
        System.out.println(unaryOperator.apply(3));

        UnaryOperator<String> unaryOperator1= String::toUpperCase;
        System.out.println(unaryOperator1.apply("Hashim"));

    }
}
