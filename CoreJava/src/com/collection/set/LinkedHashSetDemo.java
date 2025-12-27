package com.collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<Object> l=new LinkedHashSet<>();

        l.add('R');
        l.add(143);
        l.add("H");
        l.add(null);
        System.out.println("Size : "+l.size());
        System.out.println(l);
    }
}
