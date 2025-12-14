package com.map;

import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {

        SortedMap<Integer,Object>  s=new TreeMap<>();
             s.put(12,"Hashim");
             s.put(11,"Rani");
             s.put(15,"Zuhaib");
             s.put(9,"Hashim");
             s.put(10,143);

        System.out.println(s);
        System.out.println(s.tailMap(11));
        System.out.println(s.headMap(15));
        System.out.println(s.subMap(10,143));
        System.out.println(s.comparator());
        System.out.println(s.firstKey());
        System.out.println(s.lastKey());
        System.out.println(s.values());
        System.out.println(s.keySet());
    }
}
