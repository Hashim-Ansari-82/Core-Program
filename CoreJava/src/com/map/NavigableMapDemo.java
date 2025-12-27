package com.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {

        NavigableMap<String,String> n=new TreeMap<>();

            n.put("a","Hashim");
            n.put("b","Mohsin");
            n.put("z","Qasim");
            n.put("x","Faheem");
            n.put("y","Mr Srk");
            n.put("n","Rani");
        System.out.println(n);
        System.out.println(n.ceilingKey("n"));
        System.out.println(n.floorKey("b"));
        System.out.println(n.higherKey("y"));
        System.out.println(n.lowerKey("x"));
        System.out.println(n.pollFirstEntry());
        System.out.println(n.pollLastEntry());
        System.out.println(n.descendingMap());
        System.out.println(n);
    }
}
