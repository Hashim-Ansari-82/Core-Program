package com.garbagecollector;

public class FinalizedMethod{

    static FinalizedMethod s;
    public static void main(String[] args)throws InterruptedException {

        FinalizedMethod f=new FinalizedMethod();
        System.out.println(f.hashCode());
        f=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(s.hashCode());
        s=null;
        System.gc();
        Thread.sleep(10000);
        System.out.println("Main method end");
    }
    public void finalize(){
        System.out.println("Finalized method executed");
        s=this;
    }
}
