package com.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo1st {


        public static void main(String[] args) {

            PriorityQueue<Integer> q=new PriorityQueue<>();
            System.out.println(q.peek());
           // System.out.println(q.element());
            for(int i=1; i<=10; i++){
                q.offer(i);
            }
            System.out.println(q);
            System.out.println(q.poll());
            System.out.println(q);
        }
}
