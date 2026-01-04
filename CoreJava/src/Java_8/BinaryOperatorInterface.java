package Java_8;

import java.util.function.*;

public class BinaryOperatorInterface {
    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator= (x,y) -> x * x * x + y*y;
        System.out.println(binaryOperator.apply(3,3));

        BinaryOperator<String> binaryOperator1= (x,y) -> x+y;
        System.out.println(binaryOperator1.apply("Hashim"," Ansari"));

    }
}
