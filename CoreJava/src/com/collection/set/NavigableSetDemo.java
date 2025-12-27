package com.collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {

        NavigableSet<Integer> n=new TreeSet<>();
        n.add(1000);
        n.add(2000);
        n.add(3000);
        n.add(4000);
        n.add(5000);
        System.out.println(n);
        System.out.println(n.ceiling(3000));
        System.out.println(n.higher(2000));
        System.out.println(n.floor(5000));
        System.out.println(n.pollFirst());
        System.out.println(n.pollLast());
        System.out.println(n.descendingSet());
        System.out.println(n);
    }
}
