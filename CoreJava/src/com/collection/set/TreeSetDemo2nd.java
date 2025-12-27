package com.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2nd {
    public static void main(String[] args) {

        TreeSet<String> t=new TreeSet<>(new MyComparator());
        t.add("Hashim");
        t.add("Rani");
        t.add("Qasim");
        t.add("Salim");
        System.out.println(t);
    }
}
class MyComparator implements Comparator {

    public int compare(Object o1,Object o2){

        String s1=o1.toString();
        String s2=(String)o2;
        return s2.compareTo(s1);

    }
}
