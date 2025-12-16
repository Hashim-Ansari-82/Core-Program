package com.concurrentcollection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteAL2nd {
    public static void main(String[] args) {


        CopyOnWriteArrayList<String> cow=new CopyOnWriteArrayList<>();
        cow.add("H");
        cow.add("R");
        Iterator itr=cow.iterator();
        cow.add("N");
        while (itr.hasNext()){
            String s=(String)itr.next();
            System.out.println(s);
        }
    }
}
