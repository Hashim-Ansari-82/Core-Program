package com.collection.set;

import java.util.TreeSet;
import java.util.Comparator;

public class TreeSetDemo3rd {
    public static void main(String[] args) {

        TreeSet<Object> t=new TreeSet<Object>(new Comparator1st());
        t.add(new StringBuffer("Hashim"));
        t.add(143);
        t.add(new StringBuffer("Rani"));
        t.add(new StringBuffer("Qasim"));
        t.add(new StringBuffer("Salim"));
        t.add(new StringBuffer("Asim"));
        t.add(("Tahir"));
        t.add(("Suhaib"));
        System.out.println("\n"+t);
    }
}
class Comparator1st implements Comparator{

    public int compare(Object o1,Object o2){

        String s1=o1.toString();
        String s2=o2.toString();

        return s2.compareTo(s1);
    }
}