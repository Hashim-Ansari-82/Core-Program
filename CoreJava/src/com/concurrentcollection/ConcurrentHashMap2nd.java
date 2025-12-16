package com.concurrentcollection;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap2nd extends Thread{

    static ConcurrentHashMap<Integer,String> h=new ConcurrentHashMap<>();

    public void run(){

        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){}
        System.out.println("Child Thread Update");
        h.put(14,"Rani");
    }

    public static void main(String[] args)throws InterruptedException {

        h.put(12,"Hashim");
        h.put(13,"143");
        ConcurrentHashMap2nd h1=new ConcurrentHashMap2nd();
        h1.start();
        Set s=h.keySet();
        Iterator itr=s.iterator();
        while(itr.hasNext()){
            Integer i=(Integer)itr.next();
            System.out.println("Main Thread Iterating Object And Current Thread is : "+i+"......."+h.get(i));
            Thread.sleep(3000);
        }
        System.out.println(h);
    }
}
