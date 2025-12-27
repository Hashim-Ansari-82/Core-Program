package com.concurrentcollection;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteAL {
    public static void main(String[] args) {

        ArrayList<String> al=new ArrayList<>();
        al.add("H");
        al.add("N");
        System.out.println(al);
        CopyOnWriteArrayList<String> cow=new CopyOnWriteArrayList<>();
        cow.addIfAbsent("H");
        cow.addIfAbsent("R");
        cow.addAll(al);
        System.out.println(cow);
        ArrayList<String> al1=new ArrayList<>();
        al1.add("H");
        al1.add("M");
        cow.addAllAbsent(al1);
        System.out.println(cow);
    }
}
