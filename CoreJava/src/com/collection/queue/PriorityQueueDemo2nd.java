package com.collection.queue;

import java.util.*;

public class PriorityQueueDemo2nd {
    public static void main(String[] args) {

        PriorityQueue<String> q = new PriorityQueue<>(15, new MyComparator());

        q.offer("H");
        q.offer("R");
        q.offer("N");
        q.offer("Z");
        q.offer("M");
        q.offer("A");
        q.offer("S");
        q.offer("L");
        System.out.println(q);

    }
}
    class MyComparator implements Comparator{

        public int compare(Object o1, Object o2){
            String s1=(String)o1;
            String s2=o2.toString();
            return s2.compareTo(s1);
        }
    }
