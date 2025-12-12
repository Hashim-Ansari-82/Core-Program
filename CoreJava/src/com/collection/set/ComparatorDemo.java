package com.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

class TreeSet1st {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<Integer>(new ComparatorDemo());
        ts.add(23);
        ts.add(54);
        ts.add(12);
        ts.add(40);
        ts.add(25);
        ts.add(3);
        System.out.println(ts);
    }

}
public class ComparatorDemo implements Comparator {
     
    public int compare(Object obj1,Object obj2){

        Integer i=(Integer)obj1;
        Integer i1=(Integer)obj2;
        return -i.compareTo(i1);
        /* return i.compareTo(i1);
        if(i<i1){
            return +1;
        }
        else if(i>i1){
            return -1;
        }
        else{
            return 0;
        }
         if(i<i1){
            return -1;
        }
        else if(i>i1){
            return +1;
        }
        else{
            return 0;
        }*/
    }
    
}
