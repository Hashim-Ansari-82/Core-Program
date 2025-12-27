package com.concurrentcollection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteAL1 extends Thread{

   static CopyOnWriteArrayList<String> c=new CopyOnWriteArrayList<>();

    public void run(){
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){}
        System.out.println("Child Thread Update List");
        c.remove("H");

    }


    public static void main(String[] args)throws InterruptedException {

        c.add("H");
        c.add("R");

        CopyOnWriteAL1 c1=new CopyOnWriteAL1();
        c1.start();
        Iterator itr=c.iterator();
        while(itr.hasNext()){
            String s=(String)itr.next();
            System.out.println("main Thread iterate list and Current Object is : "+s);
            Thread.sleep(3000);
        }
        System.out.println(c);
    }
}
