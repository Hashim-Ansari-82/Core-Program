package com.collection.list;

import java.util.*;

public class ArraysAsListDemo {
    public static void main(String[] args) {

        String[] s={"H","N","R","M"};

        List l=Arrays.asList(s);
        System.out.println(l);
        s[3]="K";
        System.out.println(l);
        l.set(2,"143");
        for(String s1:s){
            System.out.println(s1);
        }
        l.add("Hashim");
        l.remove("143");
        l.set(1,new Integer(22));
    }
}
