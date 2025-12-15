package com.concurrentcollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1st {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer,String> h=new ConcurrentHashMap<>();

        h.put(12,"Hashim");
        h.put(13,"143");
        h.put(14,"Rani");
        h.putIfAbsent(15,"Ansari");
        h.putIfAbsent(16,"S K");
        h.remove(15,"Ansari");
        h.replace(12,"Hashim","Hashim Ansari");
        System.out.println(h);
    }
}
