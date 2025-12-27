package com.exceptionhandling;

import java.util.*;

public class CMException extends Thread {

    static ArrayList<String> al=new ArrayList<>();

    public void run(){
        try{
           Thread.sleep(2000);
        }
        catch (InterruptedException e){}
        System.out.println("Child Thread Updating List");
        al.add("Hashim");
    }
    public static void main(String[] args)throws InterruptedException {

        al.add("Mohsin");
        al.add("Faheem");
        al.add("Mr Srk");
        al.add("Raiyyan");
        CMException e=new CMException();
        e.start();
        Iterator itr= al.iterator();
        while(itr.hasNext()){
            String s=(String)itr.next();
            System.out.println("Main Thread iterating Object and Current list is : "+s);
            Thread.sleep(3000);
        }
        System.out.println(al);
    }
}