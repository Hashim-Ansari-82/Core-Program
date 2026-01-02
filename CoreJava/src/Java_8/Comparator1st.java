package Java_8;

import java.util.Set;
import java.util.TreeSet;

public class Comparator1st {
    public static void main(String[] args) {

        Set<Integer> s=new TreeSet<>();
        s.add(12);
        s.add(99);
        s.add(14);
        s.add(54);
        s.add(16);
        s.add(180);
        System.out.println("Before sorting Comparator "+s);
        Set<Integer> s1=new TreeSet<>((a,b) -> b-a);
        s1.add(12);
        s1.add(99);
        s1.add(14);
        s1.add(54);
        s1.add(16);
        s1.add(180);
        System.out.println("After sorting Comparator "+s1);


    }
}
