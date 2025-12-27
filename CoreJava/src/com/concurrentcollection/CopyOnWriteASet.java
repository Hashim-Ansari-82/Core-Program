package com.concurrentcollection;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteASet {
    public static void main(String[] args) {


        CopyOnWriteArraySet<Object> cow=new CopyOnWriteArraySet<>();
        cow.add("H");
        cow.add(143);
        cow.add("R");
        cow.add("N");
        cow.add(23.3);
        cow.add('W');
        cow.add("A");
        System.out.println(cow);
    }
}
