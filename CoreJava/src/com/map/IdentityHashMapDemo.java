package com.map;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {

        IdentityHashMap<Integer,String> i=new IdentityHashMap<>();

        /*Integer i1=Integer.valueOf(1000);
        Integer i2=Integer.valueOf(1000);
*/
        i.put(1000,"Hashim");
        i.put(1000,"Rani");
        System.out.println(i);
    }
}
