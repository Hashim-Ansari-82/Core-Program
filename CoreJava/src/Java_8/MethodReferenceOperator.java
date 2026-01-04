package Java_8;

import java.util.*;

public class MethodReferenceOperator {

    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
       List<String> list= Arrays.asList("Hashim","Mohsin","Faheem");
       list.forEach(MethodReferenceOperator::print);
    }
}
