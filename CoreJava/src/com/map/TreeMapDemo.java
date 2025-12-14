package com.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer,Object> t=new TreeMap<>(new MyComparator());

        t.put(10,"Hashim");
        t.put(15,"Qasim");
        t.put(18,"Asim");
        t.put(11,143);
        t.put(12,"Rani");
        System.out.println(t);

    }
}
class MyComparator implements Comparator{

    public int compare(Object o1,Object o2){

        Integer i=(Integer)o1;
        Integer i1=(Integer)o2;
        if(i<i1){
            return +1;
        }
        else if(i>-i1){
            return -1;
        }
        else{
            return 0;
        }
    }
}