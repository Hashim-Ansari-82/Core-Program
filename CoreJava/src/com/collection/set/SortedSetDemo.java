package com.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {

        SortedSet<Object> s=new TreeSet<>();
        s.add("hasim");
        s.add("Hashim");
        s.add("Rani");
        s.add("N");
        s.add("H");
        System.out.println(s);
        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println(s.headSet("Rani"));
        System.out.println(s.tailSet("N"));
        System.out.println(s);
        System.out.println(s.subSet("Hashim","hasim"));
        System.out.println(s.comparator());
        System.out.println(s);

    }
}
