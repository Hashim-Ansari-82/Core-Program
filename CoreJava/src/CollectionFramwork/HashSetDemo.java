package CollectionFramwork;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<Object> h=new HashSet<>();
        h.add("H");
        h.add(143);
        h.add('R');
        h.add(null);
        System.out.println(h.add('R'));
        System.out.println(h);
    }
}
