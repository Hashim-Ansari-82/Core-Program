package Java_8;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String> m=new TreeMap<>();
        m.put(12,"Hashim");
        m.put(16,"Arsalan");
        m.put(14,"Zuhaib");
        System.out.println("Natural Sorting Order : "+m);
        Map<Integer,String> mm=new TreeMap<>((a,b) -> b-a);
        mm.put(12,"Hashim");
        mm.put(16,"Arsalan");
        mm.put(14,"Zuhaib");
        System.out.println("Custom Sorting Order : "+mm);
    }
}
