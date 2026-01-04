package Java_8;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        Supplier<String> supplier=()-> "Hashim";
        System.out.println(supplier.get());
    }
}
